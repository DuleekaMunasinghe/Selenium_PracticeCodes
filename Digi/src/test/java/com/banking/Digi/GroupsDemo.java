package com.banking.Digi;

import org.testng.annotations.Test;

public class GroupsDemo {
  @Test(priority=1, groups="Module01")
  public void Testcase1() 
  {
	  System.out.println("Executed Method 01");
  }
  
  @Test(priority=1, groups="Module01")
  public void Testcase2() 
  {
	  System.out.println("Executed Method 02");
  }
  
  @Test(priority=1, groups="Module01")
  public void Testcase3() 
  {
	  System.out.println("Executed Method 03");
  }
  
  @Test(priority=1, groups="Module02")
  public void Testcase4() 
  {
	  System.out.println("Executed Method 04");
  }
  
  @Test(priority=1, groups="Module02")
  public void Testcase5() 
  {
	  System.out.println("Executed Method 05");
  }
}
