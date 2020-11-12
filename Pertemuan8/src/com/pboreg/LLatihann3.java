package com.pboreg;
interface luas{
    public void setSisi(double...sisi);
    public double getLuas();
}
class LuasSegitiga implements luas{
    private double alas;
    private double tinggi;
    public void setSisi(double... sisi){
        this.alas = sisi[0];
        this.tinggi = sisi[1];
    }
   public double getLuas(){
        double luas = 0.5 * this.alas * this.tinggi;
        return luas;
   }
   public double getAlas(){
        return this.alas;
   }
   public double getTinggi(){
        return this.tinggi;
   }
}
public class LLatihann3 {
    public static void main(String[]args){
        LuasSegitiga ls = new LuasSegitiga();
        ls.setSisi(5,10);
        System.out.println("Luas Segitiga: 0.5 x " + ls.getAlas() + " x " + ls.getTinggi() + " = " + ls.getLuas());
    }
}
