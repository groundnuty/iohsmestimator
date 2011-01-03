package pl.edu.agh.abd;

import java.util.Properties;
import java.util.Timer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static pl.edu.agh.abd.ConfigProperties.*;

public class ServletInitializer implements ServletContextListener {

	protected final static Logger LOGGER = LoggerFactory.getLogger(ServletInitializer.class);
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		LOGGER.info("destroying servlet");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		LOGGER.info("initializing servlet");
		
		Properties props = ConfigProperties.getProperties();
		Timer timer = new Timer();
		timer.schedule(new EstimateUtil(), 500, Long.parseLong("5") * 1000);
	}

}