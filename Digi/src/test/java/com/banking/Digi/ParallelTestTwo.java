package com.banking.Digi;

import org.testng.annotations.Test;

public class ParallelTestTwo {
	 @Test(description = "login test")
	    public void TestMethodOne(){
	        @SuppressWarnings("deprecation")
	        long id =Thread.currentThread().getId();
	        System.out.println("firefox : Thread id of method one is :"+ id);

	    }
	    @Test
	    public void TestMethodTwo(){
	        @SuppressWarnings("deprecation")
	        long id =Thread.currentThread().getId();
	        System.out.println("firefox : Thread id of method two is :"+ id);
	}
}
