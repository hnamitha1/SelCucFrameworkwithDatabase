package com.SeleniumCucuDataBase.testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/featureFiles/pimConfigurationCustomFields.feature", 
				 glue = { "com/SeleniumCucuDataBase/stepDefinitions" }, 
                 plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
"json:target/cucumber-reports/CucumberTestReport.json", "rerun:target/cucumber-reports/rerun.txt" },
                 monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}
