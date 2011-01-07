/**
 * HSMMonServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Mar 03, 2006 (12:17:06 EST) WSDL2Java emitter.
 */

package pl.cyfronet.gforge.hsmest.hsmmon.stubs.service;

public class HSMMonServiceLocator extends org.apache.axis.client.Service implements pl.cyfronet.gforge.hsmest.hsmmon.stubs.service.HSMMonService {

    public HSMMonServiceLocator() {
    }


    public HSMMonServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HSMMonServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HSMMonPortTypePort
    private java.lang.String HSMMonPortTypePort_address = "http://localhost:8080/wsrf/services/";

    public java.lang.String getHSMMonPortTypePortAddress() {
        return HSMMonPortTypePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HSMMonPortTypePortWSDDServiceName = "HSMMonPortTypePort";

    public java.lang.String getHSMMonPortTypePortWSDDServiceName() {
        return HSMMonPortTypePortWSDDServiceName;
    }

    public void setHSMMonPortTypePortWSDDServiceName(java.lang.String name) {
        HSMMonPortTypePortWSDDServiceName = name;
    }

    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMMonPortType getHSMMonPortTypePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HSMMonPortTypePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHSMMonPortTypePort(endpoint);
    }

    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMMonPortType getHSMMonPortTypePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pl.cyfronet.gforge.hsmest.hsmmon.stubs.bindings.HSMMonPortTypeSOAPBindingStub _stub = new pl.cyfronet.gforge.hsmest.hsmmon.stubs.bindings.HSMMonPortTypeSOAPBindingStub(portAddress, this);
            _stub.setPortName(getHSMMonPortTypePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHSMMonPortTypePortEndpointAddress(java.lang.String address) {
        HSMMonPortTypePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMMonPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                pl.cyfronet.gforge.hsmest.hsmmon.stubs.bindings.HSMMonPortTypeSOAPBindingStub _stub = new pl.cyfronet.gforge.hsmest.hsmmon.stubs.bindings.HSMMonPortTypeSOAPBindingStub(new java.net.URL(HSMMonPortTypePort_address), this);
                _stub.setPortName(getHSMMonPortTypePortWSDDServiceName());
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
        if ("HSMMonPortTypePort".equals(inputPortName)) {
            return getHSMMonPortTypePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon/service", "HSMMonService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon/service", "HSMMonPortTypePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        if ("HSMMonPortTypePort".equals(portName)) {
            setHSMMonPortTypePortEndpointAddress(address);
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
