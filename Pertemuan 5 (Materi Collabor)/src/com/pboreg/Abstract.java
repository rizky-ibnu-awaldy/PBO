package com.pboreg;
// code from filename: Multiple_Attributes.java
// abstract class
public class Abstract {
    public String fname = "John";
    public int age = 24;
}

// subclass (inherit from Multiple_Attributes)
class Student extends Multiple_Attributes{
    public int graduationYear = 2018;
    public void study(){
        System.out.println("Studying all day long");
    }
}
// end code from filename: Multiple_Attributes

// code from filename:
class kelasku {
    public static void main (String[] args){
        // create an object of the Student class (which inherits attributes and method from person)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation year: " + myObj.graduationYear);
        myObj.study();// call abstract method
    }
}
