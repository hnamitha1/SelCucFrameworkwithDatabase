package com.SeleniumCucuDataBase.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomFields {
	
	private WebDriver driver;
	
	public CustomFields(WebDriver driver) {
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
	
	
	
	
	
	

}
