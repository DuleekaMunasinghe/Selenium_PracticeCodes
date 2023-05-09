package com.banking.Digi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigateCommand1 {

	// private static final WebElement WebElement = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// declaration and instantiation of object/variables
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe"); // to say where the web drivers are

		//Fixing start the issue of driver stuck on just "data" in URL tab when we open google.com 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // method initialized as driver
		//Fixing finish
		
		//WebDriver driver = new ChromeDriver();
		
		String appurl="https://www.google.com/";
		// Launch the website
		driver.navigate().to(appurl);
		//driver.get(appurl);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		 
		appurl="https://www.amazon.com/";
		driver.get(appurl);
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		//driver.navigate().to(appurl);
		
		
		driver.close();
		
	}

}
