package com.qa.Tatoc_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Drag {
	WebDriver driver;
	   
	   @FindBy(xpath = "//div[text()=\"DRAG ME\"]")
	   WebElement drag_me;
	   
	   @FindBy(xpath="//div[contains(@id,\"dropbox\")]")
	   WebElement drop_box;
	   
	   @FindBy(xpath = "//a[@onclick=\"gonext();\"]")
	   WebElement proceed;
	   
	   Actions actions;
	   public Drag(WebDriver driver)
	   {
		   this.driver=driver;
		   PageFactory.initElements(driver,this);
	   }
	   
	   public void performDragAndDrop()
	   {
		   actions = new Actions(driver);
		   actions.dragAndDrop(drag_me,drop_box).build().perform();
		   proceed.click();
	   }
}
