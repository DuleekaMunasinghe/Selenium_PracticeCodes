package com.banking.Digi;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest01 {
  @Test
  public void Login()

  {

	  System.out.println("Executing method 01");

  }
  @Test
  public void FundTransfer()

  {

	  System.out.println("Executing method 02");

  }
  @Test
  public void UpdateAddress()

  {

	  System.out.println("Executing method 03");

  }
//by default test cases run in alphabetical order
  //Now change it to our order
  @Test
  public void XX1() 
  {
  System.out.println("Now change it to our order");
  }
  @Test(priority=1)
  public void Login1()

  {

	  System.out.println("Executing method 01");

  }
  @Test(priority=2)
  public void FundTransfer1()

  {

	  System.out.println("Executing method 02");

  }
  @Test(priority=3)
  public void UpdateAddress1()

  {

	  System.out.println("Executing method 03");

  }
  @BeforeTest
  public void LaunchBrowser()

  {

	  System.out.println("Launch Browser");

  }
  @AfterTest
  public void CloseBrowser()

  {

	  System.out.println("CloseBrowser");

  }
}
