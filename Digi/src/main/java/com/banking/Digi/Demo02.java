package com.banking.Digi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo02 {

	// private static final WebElement WebElement = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaration and instantiation of object/variables
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe"); // to say
		// where
		// the
		// web
		// drivers
		// are

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // method initialized as driver

		// options.addArguments("--disable-notifications");//
		// Launch the website
		driver.get("http://www.google.com/");

		//driver.navigate().refresh(); 01

		try // as this may give errors, good to put inside catch and try block
		{
			// Click on the search text box and send value "simplilearn"
			//driver.findElement(By.jsname("q")).sendKeys("selenium");Try xxxxxxxxxx
			//driver.findElement(By.LinkText("No thanks")).click();
			driver.findElement(By.name("q")).sendKeys("selenium");

			//WebElement m = driver.findElement(By.name("q"));02
			//m.sendKeys(Keys.ENTER);02
			// code for ENTER button of Keyboard, need to create "m" webelement for that

			//driver.findElement(By.name("btnK")).click();

			// click on the search button //driver.findElement(By.name("btnk")).click();
			Thread.sleep(1000); // wait for 1 sec to close the browser

			System.out.println("Title of page " + driver.getTitle());
			// driver.get("https://www.selenium.dev/documentation/webdriver/elements/interactions/");
			// System.out.println(driver.getTitle());

			String actualTitle = driver.getTitle();
			String expectedTitle = "selenium - Google Search";
			if (actualTitle.equals(expectedTitle))// checking actual value and expected value are matching or not
			{
				System.out.println("Verification Successful correct URL is opened");
			} else {
				System.out.println("Verification failed incorrect URL");
			}
		} catch (Exception ex) {
			System.out.println("error" + ex);
		} finally {
			//driver.close();03
		}
	}

}
