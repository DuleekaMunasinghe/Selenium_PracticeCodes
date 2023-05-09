package com.banking.Digi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TextboxesfindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe"); 

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // method initialized as driver
		//WebDriver driver = new ChromeDriver();
		String appurl = "https://www.bbc.com/";
		driver.get(appurl);
		//driver.findElement(By.id("username")).sendKeys("test");;// identify the field by the locator "username" and fill the filed as "test"
		System.out.println(driver.getTitle());
		
		
		// element finder codes
		List<WebElement> elements = driver.findElements(By.tagName("a")); // will give the all the links of "a" available in the page
		System.out.println("Total number of elements "+elements.size());
		for (WebElement element : elements) {
			if (element.getText().length()>0)// will only give non-empty links 
		    System.out.println("Paragraph text:" + element.getText());
		}
		  
		driver.close();
	}

}
