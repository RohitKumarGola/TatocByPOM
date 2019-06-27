package com.qa.Tatoc_POM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tatoc_TestCases {
	WebDriver driver;
String base_url = "http://10.0.1.86/tatoc";
	
	String mainWindow;
	String childWindow;
	Set<String> s;
	Iterator<String> i ;
	
	String name;
	
	Windows windows;
	Tatoc_Home tatoc_home;
	Popup popup;
	Grid_Gate grid_gate;
	Frame_Dungeon frame_dungeon;
	Drag drag;
	Cookie_Handling cookie_handling;
	
	
  @Test(priority=1)
  public void start() {
	  System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");
	  driver = new ChromeDriver();
      driver.get(base_url);
  }
  @Test(priority=2)
  public void operations() {
	  tatoc_home = new Tatoc_Home(driver);
	  tatoc_home.clickOnBasicCourse();
	  
	  grid_gate=new Grid_Gate(driver);
	  grid_gate.clickOnGreenBox();
	  
	  frame_dungeon=new Frame_Dungeon(driver);
	  frame_dungeon.clickOnRepaintBox2();
	  
	  drag=new Drag(driver);
	  drag.performDragAndDrop();
	  
	  windows=new Windows(driver);
	  windows.clickOnLaunchPopupWindow();
	  mainWindow = driver.getWindowHandle();
	  s = driver.getWindowHandles();
	  i = s.iterator();
	  
	  while(i.hasNext())
	  {
		  childWindow = i.next();
		  if(!mainWindow.equalsIgnoreCase(childWindow))
		  {
			  driver.switchTo().window(childWindow);
		  }
	  }
	  popup = new Popup(driver);
	  name = "Rohit";
	  popup.clickOnSubmitButton(name);
	  driver.switchTo().window(mainWindow);
	  windows.clickOnProceed();
	  
	  cookie_handling = new Cookie_Handling(driver);
	  cookie_handling.generateToken();
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
}
