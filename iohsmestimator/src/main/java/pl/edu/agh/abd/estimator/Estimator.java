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
        public final static String CONFIGURATION_PATH = "./conf/properties.xml";

        public final static int USAGE_UNKNOWN = 0;
	public final static int USAGE_EMPTY = 1;
	public final static int USAGE_INUSE = 2;
	public final static int USAGE_IDLE = 3;

	private HSMMonPortType monitoringDevice ;
	private Properties properties;
        private Map<String, Tape> tapes;

	public Estimator(HSMMonPortType ms){
		monitoringDevice = ms;
        properties = new Properties();
        try {
            properties.loadFromXML(new FileInputStream(new File(CONFIGURATION_PATH)));
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        ;//(CONFIGURATION_PATH);
    }

        public Map<String, Tape> getTapeMap() throws RemoteException {
            if (tapes == null) {
		tapes = new TreeMap<String, Tape>();
                for(Tape t: monitoringDevice.getHSMTapeMap()) {
                    tapes.put(t.getTapeID(), t);
                }
            }
            return tapes;
        }

	public Estimation estimate(String fileName) throws RemoteException {
		Estimation estimatedValues = null;

		float latency = 0;
		float bandwidth = 0;
		int fileSize = 0;

                float blockBandwidth = 0;

		HSMFileInfo fileInfo = monitoringDevice.getHSMFileInfo(fileName);
                if(fileInfo == null)
                    return null;
                getTapeMap();
		StorageSystemInfo systemInfo = monitoringDevice.getStorageSystemInfo();
		HSMState systemState = monitoringDevice.getHSMState();
		HSMDriveState[] drivesState = systemState.getDrive();
		Tape tapeWithFile = tapes.get(fileInfo.getTapeID());

		//Calculating file size
		fileSize = (fileInfo.getEndBlock()-fileInfo.getStartBlock()); //*tapeWithFile.getBlockSize(); // file size = (endBlock-startBlock)*BlockSize;
		//Calculating bandwidth
		//bandwidth = systemInfo.getMeasuredTranserRate();
		bandwidth = systemInfo.getTransferRates()[0].getMeasuredTransferRate();
                blockBandwidth = bandwidth * 1024.0f * 1024.0f;// / tapeWithFile.getBlockSize();

		//If file is cached latency = fileSize/bandwidth + cached latency
		if (fileInfo.isIsCached()){
			latency = fileSize/blockBandwidth + Float.parseFloat((String)properties.get("Cached latency"));
			estimatedValues = new Estimation(bandwidth, latency, fileSize);
			return estimatedValues;
		}

		//If file is not cached and tape is not in drive and empty driver of same type as tape exists
		if (isEmptyDrive(drivesState,tapeWithFile.getMediaType())&&!isLoaded(drivesState,tapeWithFile.getTapeID())){
			latency = fileSize/blockBandwidth + Float.parseFloat((String)properties.get("Positioning latency"))+Float.parseFloat((String)properties.get("Load tape latency"));
			estimatedValues = new Estimation(bandwidth, latency, fileSize);
			return estimatedValues;
		}

		//If file is not cached and tape is in drive, and there are no files in queue
		if (isLoaded(drivesState,tapeWithFile.getTapeID()) && systemState.getFileQueue().length==0){
			latency = fileSize/blockBandwidth + Float.parseFloat((String)properties.get("Positioning latency"));
			estimatedValues= new Estimation(bandwidth, latency, fileSize);
			return estimatedValues;
		}

		//If file is not cached and tape is not in drive, and empty driver doesn't exists, but there is drive with tape which is not in use
                HSMFileInfo[] filesInQueue = (HSMFileInfo[]) systemState.getFileQueue();
		if(!fileInfo.isIsCached() && !isEmptyDrive(drivesState, tapeWithFile.getMediaType()) && (filesInQueue == null || filesInQueue.length==0)) {
			latency = fileSize/blockBandwidth + Float.parseFloat((String)properties.getProperty("Unload tape latency")) + Float.parseFloat((String)properties.get("Positioning latency")) + Float.parseFloat((String)properties.get("Load tape latency"));
		}


		//If file is not cached and there are some files in queue
		if (filesInQueue != null && filesInQueue.length!=0){
			int totalFilesSize = 0;
			int totalTapeChanges = 0;
			int totalTapePositionings = 0;
			Tape prevTape = null;
			HSMFileInfo[] fileQueue = systemState.getFileQueue();
			for (int i=0; i<fileQueue.length; i++){
				if (tapes.get(fileQueue[i].getTapeID()).getMediaType() == tapeWithFile.getMediaType() ){
					HSMFileInfo currentFile = fileQueue[i];
					Tape currentTape = tapes.get(currentFile.getTapeID());
					totalFilesSize += (currentFile.getEndBlock() - currentFile.getStartBlock());// * currentTape.getBlockSize() ;
					totalTapePositionings++;
					if(prevTape == null){
						if(!isLoaded(drivesState,currentTape.getTapeID()))
							totalTapeChanges++;
					}else{
						if (!prevTape.getTapeID().equals(currentTape.getTapeID()))
							totalTapeChanges++;
					}

				}
			}
			latency = fileSize/blockBandwidth+totalFilesSize/blockBandwidth+totalTapeChanges*Float.parseFloat((String)properties.get("Load tape latency"))+totalTapePositionings*Float.parseFloat((String)properties.get("Positioning latency"));
		}

                estimatedValues = new Estimation(bandwidth, latency, fileSize);
                return estimatedValues;
	}

	// Checks if tape with tape ID in one of drives
	private boolean isLoaded(HSMDriveState[] drivesState, String tapeID) {
		for (int i=0; i<drivesState.length; i++)
			if(drivesState[i].getTapeID().equals(tapeID))
				return true;
		return false;
	}

	// Checkes if is any empty drive with
	private boolean isEmptyDrive(HSMDriveState[] drives, String type) {
		for (int i=0; i< drives.length; i++)
			if (drives[i].getMediaType()==type && (drives[i].getUsage() == USAGE_IDLE || drives[i].getUsage() == USAGE_EMPTY))
				return true;
		return false;
	}
}
