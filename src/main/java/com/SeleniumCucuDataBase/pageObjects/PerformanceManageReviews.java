package com.SeleniumCucuDataBase.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerformanceManageReviews {
	
	private WebDriver driver;
	
	public PerformanceManageReviews(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "menu__Performance")
	public WebElement menuPerformance;
	
	@FindBy(id="menu_performance_ManageReviews")
	public WebElement menuPerformanceManageReviews;
	
	@FindBy(id="menu_performance_searchPerformancReview")
	public WebElement menuPerformanceSearchPerformanceReview;

	@FindBy(id="btnAdd")
	public WebElement addButton;
	
	@FindBy(id="saveReview360Form_employee")
	public WebElement employeeName;
	
	@FindBy(id="saveReview360Form_supervisorReviewer")
	public WebElement supervisorReviewerName;
	
	@FindBy(id="saveReview360Form_workPeriodStartDate")
	public WebElement workPeriodStartDate;
	
	@FindBy(id="saveReview360Form_workPeriodEndDate")
	public WebElement workPeriodEndDate;
	
	@FindBy(id="saveReview360Form_dueDate")
	public WebElement dueDate;
	
	@FindBy(id="saveBtn")
	public WebElement saveButton;
	
	@FindBy(id="activateBtn")
	public WebElement activateButton;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr/td[6]")
	public WebElement status;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr/td[2]")
	public WebElement tableEmployeeName;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr/td[7]/a")
	public WebElement evaluate;
	
	@FindBy(id="reviewEvaluation_hrAdminComments")
	public WebElement finalComment;
	
	@FindBy(id="reviewEvaluation_finalRating")
	public WebElement finalRating;
	
	@FindBy(id="saveReview360Form_workPeriodStartDate")
	public WebElement endDate;
	
	@FindBy(id="completeBtn")
	public WebElement completeButton;
	
	@FindBy(id="dialogDeleteBtn")
	public WebElement okButton;
	
	@FindBy(id="backBtn")
	public WebElement backButton;
	
	@FindBy(id="ohrmList_chkSelectAll")
	public WebElement checkSelectAll;
	
	@FindBy(id="btnDelete")
	public WebElement deleteButton;
	
	@FindBy(id="dialogDeleteBtn")
	public WebElement okDeleteButton;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr/td")
	public WebElement noRecordMessage;
	
	public void clickButtonFields() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(menuPerformance).build().perform();
		Thread.sleep(2000);
		action.moveToElement(menuPerformanceManageReviews).build().perform();
		menuPerformanceSearchPerformanceReview.click();
	}
	
	public void clickAddButton() {
		addButton.click();
	}
	
	public void enterEmployeeName(String name) {
		employeeName.sendKeys(name);
		employeeName.sendKeys(Keys.RETURN);
	}
	
	public void enterSupervisorName(String name) throws InterruptedException {
		supervisorReviewerName.sendKeys(name);
		//Thread.sleep(3000);
		supervisorReviewerName.sendKeys(Keys.ENTER);
	}
	
	public void enterWorkPeriodStartDate(String date) {
		//workPeriodStartDate.clear();
		workPeriodStartDate.click();
		workPeriodStartDate.sendKeys(date);
		workPeriodStartDate.sendKeys(Keys.RETURN);
	}
	
	public void enterWorkPeriodEndDate(String date) {
		workPeriodEndDate.clear();
		workPeriodEndDate.sendKeys(date);
		workPeriodEndDate.sendKeys(Keys.RETURN);
	}
	
	public void enterDueDate(String date) {
		dueDate.clear();
		dueDate.sendKeys(date);
		dueDate.sendKeys(Keys.RETURN);
	}
	
	public void clickActivateButton() {
		activateButton.click();
	}
	
	public String getStatus() {
		return status.getText();
	}
	
	public String getEmployeeName() {
		return tableEmployeeName.getText();
	}
	
	public void clickEvaluate() {
		evaluate.click();
	}
	
	public void enterFinalComment(String value) {
		finalComment.sendKeys(value);
	}
	
	public void enterFinalRating(String value) {
		finalRating.sendKeys(value);
	}
	
	public void enterEndDate(String date) {
		endDate.clear();
		endDate.sendKeys(date);
		endDate.sendKeys(Keys.RETURN);
	}
	
	public void clickCompleteButton() {
		completeButton.click();
	}
	
	public void clickOkButton() {
		okButton.click();
	}
	
	public void clickBackButton() {
		backButton.click();
	}
	
	public void checkSelectBox() {
		checkSelectAll.click();
	}
	
	public void clickDeleteButton() {
		deleteButton.click();
	}
	
	public void clickOkDeleteButton() {
		okDeleteButton.click();
	}
	
	public String getNoRecordMessage() {
		return noRecordMessage.getText();
	}
	
}
