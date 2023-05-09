package com.banking.Digi;

import org.testng.annotations.Test;

public class TimeTest {
	@Test(timeOut = 500) // determin the time execution on test level
	public void test1() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Test meythod one called");

	}

	@Test(timeOut = 300) // this test will fail as it is taking more time that specified for the test
							// execution
	public void test2() throws InterruptedException {
		Thread.sleep(250);
		System.out.println("Test meythod two  called");
	}
}
