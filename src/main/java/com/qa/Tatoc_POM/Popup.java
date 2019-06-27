package com.qa.Tatoc_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Popup {
WebDriver driver;
	
	@FindBy(xpath="//input[@id=\"name\"]")
	WebElement name_field;
	
	@FindBy(xpath = "//input[@id=\"submit\"]")
	WebElement submit;
	
	public Popup(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickOnSubmitButton(String s)
	{
		name_field.sendKeys(s);
		submit.click();
	}
}
