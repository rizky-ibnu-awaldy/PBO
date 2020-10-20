package com.pboreg;

public class Modify_Attributes3 {
    final int x = 10;

    public static void main (String[] args){
        Modify_Attributes3 myObj = new Modify_Attributes3();
        //myObj.x = 25;// will generate an error: cannot assign a value to final variable
        System.out.println(myObj.x);
    }
}
