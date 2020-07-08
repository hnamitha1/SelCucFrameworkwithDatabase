package com.SeleniumCucuDataBase.stepDefinitions;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.SeleniumCucuDataBase.helper.LoggerHelper;
import com.SeleniumCucuDataBase.pageObjects.LoginPage;
import com.SeleniumCucuDataBase.pageObjects.PimConfigurationCustomFieldsPages;
import com.SeleniumCucuDataBase.testBase.TestBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PimConfigurationCustomFieldsStepDefinations extends TestBase{
	
	PimConfigurationCustomFieldsPages pimConfigurationCustomFieldsPages = new PimConfigurationCustomFieldsPages(driver);
	Logger logger = LoggerHelper.getLogger(loginStepDefinitions.class);
	
	
	@When("I click on Custom Fields link")
	public void i_click_on_Custom_Fields_link() throws InterruptedException {
		pimConfigurationCustomFieldsPages.clickButtonFields();
		
	}

	@And("^I enter Field Name \"([^\"]*)\"$")
	public void i_enter_Field_Name(String field) {
		pimConfigurationCustomFieldsPages.enterCustomFieldName(field);
	}

	@And("^I select Screen As \"([^\"]*)\"$")
	public void i_select_Screen_As(String screen) {
	    pimConfigurationCustomFieldsPages.selectCustomFieldScreen(screen);
	}

	@And("^I select Type as \"([^\"]*)\"$")
	public void i_select_Type_as(String type) {
	    pimConfigurationCustomFieldsPages.selectCustomFieldType(type);
	}

	@And("I click on Save button")
	public void i_click_on_Save_button() throws InterruptedException {
	    pimConfigurationCustomFieldsPages.saveButton();
	    Thread.sleep(3000);
	}

	@Then("I should see Custom Field Name")
	public void i_should_see_Custom_Field_Name() {
		boolean value = pimConfigurationCustomFieldsPages.returnCustomFieldLink();
	    Assert.assertTrue(value, "The Custom field is created");
	   
	}


}
