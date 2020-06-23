package com.SeleniumCucuDataBase.testBase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import com.SeleniumCucuDataBase.helper.LoggerHelper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
	public static Properties properties;
	Logger logger = LoggerHelper.getLogger(LoggerHelper.class);

	
	public  void browserSetUp() {
		
		String browser = properties.getProperty("browser");
		boolean isHeadless = false;
		if (properties.getProperty("isHeadless").toLowerCase().equals("true")) {
			isHeadless = true;
		}
		String url = properties.getProperty("url");

		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
			chromeOptions.addArguments("enable-automation");
			chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
			if (isHeadless) {
				chromeOptions.setHeadless(isHeadless);
			}
			driver = new ChromeDriver(chromeOptions);
			logger.info(String.format("Identified the browser as %s. Launching the browser in headless %s", browser, isHeadless));
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
			firefoxOptions.addArguments("enable-automation");
			firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NONE);

			if (isHeadless)
				firefoxOptions.addArguments("--headless");
			driver = new FirefoxDriver(firefoxOptions);
			logger.info(String.format("Identified the browser as %s. Launching the browser in headless %s", browser, isHeadless));
			break;

		case "ie":
			WebDriverManager.iedriver().setup();
			InternetExplorerOptions ieOptions = new InternetExplorerOptions();
			ieOptions.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
			ieOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
			if (isHeadless)
				logger.info("IE doesn't support headless ");
			driver = new InternetExplorerDriver(ieOptions);
			logger.info(String.format("Identified the browser as %s. Launching the browser", browser));
			break;

		default:
			logger.info(String.format("Could not identify the browser as %s. Please specify correct browser", browser));
			break;
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		logger.info("Launched the Orange Application");
	}
}
