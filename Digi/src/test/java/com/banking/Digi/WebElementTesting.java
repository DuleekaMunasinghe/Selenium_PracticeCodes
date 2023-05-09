package com.banking.Digi;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementTesting {
	 WebDriver driver;
	
  @Test (priority = 1)
  public void VerifyRadioButton() throws InterruptedException 
  {	
	  System.out.println(" priority = 1 is executing");
	  WebElement Radiobmw = driver.findElement(By.id("bmwradio"));//
	  Radiobmw.click();
	  Thread.sleep(2000);		
  }
  
  @Test (priority = 2)
  public void VerifyCheckbox() throws InterruptedException 
  {	 
	  System.out.println(" priority = 2 is executing");
	  WebElement Radiobmw = driver.findElement(By.id("bmwcheck"));//
	  Radiobmw.click();	 
	  Thread.sleep(2000);	
  }
  
  
  @BeforeTest
  public void LaunchBrowser() throws InterruptedException
  {

	  System.out.println("Launch Browser");
	  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe\\");
	  ChromeOptions options   = new ChromeOptions();
	  options.addArguments("--remote-allow-origins=*");
	  driver = new ChromeDriver(options); driver.manage().window().maximize();
	  String appurl = "https://www.letskodeit.com/practice";
	  driver.get(appurl);
	  Thread.sleep(2000);
  }
  
  @AfterTest
  public void CloseBrowser() throws InterruptedException
  {
	  System.out.println("CloseBrowser");
	  Thread.sleep(2000);
	  driver.close();
  }
  
  
}
