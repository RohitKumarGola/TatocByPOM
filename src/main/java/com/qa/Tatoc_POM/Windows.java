package com.qa.Tatoc_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Windows {

	WebDriver driver;
	
	@FindBy(linkText="Launch Popup Window")
	WebElement launch_popup_window;
	
	@FindBy(xpath = "//a[text()=\"Proceed\"]")//"//a[contains(@onclick,\"gonext();\")]")
	WebElement proceed;
	
	public Windows(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void clickOnLaunchPopupWindow()
	{
		launch_popup_window.click();
	}
	
	public void clickOnProceed()
	{
		proceed.click();
	}
}
