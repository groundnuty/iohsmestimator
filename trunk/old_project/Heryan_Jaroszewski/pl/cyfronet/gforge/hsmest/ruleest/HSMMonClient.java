package pl.cyfronet.gforge.hsmest.hsmmon;

import org.apache.axis.message.addressing.Address;
import org.apache.axis.message.addressing.EndpointReferenceType;
import org.apache.axis.types.URI.MalformedURIException;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.LibrariesInfo;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMMonPortType;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.service.HSMMonServiceAddressingLocator;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.service.HSMMonFactoryServiceAddressingLocator;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMMonFactoryPortType;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.CreateResource;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.CreateResourceResponse;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.VoidType;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.StorageSystemInfo;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMFileInfo;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMState;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMLibrary;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.TapeArray;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.Drive;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.Slot;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.Tape;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.TapeArray;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMDriveState;

public class HSMMonClient {
	public final static int FULLBU = 0;					//stale
	public final static int PARTBU = 1;
	public final static int CACHE = 2;
	public final static int MIGRAT = 3;
	public final static int REPACK = 4;
	public final static int UNUSED = 5;
	public final static int UNKNOWN = -1;
	
	HSMMonPortType hsmMon;
	
	public HSMMonClient(String address){
        }
        
        public void actionPerformed(ActionEvent e) {
            long start = System.currentTimeMillis();
                try {
                    HSMState state = getResource().getHSMState(new VoidType());
                        
                        HSMFileInfo file;
                        if (state.getFileQueue() != null) {
                            for(int i = 0; i < state.getFileQueue().length; i++) {
                                file = state.getFileQueue()[i];
                                    results.append("HSMFileInfo [" + i + "]\n\tstartBlock " + file.getStartBlock() + 
                                            "\n\tendBlock " + file.getEndBlock() + "\n\ttapeID " + file.getTapeID() + 
                                            "\n\tisCached " + file.isIsCached() + "\n\tname " + file.getName() + "\n");
                            }
                        }
                        else {
                            results.append("HSMFileInfo null\n");
                        }
                    
                        HSMDriveState driveState;
                        if (state.getDrive() != null) {
                            for(int i = 0; i < state.getDrive().length; i++) {
                                driveState = state.getDrive()[i];
                                    results.append("HSMDriveState [" + i + "]\n\tid " + driveState.getId() + "\n\tmediaType " + driveState.getMediaType() +
                                            "\n\tcurrentPosition " + driveState.getCurrentPosition() + 
                                            "\n\tusage " + driveState.getUsage() + "\n\ttapeId " + driveState.getTapeID() + "\n");
                            }
                        }
                        else {
                            results.append("HSMDriveState null\n");
                        }
                    
                } catch (Exception ex) {
                    results.append("\nBlad w polaczeniu z serwisem - upewnij sie czy podales poprawny adres serwisu.\nJesli tak odczekaj chwile.");
                }
            long end = System.currentTimeMillis();
                writeTime(start, end, results);
        }
			public void actionPerformed(ActionEvent e) {
				long start = System.currentTimeMillis();
				try {
					HSMFileInfo file = getResource().getHSMFileInfo(fileInfoTxt.getText());
					
					results.append("HSMFileInfo\n\tstartBlock " + file.getStartBlock() + 
							"\n\tendBlock " + file.getEndBlock() + "\n\ttapeID " + file.getTapeID() + 
							"\n\tisCached " + file.isIsCached() + "\n\tname " + file.getName() + "\n");
					
				} catch (Exception ex) {
					results.append("\nBlad w polaczeniu z serwisem - upewnij sie czy podales poprawny adres serwisu.\nJesli tak odczekaj chwile.");
					results.append(ex.toString());
				}
				long end = System.currentTimeMillis();
				writeTime(start, end, results);
			}
			
		});
		panel2.add(fileInfoOkBtn);
		panel.add(panel2);
		con.add(panel,BorderLayout.WEST);
		
		results.setEditable(false);
		results.setText("Informacje dotyczace serwisu:");
		results.setSize(200, 200);
		con.add(new JScrollPane(results),BorderLayout.CENTER);
		
		if (address == null)
			address = "Adres grid-serwisu";
		
		serviceAdres = new JTextField(address);
		
		frame.add(serviceAdres,BorderLayout.SOUTH);
		frame.pack();
		frame.setLocationRelativeTo( null );
		frame.setVisible(true);
		
		//TODO przeoribc dziedziczenie aby nie bylo tylu action listenerow
		
	}
	
	public static void main(String[] args){
		String address = null;
		if (args.length > 0)
			address = args[0];
		new HSMMonClient(address);
	}
	
	private HSMMonPortType getResource() {
		if (hsmMon == null) {
			HSMMonFactoryServiceAddressingLocator factoryLocator = new HSMMonFactoryServiceAddressingLocator();
			HSMMonServiceAddressingLocator instanceLocator = new HSMMonServiceAddressingLocator();
			
			try {
				String factoryURI = serviceAdres.getText();
				EndpointReferenceType factoryEPR, instanceEPR;
				HSMMonFactoryPortType hsmMonFactory;
				
				factoryEPR = new EndpointReferenceType();
				factoryEPR.setAddress(new Address(factoryURI));
				hsmMonFactory = factoryLocator.getHSMMonFactoryPortTypePort(factoryEPR);
				results.append("\n Probuje odczytac dane o bibliotekach ze zrodla ...\n");
				CreateResource c = new CreateResource();
				CreateResourceResponse createResponse = hsmMonFactory.createResource(new CreateResource());
				instanceEPR = createResponse.getEndpointReference();
				hsmMon = instanceLocator.getHSMMonPortTypePort(instanceEPR);
		
			} catch (MalformedURIException ex ){
				results.append("\nBledny adres URL");
			} catch (Exception ex) {
				results.append("\nBlad w polaczeniu z serwisem - upewnij sie czy podales poprawny adres serwisu.\nJesli tak odczekaj chwile.");
			}
		}
		return hsmMon;
	}
	
	JFrame frame;
	JTextField fileInfoTxt,serviceAdres;
	JButton systemInfoOkBtn,fileInfoOkBtn,stateOkBtn,libraryInfoOkBtn,tapeMapOkBtn;
	JPanel panel;
	JLabel title;
	JTextArea results;
	
	
	private void writeTime(long start, long end, JTextArea textArea) {
		textArea.append("\n" + "time: " + (end - start) + " ms\n");
	}
}



