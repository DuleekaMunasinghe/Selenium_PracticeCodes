package com.banking.Digi;

import org.testng.annotations.Test;

public class DisabledTest {


    @Test
    public void TestCase01(){
        System.out.println("Executing method 01");
    }

    @Test
    public void TestCase02(){
        System.out.println("Executing method 02");
    }
    @Test(enabled = false) // this won't execute
    public void TestCase03(){
        System.out.println("Executing method 03");
    }
    @Test(enabled = true)
    public void TestCase04(){
        System.out.println("Executing method 04");
    }
}