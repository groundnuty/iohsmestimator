package pl.cyfronet.gforge.hsmest.ruleest.impl;

import java.io.IOException;
import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.axis.message.addressing.Address;
import org.apache.axis.message.addressing.EndpointReferenceType;
import org.apache.axis.AxisFault;
import org.apache.axis.types.URI.MalformedURIException;
import org.globus.wsrf.Resource;
import org.globus.wsrf.ResourceProperties;
import org.globus.wsrf.ResourceProperty;
import org.globus.wsrf.ResourcePropertySet;
import org.globus.wsrf.impl.ReflectionResourceProperty;
import org.globus.wsrf.impl.SimpleResourcePropertySet;

import pl.cyfronet.gforge.hsmest.ruleest.stubs.Estimation;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.*;
import pl.cyfronet.gforge.hsmest.hsmmon.stubs.service.*;


public class HsmRuleEstService implements Resource, ResourceProperties {
    public static final String HSMMON_PREFIX = "http://";
    public static final String HSMMON_SUFFIX = ":8080/wsrf/services/HSMMonFactoryService";

    /* Resource Property set */
    private ResourcePropertySet propSet;

    /* Resource properties */
    private String hsmMonUrl;

    private Map<String, Estimator> estimatorCache;

    public HsmRuleEstService() {
        estimatorCache = new TreeMap<String, Estimator>();
        this.propSet = new SimpleResourcePropertySet(HsmRuleEstQNames.RESOURCE_PROPERTIES);

        /* Initialize the RP's */
        try {
            ResourceProperty hsmMonUrlRP = new ReflectionResourceProperty(HsmRuleEstQNames.RP_HSM_MON_URL, "HsmMonUrl", this);
            this.propSet.add(hsmMonUrlRP);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public ResourcePropertySet getResourcePropertySet() {
        return propSet;
    }

    public static HSMMonPortType connectToHSMMon(String url) throws IOException, ServiceException {
        HSMMonFactoryServiceAddressingLocator factoryLocator = new HSMMonFactoryServiceAddressingLocator();
        HSMMonServiceAddressingLocator instanceLocator = new HSMMonServiceAddressingLocator();
        EndpointReferenceType factoryEPR, instanceEPR;
        HSMMonFactoryPortType hsmMonFactory;
        factoryEPR = new EndpointReferenceType();
        factoryEPR.setAddress(new Address(url));
        hsmMonFactory = factoryLocator.getHSMMonFactoryPortTypePort(factoryEPR);
        CreateResourceResponse createResponse = hsmMonFactory.createResource(new CreateResource());
        instanceEPR = createResponse.getEndpointReference();
        return instanceLocator.getHSMMonPortTypePort(instanceEPR);
    }

    public Estimation estimateRead(String fileName) throws RemoteException {
        try {
            Estimator est;
            String[] parts = fileName.split("/");
            String host = parts[0];
            String path = fileName.substring(host.length());
            if(estimatorCache.containsKey(host))
                est = estimatorCache.get(host);
            else {
                est = new Estimator(connectToHSMMon(HSMMON_PREFIX + host + HSMMON_SUFFIX));
                estimatorCache.put(host, est);
            }
            return est.estimate(path);
        /*} catch(AxisFault fault) {
            System.err.println("AxisFault: " + fault.getFaultString());*/
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String getHsmMonUrl() {
        return hsmMonUrl;
    }

    public void setHsmMonUrl(String hsmMonUrl) {
        this.hsmMonUrl = hsmMonUrl;
    }
}

