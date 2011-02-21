package pl.edu.agh.abd.estimator;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.provider.JSONProvider;
import org.apache.log4j.BasicConfigurator;
import pl.edu.agh.abd.ConfigProperties;
import pl.edu.agh.abd.services.EstimationService;


/**
 * Created by IntelliJ IDEA.
 * User: orzech
 * Date: 2/21/11
 * Time: 5:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class App {

    public static void main( String[] args )
    {
        BasicConfigurator.configure();
        ConfigProperties configProperties = ConfigProperties.getProperties() ;

        System.out.println("Starting Service");

        EstimationService estimationService = new EstimationService();
        JAXRSServerFactoryBean restServer = new JAXRSServerFactoryBean();
        restServer.setServiceBean(estimationService);
        restServer.setAddress(configProperties.getProperty(ConfigProperties.ESTIMATOR_URL));
        JSONProvider provider = new JSONProvider();
        restServer.setProvider(provider);
        restServer.create();

    }

}
