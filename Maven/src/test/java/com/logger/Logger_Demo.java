package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logger_Demo {

	public static void main(String[] args) {

		Logger log = Logger.getLogger(Logger_Demo.class);

		BasicConfigurator.configure();

		PropertyConfigurator.configure("log4j.properties");

		log.info("Test");
	}

}
