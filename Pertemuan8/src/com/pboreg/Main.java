package com.pboreg;
//class Abstract
abstract class Hewan{
    //Abstract Method (tidak memiliki bodi)
    public abstract void suaraHewan();

    //Regular Method
    public void tidur() {
        System.out.println("Zzz....");
    }
}
//Sublass (turunan dari Class Hewan)
class Ayam extends Hewan {
    public void suaraHewan(){
        // Body dari abstract method suaraHewan() ditulis disini
        System.out.println("Kukuruyuk");
    }
}
class Kucing extends Hewan {
    public void suaraHewan(){
        // Body dari abstract method suaraHewan() ditulis disini
        System.out.println("Meong");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Ayam ayamku = new Ayam();//membuat objek ayam
        Kucing kucingku = new Kucing();
        ayamku.suaraHewan();
        ayamku.tidur();
        kucingku.suaraHewan();
        kucingku.tidur();

    }
}
