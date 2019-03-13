package com.log4j.Log4j;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void display(String name) throws Exception
	{
		if(name.equals("Rama"))
		{
			throw new Exception();
		}
	}
	private static final Logger log = LogManager.getLogger(App.class); 
    public static void main( String[] args )
    {
    	log.debug("Debug mode");
    	log.info("Info mode");
    	log.warn("Warn mode");
    	log.fatal("FATAL mode");
    	try{
    		display("Rama");
    	}
    	catch(Exception e)
    	{
    		log.error("Exception occured::"+Arrays.toString(e.getStackTrace()));
    	} 
    	
    }
}
