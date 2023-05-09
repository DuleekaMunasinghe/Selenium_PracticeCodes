package com.banking.Digi;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigateCommand_implicitlyWait {

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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// default wait time
		
		//WebDriver driver = new ChromeDriver();
		
		String appurl="https://www.google.com/";
		// Launch the website
		driver.navigate().to(appurl);
		//driver.get(appurl);
		
		driver.navigate().refresh();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// default wait time
		
		appurl="https://www.amazon.com/";
		driver.get(appurl);
		try {
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File DestFile=new File("C:\\SeleniumDrivers\\Images\\sample.png");
			//String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
			FileUtils.copyFile(srcFile, DestFile);
			//Thread.sleep(2000);
			
			driver.navigate().back();
			//Thread.sleep(2000);
			
			driver.navigate().forward();
			//Thread.sleep(2000);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
			
		driver.close();
		
	}

}
