/**
 * HSMMonServiceAddressingLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Feb 27, 2008 (08:34:14 CST) WSDL2Java emitter.
 */

package pl.cyfronet.gforge.hsmest.ruleest.stubs.service;

public class HSMMonServiceAddressingLocator extends pl.cyfronet.gforge.hsmest.ruleest.stubs.service.HSMMonServiceLocator implements pl.cyfronet.gforge.hsmest.ruleest.stubs.service.HSMMonServiceAddressing {
    public pl.cyfronet.gforge.hsmest.ruleest.stubs.HSMRuleEstPortType getHSMRuleEstPortTypePort(org.apache.axis.message.addressing.EndpointReferenceType reference) throws javax.xml.rpc.ServiceException {
	org.apache.axis.message.addressing.AttributedURI address = reference.getAddress();
	if (address == null) {
		throw new javax.xml.rpc.ServiceException("No address in EndpointReference");
	}
	java.net.URL endpoint;
	try {
		endpoint = new java.net.URL(address.toString());
	} catch (java.net.MalformedURLException e) {
		throw new javax.xml.rpc.ServiceException(e);
	}
	pl.cyfronet.gforge.hsmest.ruleest.stubs.HSMRuleEstPortType _stub = getHSMRuleEstPortTypePort(endpoint);
	if (_stub != null) {
		org.apache.axis.message.addressing.AddressingHeaders headers =
			new org.apache.axis.message.addressing.AddressingHeaders();
		headers.setTo(address);
		headers.setReferenceProperties(reference.getProperties());
		((javax.xml.rpc.Stub)_stub)._setProperty(org.apache.axis.message.addressing.Constants.ENV_ADDRESSING_SHARED_HEADERS, headers);
	}
	return _stub;
    }


}
