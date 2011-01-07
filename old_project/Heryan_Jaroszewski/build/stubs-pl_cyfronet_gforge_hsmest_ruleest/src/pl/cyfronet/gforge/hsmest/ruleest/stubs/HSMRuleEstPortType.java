/**
 * HSMRuleEstPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Feb 27, 2008 (08:34:14 CST) WSDL2Java emitter.
 */

package pl.cyfronet.gforge.hsmest.ruleest.stubs;

public interface HSMRuleEstPortType extends java.rmi.Remote {
    public pl.cyfronet.gforge.hsmest.ruleest.stubs.Estimation estimateRead(java.lang.String fileName) throws java.rmi.RemoteException;
    public org.oasis.wsrf.properties.GetResourcePropertyResponse getResourceProperty(javax.xml.namespace.QName getResourcePropertyRequest) throws java.rmi.RemoteException, org.oasis.wsrf.properties.InvalidResourcePropertyQNameFaultType, org.oasis.wsrf.properties.ResourceUnknownFaultType;
}
