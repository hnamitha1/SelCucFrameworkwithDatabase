package com.SeleniumCucuDataBase.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SeleniumCucuDataBase.helper.WaitHelper;

public class LoginPage {
	
	private WebDriver driver;
	WaitHelper waitHelper;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.WaitForElement(username, 60);
	}
	
	@FindBy(id = "txtUsername")
	WebElement username;

	@FindBy(id = "txtPassword")
	WebElement passWord;

	@FindBy(id = "btnLogin")
	WebElement loginButton;

	

	public void enterUserName(String userName) {
		username.sendKeys(userName);
	}

	public void enterPassword(String password) {
		passWord.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

	
}
