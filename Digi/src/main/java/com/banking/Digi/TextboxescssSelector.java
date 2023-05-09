package com.banking.Digi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TextboxescssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe"); 

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // method initialized as driver
		//WebDriver driver = new ChromeDriver();
		
		String appurl = "https://adactinhotelapp.com/Register.php";
		driver.get(appurl);
		
		System.out.println(driver.getTitle());
		
		WebElement txt_username= driver.findElement(By.cssSelector("#username"));
		
		Thread.sleep(1000);
		txt_username.sendKeys("test1");
		
		Thread.sleep(1000);
		driver.close();
		}
		 
		
	}

