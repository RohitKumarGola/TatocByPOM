package com.qa.Tatoc_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tatoc_Home {
WebDriver driver;

@FindBy(linkText="Basic Course")
WebElement basic_Course;	
	
@FindBy(linkText="Advanced Course")
WebElement advanced_Course;

public Tatoc_Home(WebDriver driver) {
	this.driver=driver;
PageFactory.initElements(driver,this);	
}
public void clickOnBasicCourse() {
	basic_Course.click();
}

public void clickOnAdvanceCourse() {
	advanced_Course.click();
}

}
