package pl.edu.agh.abd.estimator;

import pl.edu.agh.abd.estimator.mocks.*;
import pl.edu.agh.storage.estimation.hsmclient.HSMFile;



public class Estimator {

	private HSMMonitoringStub monitoringDevice ;


	public Estimator(HSMMonitoringStub ms){
		monitoringDevice = ms;
    }

	public Estimation estimate(String fileName) {
		Estimation estimatedValues = null;

		float latency = 0;
		float bandwidth = 0;
		long fileSize = 0;

        float blockBandwidth = 0;

		HSMFile fileInfo = monitoringDevice.getHSMFile(fileName);
		String blockSize = new Integer(monitoringDevice.getBlockSize(fileInfo.getTapeID())).toString() ;

		//Calculating file size
		fileSize = fileInfo.getFileSize() ;
        System.out.println(fileSize);
		//Calculating bandwidth
		//bandwidth = systemInfo.getMeasuredTranserRate();
		bandwidth = monitoringDevice.currentTransferRate ;
                blockBandwidth = monitoringDevice.getSystemTransferRate() * 1024.0f * 1024.0f;// / tapeWithFile.getBlockSize();

		//If file is cached latency = fileSize/bandwidth + cached latency
		if (fileInfo.isFileCached()){
			latency = fileSize/blockBandwidth + monitoringDevice.getCachedLatency();
			estimatedValues = new Estimation(bandwidth, latency, fileSize, fileName, blockSize);
			return estimatedValues;
		}

		//If file is not cached and tape is not in drive and empty driver of same type as tape exists
		if (monitoringDevice.areThereAnyEmptyDrives() &&!monitoringDevice.isTapeDrive(fileInfo.getTapeID())){
			latency = fileSize/blockBandwidth + monitoringDevice.getPositioningLatency()+monitoringDevice.getLoadTapeLatency();
			estimatedValues = new Estimation(bandwidth, latency, fileSize, fileName, blockSize);
			return estimatedValues;
		}

		//If file is not cached and tape is in drive, and there are no files in queue
		if (monitoringDevice.isTapeDrive(fileInfo.getTapeID()) && monitoringDevice.getFileQueueSize()==0){
			latency = fileSize/blockBandwidth + monitoringDevice.getPositioningLatency();
			estimatedValues= new Estimation(bandwidth, latency, fileSize, fileName, blockSize);
			return estimatedValues;
		}

		//If file is not cached and tape is not in drive, and empty driver doesn't exists, but there is drive with tape which is not in use

		if(!fileInfo.isFileCached() && !monitoringDevice.areThereAnyEmptyDrives() && monitoringDevice.getFileQueueSize()==0) {
			latency = fileSize/blockBandwidth + monitoringDevice.getUnloadTapeLatency() + monitoringDevice.getPositioningLatency() + monitoringDevice.getLoadTapeLatency();;
		}


		//If file is not cached and there are some files in queue
		if (monitoringDevice.getFileQueueSize()!=0){
			int totalFilesSize = 0;
			int totalTapeChanges = 0;
			int totalTapePositionings = 0;
			HSMFile prevTape = null;
			HSMFile[] fileQueue = monitoringDevice.getFilesInAQueue();
			for (int i=0; i<fileQueue.length; i++){
					HSMFile currentFile = fileQueue[i];
					totalFilesSize += (currentFile.getEndBlock() - currentFile.getStartBlock());// * currentTape.getBlockSize() ;
					totalTapePositionings++;
					if(prevTape == null){
						if(monitoringDevice.isTapeDrive(fileInfo.getTapeID()))
							totalTapeChanges++;
					}else{
						if (!prevTape.getTapeID().equals(fileQueue[i].getTapeID()))
							totalTapeChanges++;
					}
			}
			latency = fileSize/blockBandwidth+totalFilesSize/blockBandwidth+totalTapeChanges*monitoringDevice.getLoadTapeLatency() +totalTapePositionings*monitoringDevice.getPositioningLatency();
		}

                estimatedValues = new Estimation(bandwidth, latency, fileSize, fileName, blockSize);
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
