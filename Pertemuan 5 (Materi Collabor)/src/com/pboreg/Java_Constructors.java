package com.pboreg;

public class Java_Constructors {
    int x; // create a class attributes


    // create a class constructor for the Java
    public Java_Constructors(){
        x = 5; // set the initial value for the class attribute x
    }

    public static void main (String[] args){
        Java_Constructors myObj = new Java_Constructors();//create an object of class Java_Constructors
                                                          // (this will call the constructor)
        System.out.println(myObj.x);// print the value of x


    }
}
