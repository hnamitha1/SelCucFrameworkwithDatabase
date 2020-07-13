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
	
	@FindBy(id="backBtn")
	public WebElement backButton;
	
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
	
	public void enterSupervisorName(String name) {
		supervisorReviewerName.sendKeys(name);
	}
	
	public void enterWorkPeriodStartDate(String date) {
		workPeriodStartDate.clear();
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
		//dueDate.sendKeys(date);
		//dueDate.sendKeys(Keys.RETURN);
	}
	
	public void clickActivateButton() {
		activateButton.click();
	}
}
