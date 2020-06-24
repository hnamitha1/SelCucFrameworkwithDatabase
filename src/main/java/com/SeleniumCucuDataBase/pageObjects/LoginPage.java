package com.SeleniumCucuDataBase.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SeleniumCucuDataBase.helper.WaitHelper;

public class LoginPage {
	
	private WebDriver driver;
		
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(id = "txtPassword")
	public WebElement passWord;

	@FindBy(id = "btnLogin")
	public WebElement loginButton;
	
	@FindBy(id = "welcome")
	public WebElement welcomeMessage;
	
	public void enterUserName(String userName) {
		username.sendKeys(userName);
	}

	public void enterPassword(String password) {
		passWord.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}
	
	public String welcomeText() {
		return welcomeMessage.getText();
	}

	
}
