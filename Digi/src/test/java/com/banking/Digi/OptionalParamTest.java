package com.banking.Digi;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParamTest {
	@Parameters({"browser", "url"})
	@Test
	public void test1(@Optional("Firfox") String tetParameters1, @Optional ("http://google.com")String testParameters2) {
		System.out.println("Test parameter1 :"+ tetParameters1);
		 System.out.println("Test parameter2 :"+ testParameters2 );
	}
	@Test
    @Parameters({"username"})
    public void test2(@Optional("Duleeka")String name){
    System.out.println("Parameters one for test method two :" +name);
    }
}
