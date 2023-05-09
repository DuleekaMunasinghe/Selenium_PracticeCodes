package com.banking.Digi;


import java.util.ArrayList;



public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("FORD");
        cars.add("MARUTI");

        //for (int i=0;i) nned to add

        for (String i : cars) 
        {
            System.out.println(i);
        }   //this for loop will print all the values in the array

        	//cars.forEach((n) -> print(n)); //commented as this cause error with java version
    }
        public static void print (String n)
        {
            System.out.println("car Name is " + n);
        }

    }


