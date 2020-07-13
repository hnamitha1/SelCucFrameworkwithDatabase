package com.SeleniumCucuDataBase.stepDefinitions;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.SeleniumCucuDataBase.helper.DatabaseHelper;
import com.SeleniumCucuDataBase.helper.LoggerHelper;
import com.SeleniumCucuDataBase.helper.WaitHelper;
import com.SeleniumCucuDataBase.pageObjects.LoginPage;
import com.SeleniumCucuDataBase.testBase.TestBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefinitions extends TestBase {
	
	DatabaseHelper databaseHelper = new DatabaseHelper();
	WaitHelper waitHelper; 
	LoginPage loginPage = new LoginPage(driver);
	Logger logger = LoggerHelper.getLogger(loginStepDefinitions.class);
	
	@Given("I am on the Login page URL")
	public void i_am_on_the_Login_page_URL() {
		waitHelper = new WaitHelper(driver);
		waitHelper.WaitForElement(loginPage.username, 60);
		logger.info("We are in login page of Orange hrm Application");
	}

	@Then("I should see Log In Page")
	public void i_should_see_Log_In_Page() {
		loginPage.username.isDisplayed();
	}

	@When("I enter username")
	public void i_enter_username() {
		loginPage.enterUserName("namitha");
	}

	@And("I enter password")
	public void i_enter_password(){
			loginPage.enterPassword("namitha123");
	}

	@And("click on login button")
	public void click_on_login_button() {
	    loginPage.clickLoginButton();
	}

	@Then("^I sould see application homepage with message \"([^\"]*)\"$")
	public void i_sould_see_application_homepage_with_message(String expectedMessage) {
		String actualMessage = loginPage.welcomeText();
	    Assert.assertEquals(actualMessage, expectedMessage);
	}




}
