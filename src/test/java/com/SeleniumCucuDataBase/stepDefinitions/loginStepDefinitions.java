package com.SeleniumCucuDataBase.stepDefinitions;

import org.apache.log4j.Logger;

import com.SeleniumCucuDataBase.helper.LoggerHelper;
import com.SeleniumCucuDataBase.helper.WaitHelper;
import com.SeleniumCucuDataBase.pageObjects.LoginPage;
import com.SeleniumCucuDataBase.testBase.TestBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefinitions extends TestBase {
	
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

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username(String username) {
		loginPage.enterUserName(username);
	}

	@And("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password(String password) {
	    loginPage.enterPassword(password);
	}

	@And("click on login button")
	public void click_on_login_button() {
	    loginPage.clickLoginButton();
	}

	@Then("I sould see application homepage")
	public void i_sould_see_application_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("I sould see administrator text message on home Page")
	public void i_sould_see_administrator_text_message_on_home_Page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
