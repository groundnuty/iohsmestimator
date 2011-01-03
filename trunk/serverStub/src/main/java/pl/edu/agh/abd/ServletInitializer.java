package pl.edu.agh.abd;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServletInitializer implements ServletContextListener {

	protected final static Logger LOGGER = LoggerFactory.getLogger(ServletInitializer.class);
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		LOGGER.info("destroying servlet");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		LOGGER.info("initializing servlet");
	}

}