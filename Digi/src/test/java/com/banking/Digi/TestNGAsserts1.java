package com.banking.Digi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAsserts1 {
	WebDriver driver;
    String appurl = "https://www.gmail.com";
    
    @BeforeTest
    public void LaunchBrowser() throws InterruptedException
    {

  	  System.out.println("Launch Browser");
  	  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe\\");
  	  ChromeOptions options   = new ChromeOptions();
  	  options.addArguments("--remote-allow-origins=*");
  	  driver = new ChromeDriver(options); 
  	  driver.manage().window().maximize();
  	  driver.get(appurl);
  	  Thread.sleep(1000);
    }
    @AfterTest
    public void CloseBrowser() throws InterruptedException
    {
  	  System.out.println("CloseBrowser");
  	  Thread.sleep(1000);
  	  driver.close();
    }
    
    @Test 
    public void TestMethodOne() throws InterruptedException 
    {	 
   	  System.out.println("Test Method 1 is executed");    
  	  Thread.sleep(1000);	
  	  Assert.assertEquals(true, true); //hard assert
  	  System.out.println("Next statement1 after assertion");
  	  Assert.assertEquals(true, true);
  	  System.out.println("Next statement2 after assertion");
    }
    
    @Test 
    public void TestMethodTwo() throws InterruptedException 
    {	 
   	  System.out.println("Test Method 2 is executed");    
  	  Thread.sleep(1000);	
    }
    
    
    
}
