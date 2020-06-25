package com.jspider.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jDemo {
	static Logger log = Logger.getLogger("Demo.class");

	public static void main(String[] args) {
		System.out.println("execution starts");
		// PropertyConfigurator.configure("E:\\eclipseprogram\\loggerprocess\\log4j.properties");
		PropertyConfigurator.configure("log4j.properties");
		log.trace("display trace msg:" + "vikash");
		log.debug("display debug msg");
		log.info("display info msg");
		log.warn("display warn msg");
		log.error("display error msg");
		log.fatal("display fatal msg");
		System.out.println("execution ends");
	}
}
