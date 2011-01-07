/**
 * HSMMonPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Mar 03, 2006 (12:17:06 EST) WSDL2Java emitter.
 */

package pl.cyfronet.gforge.hsmest.hsmmon.stubs;

public interface HSMMonPortType extends java.rmi.Remote {
    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.StorageSystemInfo getStorageSystemInfo(pl.cyfronet.gforge.hsmest.hsmmon.stubs.VoidType parametersSSI) throws java.rmi.RemoteException;
    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMFileInfo getHSMFileInfo(java.lang.String parametersFI) throws java.rmi.RemoteException;
    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMState getHSMState(pl.cyfronet.gforge.hsmest.hsmmon.stubs.VoidType parametersS) throws java.rmi.RemoteException;
    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.LibrariesInfo getHSMLibraryInfo(pl.cyfronet.gforge.hsmest.hsmmon.stubs.VoidType parametersLI) throws java.rmi.RemoteException;
    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.TapeArray getHSMTapeMap(pl.cyfronet.gforge.hsmest.hsmmon.stubs.VoidType parametersTM) throws java.rmi.RemoteException;
    public org.oasis.wsrf.properties.GetResourcePropertyResponse getResourceProperty(javax.xml.namespace.QName getResourcePropertyRequest) throws java.rmi.RemoteException, org.oasis.wsrf.properties.InvalidResourcePropertyQNameFaultType, org.oasis.wsrf.properties.ResourceUnknownFaultType;
}
