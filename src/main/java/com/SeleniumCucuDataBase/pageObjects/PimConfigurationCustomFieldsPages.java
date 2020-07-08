package com.SeleniumCucuDataBase.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PimConfigurationCustomFieldsPages {
	
	private WebDriver driver;
	
	public PimConfigurationCustomFieldsPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement menuPimViewPimModule;
	
	@FindBy(id="menu_pim_Configuration")
	public WebElement menuPimConfiguration;
	
	@FindBy(id="menu_pim_listCustomFields")
	public WebElement menuPimListCustomField;
	
	@FindBy(id="customField_name")
	public WebElement customFieldName;
	
	@FindBy(id="customField_screen")
	public WebElement customFieldScreen;
	
	@FindBy(id="customField_type")
	public WebElement customFieldType;
	
	@FindBy(id="customField_extra_data")
	public WebElement customFieldExtraData;
	
	@FindBy(id="btnSave")
	public WebElement btnSave;
	
	Select select;
	
	public void clickButtonFields() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(menuPimViewPimModule).build().perform();
		Thread.sleep(2000);
		action.moveToElement(menuPimConfiguration).build().perform();
		menuPimListCustomField.click();
	}
	
	public void enterCustomFieldName(String field) {
		customFieldName.sendKeys(field);
	}
	
	public void selectCustomFieldScreen(String field) {
		select = new Select(this.customFieldScreen);
		select.selectByVisibleText(field);
	}
	
	public void selectCustomFieldType(String type) {
		select = new Select(this.customFieldType);
		select.selectByVisibleText(type);
	}
	
	public void saveButton() {
		btnSave.click();
	}
	
	
	
	

}