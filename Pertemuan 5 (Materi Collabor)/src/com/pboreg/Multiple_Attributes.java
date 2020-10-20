package com.pboreg;

public class Multiple_Attributes {
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main (String[] args){
        Multiple_Attributes myObj = new Multiple_Attributes();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}
