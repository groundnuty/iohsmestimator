package pl.cyfronet.gforge.hsmest.ruleest;

import org.apache.axis.message.addressing.Address;
import org.apache.axis.message.addressing.EndpointReferenceType;

import pl.cyfronet.gforge.hsmest.ruleest.stubs.HSMRuleEstPortType;
import pl.cyfronet.gforge.hsmest.ruleest.stubs.service.HSMMonServiceAddressingLocator;
import pl.cyfronet.gforge.hsmest.ruleest.stubs.Estimation;

public class Client {

    public static void main(String[] args) {
        HSMMonServiceAddressingLocator locator = new HSMMonServiceAddressingLocator();

        try {
            String serviceURI=args[0];

            EndpointReferenceType endpoint = new EndpointReferenceType();
            endpoint.setAddress(new Address(serviceURI));

            HSMRuleEstPortType estimator = locator.getHSMRuleEstPortTypePort(endpoint);

            for(int i = 1; i < args.length; i++) {
                Estimation est = estimator.estimateRead(args[i]);
                System.out.println(args[i]);
                if(est == null)
                    System.out.println("\tservice returned null - probably file not found");
                else {
                    System.out.println("\tlatency: " + est.getLatency() + " s");
                    System.out.println("\tbandwidth: " + est.getBandwidth() + " MB/s");
                    System.out.println("\tsize: " + est.getSize());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

