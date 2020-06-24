package com.SeleniumCucuDataBase.stepDefinitions;

import org.apache.log4j.Logger;

import com.SeleniumCucuDataBase.helper.LoggerHelper;
import com.SeleniumCucuDataBase.testBase.TestBase;

import io.cucumber.java.Before;

public class ServiceHooks {
	
		TestBase testBase;

		Logger log = LoggerHelper.getLogger(ServiceHooks.class);

		@Before
		public void initializeTest() {
			testBase = new TestBase();
			testBase.browserSetUp();
		}
		
		
}
