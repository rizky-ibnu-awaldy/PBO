package com.pboreg;

public class Constructor_Parameters2 {
    int modelYear;
    String modelName;

    public Constructor_Parameters2(int year, String name){
        modelYear = year;
        modelName = name;

    }
    public static void main (String[] args){
        Constructor_Parameters2 myCar = new Constructor_Parameters2 (1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
