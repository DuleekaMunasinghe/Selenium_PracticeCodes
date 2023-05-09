package com.banking.Digi;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String url="http://only-testing-blog.blogspot.com/2014/01/textbox.html";
		driver.get(url);
		WebElement lnk=driver.findElement(By.linkText("Open New Page"));
		lnk.click();
		Thread.sleep(2000);
	 
	    Set < String > s = driver.getWindowHandles();
	    Iterator < String > it = s.iterator();
	    it.next();	//parent window
	    String w2nd = it.next();	//child window
	    driver.switchTo().window(w2nd);
	    Thread.sleep(2000);
	    WebElement txt_fname=driver.findElement(By.id("fname"));
	    txt_fname.sendKeys("test");
	    Thread.sleep(2000);
	    driver.close();
	    

	}

}
