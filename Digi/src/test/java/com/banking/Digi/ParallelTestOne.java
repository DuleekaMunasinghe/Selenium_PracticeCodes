package com.banking.Digi;

import org.testng.annotations.Test;

public class ParallelTestOne {
	 @Test(description = "login test")
	    public void TestMethodOne(){
	        @SuppressWarnings("deprecation")
	        long id =Thread.currentThread().getId();
	        System.out.println("crome : Thread id of method one is :"+ id);

	    }
	    @Test(description = "fund transfer test")										
	    public void TestMethodTwo(){
	        @SuppressWarnings("deprecation")
	        long id =Thread.currentThread().getId();
	        System.out.println("crome : Thread id of method two is :"+ id);
  }
}
