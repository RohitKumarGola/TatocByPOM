package com.qa.Tatoc_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Grid_Gate {
	WebDriver driver;

	@FindBy(xpath="//div[@class=\"greenbox\"]")
	WebElement green_box;
    
	public  Grid_Gate(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnGreenBox()
	{
		green_box.click();
		
	}

}
