package com.qa.Tatoc_POM;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cookie_Handling {
	WebDriver driver;
	String s_token;
	Cookie cookie; 
	
	
	@FindBy(linkText="Generate Token")
	WebElement generate_token;
	
	@FindBy(id = "token")
	WebElement token;
	
	@FindBy(xpath = "//a[@onclick=\"gonext();\"]")
	WebElement proceed;
	
	public Cookie_Handling(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);//8962941977
	}
		
			
		
		public void generateToken()
		{
			generate_token.click();
			s_token  = token.getText().split(": ")[1];
			System.out.println(s_token);
			//s_token  = token.getText().substring(7);
			cookie = new Cookie("Token",s_token);
			driver.manage().addCookie(cookie);
			proceed.click();
		}
	}


