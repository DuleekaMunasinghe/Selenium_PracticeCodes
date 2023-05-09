package com.banking.Digi;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleDataProvider {
	@DataProvider(name = "browserdata")
    public Object [] [] dataProviderMethod(){
        return new Object [] [] {{"chome"}, {"firefox"}, {"safari"}, {"ie"}};

    }
    @Test(dataProvider= "browserdata")

    public void testMethod(String data){
        System.out.println("Browser executed :"+data);
  }
}
