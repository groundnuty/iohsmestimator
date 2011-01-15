package pl.edu.agh.abd.estimator;

import pl.edu.agh.abd.estimator.mocks.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;


public class Estimator {

	private HSMMonitoringStub monitoringDevice ;


	public Estimator(HSMMonitoringStub ms){
		monitoringDevice = ms;
    }

	public Estimation estimate(String fileName) {
		Estimation estimatedValues = null;

		float latency = 0;
		float bandwidth = 0;
		int fileSize = 0;

        float blockBandwidth = 0;

		HSMFileInfo fileInfo = monitoringDevice.getHSMFileInfo(fileName);
		
		//Calculating file size
		fileSize = (fileInfo.getEndBlock()-fileInfo.getStartBlock()); //*tapeWithFile.getBlockSize(); // file size = (endBlock-startBlock)*BlockSize;
		//Calculating bandwidth
		//bandwidth = systemInfo.getMeasuredTranserRate();
		bandwidth = monitoringDevice.getSystemTransferRate();
                blockBandwidth = bandwidth * 1024.0f * 1024.0f;// / tapeWithFile.getBlockSize();

		//If file is cached latency = fileSize/bandwidth + cached latency
		if (fileInfo.isIsCached()){
			latency = fileSize/blockBandwidth + monitoringDevice.getCachedLatency();
			estimatedValues = new Estimation(bandwidth, latency, fileSize);
			return estimatedValues;
		}

		//If file is not cached and tape is not in drive and empty driver of same type as tape exists
		if (monitoringDevice.areThereAnyEmptyDrives() &&!fileInfo.isTapeWithFileInDrive()){
			latency = fileSize/blockBandwidth + monitoringDevice.getPositioningLatency()+monitoringDevice.getLoadTapeLatency();
			estimatedValues = new Estimation(bandwidth, latency, fileSize);
			return estimatedValues;
		}

		//If file is not cached and tape is in drive, and there are no files in queue
		if (fileInfo.isTapeWithFileInDrive() && monitoringDevice.getFileQueueSize()==0){
			latency = fileSize/blockBandwidth + monitoringDevice.getPositioningLatency();
			estimatedValues= new Estimation(bandwidth, latency, fileSize);
			return estimatedValues;
		}

		//If file is not cached and tape is not in drive, and empty driver doesn't exists, but there is drive with tape which is not in use

		if(!fileInfo.isIsCached() && !monitoringDevice.areThereAnyEmptyDrives() && monitoringDevice.getFileQueueSize()==0) {
			latency = fileSize/blockBandwidth + monitoringDevice.getUnloadTapeLatency() + monitoringDevice.getPositioningLatency() + monitoringDevice.getLoadTapeLatency();;
		}


		//If file is not cached and there are some files in queue
		if (monitoringDevice.getFileQueueSize()!=0){
			int totalFilesSize = 0;
			int totalTapeChanges = 0;
			int totalTapePositionings = 0;
			HSMFileInfo prevTape = null;
			HSMFileInfo[] fileQueue = monitoringDevice.getFilesInAQueue();
			for (int i=0; i<fileQueue.length; i++){
				if (fileQueue[i].getMediaType().equals(fileInfo.getMediaType())){
					HSMFileInfo currentFile = fileQueue[i];
					totalFilesSize += (currentFile.getEndBlock() - currentFile.getStartBlock());// * currentTape.getBlockSize() ;
					totalTapePositionings++;
					if(prevTape == null){
						if(fileInfo.isTapeWithFileInDrive())
							totalTapeChanges++;
					}else{
						if (!prevTape.getTapeID().equals(fileQueue[i].getTapeID()))
							totalTapeChanges++;
					}

				}
			}
			latency = fileSize/blockBandwidth+totalFilesSize/blockBandwidth+totalTapeChanges*monitoringDevice.getLoadTapeLatency() +totalTapePositionings*monitoringDevice.getPositioningLatency();
		}

                estimatedValues = new Estimation(bandwidth, latency, fileSize);
                return estimatedValues;
	}

	// Checks if tape with tape ID in one of drives
	/*private boolean isLoaded(HSMDriveState[] drivesState, String tapeID) {
		for (int i=0; i<drivesState.length; i++)
			if(drivesState[i].getTapeID().equals(tapeID))
				return true;
		return false;
	}*/

	// Checkes if is any empty drive with
	/*private boolean isEmptyDrive(HSMDriveState[] drives, String type) {
		for (int i=0; i< drives.length; i++)
			if (drives[i].getMediaType()==type && (drives[i].getUsage() == USAGE_IDLE || drives[i].getUsage() == USAGE_EMPTY))
				return true;
		return false;
	}*/
}
