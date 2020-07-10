package com.SeleniumCucuDataBase.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerformanceManageReviews {
	
	private WebDriver driver;
	
	public PerformanceManageReviews(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

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
	
}
