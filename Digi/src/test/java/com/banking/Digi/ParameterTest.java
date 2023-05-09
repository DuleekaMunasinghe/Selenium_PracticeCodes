package com.banking.Digi;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class ParameterTest {
	
	@Parameters("username")
	@Test
	public void test1(String name) {
		System.out.println("Test meythod one called");
		System.out.println("Test meythod one parameter is :" + name);

	}

	@Parameters("password")

	@Test
	public void test2(String pwd) {

      System.out.println("Test meythod two called" );
      System.out.println("Test meythod two parameter is :" + pwd);

}
}