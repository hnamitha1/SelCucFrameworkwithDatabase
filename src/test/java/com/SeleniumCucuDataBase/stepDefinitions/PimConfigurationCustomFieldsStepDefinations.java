package com.SeleniumCucuDataBase.stepDefinitions;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.SeleniumCucuDataBase.helper.LoggerHelper;
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
	public void i_click_on_Save_button(){
	    pimConfigurationCustomFieldsPages.saveButton();
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see_Custom_Field_Name(String expectedResult){
		String actualResult = pimConfigurationCustomFieldsPages.textDefinedCustomFields();
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@When("I can select check box")
	public void i_can_select_check_box() {
	    pimConfigurationCustomFieldsPages.clickCheckboxCustomFieldList();
	}

	@When("I can click on Delete")
	public void i_can_click_on_Delete() {
	    pimConfigurationCustomFieldsPages.deleteButton();
	}

	@When("^I need to see the confirmation box \"([^\"]*)\"$")
	public void i_need_to_see_the_confirmation_box(String expectedResult) {
		System.out.println(expectedResult + " Expected result");
		String actualResult = pimConfigurationCustomFieldsPages.textDeleteConfirmationMessage();
		 Assert.assertEquals(actualResult, expectedResult);
	}

	@Then("click on ok button")
	public void click_on_ok_button() {
	    pimConfigurationCustomFieldsPages.dialogDeleteButton();
	}

	@Then("^need to see \"([^\"]*)\" heading$")
	public void need_to_see_heading(String expectedResult) throws InterruptedException {
		System.out.println(expectedResult);
		String actualResult = pimConfigurationCustomFieldsPages.textAddCustomField();
	    Assert.assertEquals(actualResult, expectedResult);
	}
	
}
