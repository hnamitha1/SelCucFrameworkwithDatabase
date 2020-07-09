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
	
	@FindBy(linkText="Custom Field Name")
	public WebElement customLinkText;
	
	@FindBy(id="bottonAdd")
	public WebElement addButton;
	
	@FindBy(id="buttonRemove")
	public WebElement deleteButton;
	
	@FindBy(id="customFieldList")
	public WebElement customFieldTable;
	
	@FindBy(id="allCheck")
	public WebElement checkboxCustomFieldList;
	
	@FindBy(xpath="//*[@id=\"customFieldListPane\"]/div[1]/h1")
	public WebElement definedCustomFields;
	
	@FindBy(xpath= "//*[@id=\"deleteConfModal\"]/div[1]/h3")
	public WebElement deleteConfirmationMessage; 
	
	@FindBy(id="dialogDeleteBtn")
	public WebElement dialogDeleteButton;
	
	@FindBy(id="heading")
	public WebElement addCustomField;
	
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
	
	public boolean returnCustomFieldLink() {
		return customLinkText.isDisplayed();
	}
	
	public void addButton() {
		addButton.click();
	}
	
	public void deleteButton() {
		deleteButton.click();
	}
	
	public String textDefinedCustomFields() {
		return definedCustomFields.getText();
	}
	
	public String textDeleteConfirmationMessage() {
		return deleteConfirmationMessage.getText();
	}
	
	public void dialogDeleteButton() {
		dialogDeleteButton.click();
	}
	
	public String textAddCustomField() {
		return addCustomField.getText();
	}
	
	public void clickCheckboxCustomFieldList() {
		checkboxCustomFieldList.click();
	}
}
