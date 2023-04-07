package com.banking.Digi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe"); 

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		String appurl = "https://adactinhotelapp.com/";
		driver.get(appurl);
		//driver.findElement(By.partialLinkText("Forgot") ).click();// when we don't know the entire link, partialLinkText can be used
		//driver.findElement(By.partialLinkText("New User")).click();
		driver.findElement(By.linkText("New User Register Here")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.findElement(By.id("tnc_box")).click();

	}

}
