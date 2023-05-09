package com.banking.Digi;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextboxesXpath_ExplicitlyWait {

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
		
		WebElement txt_username= driver.findElement(By.xpath("//input[@id='username']"));
		//Thread.sleep(1000);
		
		WebDriverWait myWaitVar = new WebDriverWait(driver,Duration.ofSeconds(10));
		myWaitVar.until(ExpectedConditions.visibilityOf(txt_username));
		
		txt_username.sendKeys("test1");
		
		//Thread.sleep(2000);
		WebDriverWait myWaitVar1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		myWaitVar1.until(ExpectedConditions.visibilityOf(txt_username));
		//driver.close();
		}
		 
		
	}


