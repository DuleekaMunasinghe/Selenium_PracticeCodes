
package com.banking.Digi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class CheckBoxFireFox {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver\\geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(options);

        String appurl = "https://adactinhotelapp.com/";
        driver.get(appurl);
        driver.findElement(By.linkText("New User Register Here")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.findElement(By.id("tnc_box")).click();

        // Don't forget to close the WebDriver when you're done with it.
        driver.quit();
    }
}

