package com.banking.Digi;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementTesting_V2 {
	 WebDriver driver;
	 String appurl = "https://www.letskodeit.com/practice";
	
  @Test (priority = 1)
  public void VerifyRadioButton() throws InterruptedException 
  {	
	  WebElement Radiobmw = driver.findElement(By.id("bmwradio"));//
	  Radiobmw.click();
	  Thread.sleep(2000);		
  }
  
  @Test (priority = 2)
  public void VerifyCheckbox() throws InterruptedException 
  {	 
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
	  driver = new ChromeDriver(options); 
	  driver.manage().window().maximize();
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
  
  @BeforeMethod()
  public void VerifyTitle() throws InterruptedException
  {

	  System.out.println("Runs before each test in a class is executed");
	  driver.get(appurl);
	  Thread.sleep(2000);
	  System.out.println(driver.getTitle());
  }
  
  @AfterMethod()
  public void VerifyHomePage() throws InterruptedException
  {
	  System.out.println("Runs after each test is executed");
	  WebElement Homelink = driver.findElement(By.linkText("HOME"));
	  Homelink.click();
	  Thread.sleep(2000);
	  System.out.println(driver.getTitle());
	  
  }
  
  
}
