package com.banking.Digi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
  @Test(dependsOnMethods= {"Login"})
  public void FundTransfer() {
	  System.out.println("Fund Transfer Method Called");
  }
  @Test
  public void Login() {
	  System.out.println("Login Method Called");
	  Assert.assertTrue(true);
  }
}
