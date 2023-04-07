package com.banking.Digi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigateCommands {

	// private static final WebElement WebElement = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// declaration and instantiation of object/variables
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe"); // to say where the web drivers are

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // method initialized as driver
		//WebDriver driver = new ChromeDriver();
		
		String appurl="https://www.google.com/";
		// Launch the website
		driver.get(appurl);
		Thread.sleep(2000);
		appurl="https://www.amazon.com/";
		driver.get(appurl);
		//driver.navigate().refresh();
		driver.navigate().back(); // navigating back and forward 
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.close();
		
	}

}
