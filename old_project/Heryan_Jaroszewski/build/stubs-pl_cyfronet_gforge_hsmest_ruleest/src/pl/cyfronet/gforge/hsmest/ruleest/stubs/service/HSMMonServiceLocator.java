/**
 * HSMMonServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Feb 27, 2008 (08:34:14 CST) WSDL2Java emitter.
 */

package pl.cyfronet.gforge.hsmest.ruleest.stubs.service;

public class HSMMonServiceLocator extends org.apache.axis.client.Service implements pl.cyfronet.gforge.hsmest.ruleest.stubs.service.HSMMonService {

    public HSMMonServiceLocator() {
    }


    public HSMMonServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HSMMonServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HSMRuleEstPortTypePort
    private java.lang.String HSMRuleEstPortTypePort_address = "http://localhost:8080/wsrf/services/";

    public java.lang.String getHSMRuleEstPortTypePortAddress() {
        return HSMRuleEstPortTypePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HSMRuleEstPortTypePortWSDDServiceName = "HSMRuleEstPortTypePort";

    public java.lang.String getHSMRuleEstPortTypePortWSDDServiceName() {
        return HSMRuleEstPortTypePortWSDDServiceName;
    }

    public void setHSMRuleEstPortTypePortWSDDServiceName(java.lang.String name) {
        HSMRuleEstPortTypePortWSDDServiceName = name;
    }

    public pl.cyfronet.gforge.hsmest.ruleest.stubs.HSMRuleEstPortType getHSMRuleEstPortTypePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HSMRuleEstPortTypePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHSMRuleEstPortTypePort(endpoint);
    }

    public pl.cyfronet.gforge.hsmest.ruleest.stubs.HSMRuleEstPortType getHSMRuleEstPortTypePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pl.cyfronet.gforge.hsmest.ruleest.stubs.bindings.HSMRuleEstPortTypeSOAPBindingStub _stub = new pl.cyfronet.gforge.hsmest.ruleest.stubs.bindings.HSMRuleEstPortTypeSOAPBindingStub(portAddress, this);
            _stub.setPortName(getHSMRuleEstPortTypePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHSMRuleEstPortTypePortEndpointAddress(java.lang.String address) {
        HSMRuleEstPortTypePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pl.cyfronet.gforge.hsmest.ruleest.stubs.HSMRuleEstPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                pl.cyfronet.gforge.hsmest.ruleest.stubs.bindings.HSMRuleEstPortTypeSOAPBindingStub _stub = new pl.cyfronet.gforge.hsmest.ruleest.stubs.bindings.HSMRuleEstPortTypeSOAPBindingStub(new java.net.URL(HSMRuleEstPortTypePort_address), this);
                _stub.setPortName(getHSMRuleEstPortTypePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HSMRuleEstPortTypePort".equals(inputPortName)) {
            return getHSMRuleEstPortTypePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/ruleest/service", "HSMMonService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/ruleest/service", "HSMRuleEstPortTypePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        if ("HSMRuleEstPortTypePort".equals(portName)) {
            setHSMRuleEstPortTypePortEndpointAddress(address);
        }
        else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
