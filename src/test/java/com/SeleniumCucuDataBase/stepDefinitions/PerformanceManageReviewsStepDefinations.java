package com.SeleniumCucuDataBase.stepDefinitions;

import org.apache.log4j.Logger;

import com.SeleniumCucuDataBase.helper.LoggerHelper;
import com.SeleniumCucuDataBase.pageObjects.PerformanceManageReviews;
import com.SeleniumCucuDataBase.testBase.TestBase;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PerformanceManageReviewsStepDefinations extends TestBase{

	PerformanceManageReviews performanceManageReviews = new PerformanceManageReviews(driver);
	Logger logger = LoggerHelper.getLogger(loginStepDefinitions.class);
	
	@When("^I click on Manage Reviews link$")
	public void i_click_on_Manage_Reviews_link() throws Throwable {
	    performanceManageReviews.clickButtonFields();
	}

	@When("^Click on Add Button$")
	public void click_on_Add_Button() throws Throwable {
	    performanceManageReviews.clickAddButton();
	}

	@When("^Enter the employee name as \"([^\"]*)\"$")
	public void enter_the_employee_name_as(String arg1) throws Throwable {
	    performanceManageReviews.enterEmployeeName(arg1);
	}
	
	@When("^Enter the supervisor name as \"([^\"]*)\"$")
	public void enter_the_supervisor_name_as(String arg1) throws Throwable {
	    performanceManageReviews.enterSupervisorName(arg1);
	}

	@When("^Enter the work period start date as \"([^\"]*)\"$")
	public void enter_the_work_period_start_date_as(String arg1) throws Throwable {
	    performanceManageReviews.enterWorkPeriodStartDate(arg1);
	}

	@When("^Enter the work period end date as \"([^\"]*)\"$")
	public void enter_the_work_period_end_date_as(String arg1) throws Throwable {
	    performanceManageReviews.enterWorkPeriodEndDate(arg1);
	}

	@When("^Enter the due date as \"([^\"]*)\"$")
	public void enter_the_due_date_as(String arg1) throws Throwable {
	    performanceManageReviews.enterDueDate(arg1);
	}

	@When("^click on activate$")
	public void click_on_activate() throws Throwable {
	    performanceManageReviews.clickActivateButton();
	    Thread.sleep(3000);
	}

	@Then("^check the status of the employee to be changed to \"([^\"]*)\"$")
	public void check_the_status_of_the_employee_to_be_changed_to(String arg1) throws Throwable {
	    Thread.sleep(3000);
	    System.out.println("status changed");
	}

	@When("^Enter employee name as \"([^\"]*)\"$")
	public void enter_employee_name_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^click on Evaluate$")
	public void click_on_Evaluate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^enter the rating as \"([^\"]*)\"$")
	public void enter_the_rating_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Enter the final comment as \"([^\"]*)\"$")
	public void enter_the_final_comment_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^enter the fina rating as \"([^\"]*)\"$")
	public void enter_the_fina_rating_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^enter the complete date as \"([^\"]*)\"$")
	public void enter_the_complete_date_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^click on Complete$")
	public void click_on_Complete() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^pop up of OrangeHRM confirmation Required will come$")
	public void pop_up_of_OrangeHRM_confirmation_Required_will_come() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^click on okie$")
	public void click_on_okie() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Click on back$")
	public void click_on_back() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^verify the status changed to \"([^\"]*)\"$")
	public void verify_the_status_changed_to(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^select Fiona Grace$")
	public void select_Fiona_Grace() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^click on Delete$")
	public void click_on_Delete() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Pop up will come and click on okie$")
	public void pop_up_will_come_and_click_on_okie() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^verify the record should not be in table$")
	public void verify_the_record_should_not_be_in_table() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
