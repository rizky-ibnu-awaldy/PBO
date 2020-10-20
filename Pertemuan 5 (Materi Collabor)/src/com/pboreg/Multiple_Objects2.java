package com.pboreg;

public class Multiple_Objects2 {
    int x = 5;

    public static void main (String[] args){
        Multiple_Objects2 myObj1 = new Multiple_Objects2();//objek1
        Multiple_Objects2 myObj2 = new Multiple_Objects2();//objek2
        myObj2.x = 25;
        System.out.println(myObj1.x);// output = 5
        System.out.println(myObj2.x);// output = 25
    }
}
