package com.SeleniumCucuDataBase.helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHelper {
	
private static boolean root=false;
	
	public static Logger getLogger(Class cls){
		if(root){
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("src\\test\\resources\\ConfigProperties\\log4j.proprerties");
		root = true;
		return Logger.getLogger(cls);
	}

}
