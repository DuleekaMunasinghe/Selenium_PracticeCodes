package com.banking.Digi;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExceptionTest {
	@Test(expectedExceptions = IOException.class)
	public void test1() throws Exception {
		throw new IOException();
	}

	@Test(expectedExceptions = {NullPointerException.class })
	public void test2() throws Exception {
		throw new NullPointerException();
	}
}

//the test will fail when expected exception list does not match with the exception thrown