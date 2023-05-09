package com.banking.Digi;


import java.util.ArrayList;
public class ArrayListDemo {

    public static void main(String[] args) {

        //Classnam objectname =  new classname();

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo"); //to add element to the array list
        cars.add("BMW");
        cars.add("FORD");
        cars.add("MARUTI");

        System.out.println(cars);
        System.out.println(cars.size());//to find out number of elements in array
        System.out.println(cars.get(0));//get the relevment elements from array list
        cars.set(0, "Opel");//to change item is array list
        System.out.println(cars);
        cars.remove(0);//remove the element
        System.out.println(cars);
        System.out.println(cars.size());//to find out number of elements in array
        cars.clear();// to remove all elements
        System.out.println(cars);
        System.out.println(cars.size());//to find out number of elements in array


    }
}