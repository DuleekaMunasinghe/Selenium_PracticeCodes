package com.banking.Digi;

import org.testng.annotations.Test;

public class ExcludeGroups {


    @Test(groups = "group1")
    public void tesMethodone(){
        System.out.println("Test method one");
    }
    @Test(groups = "group1")
    public void tesMethodtwo(){
        System.out.println("Test metthod two belongs to include group");
    }
    @Test(groups = {"group1","group2"})
    public void tesMethodthree(){
        System.out.println("Test method three belongs to 2 group");
    }
    @Test(groups = { "group2"})
    public void tesMethodfour(){
        System.out.println("Test method four belongs to 2 group");
    }
}