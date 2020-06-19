package com.lpf.driver.tools;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class OESLog {
	private static Logger logger =  Logger.getLogger("OES_LOG");

	public static void debug(String message){
		PropertyConfigurator.configure( "src\\log4j.properties" );
		logger.debug(message);
	}

	public static void info(String message){
		PropertyConfigurator.configure( "src\\log4j.properties" );
		logger.info(message);
	}

	public static void warn(String message){
		PropertyConfigurator.configure( "src\\log4j.properties" );
		logger.warn(message);
	}

	public static void error(String message){
		PropertyConfigurator.configure( "src\\log4j.properties" );
		logger.error(message);
	}
}