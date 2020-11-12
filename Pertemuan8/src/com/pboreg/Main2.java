package com.pboreg;
// interface
interface Mamalia{
    //interface method
    public void habitat();
    public void tidur();
}
interface MakhlukHidup{
    public void bernafas();
    public void bernama();
}
class Hewan1 implements Mamalia, MakhlukHidup{
    @Override
    public void habitat() {
        System.out.println("Habitat: Padang Rumput");
    }

    @Override
    public void tidur() {
        System.out.println("khhh....");
    }

    @Override
    public void bernafas() {
        System.out.println("paru-paru");
    }

    @Override
    public void bernama() {
        System.out.println("Keledai");
    }
}
public class Main2 {
    public static void main (String[] args){
        Hewan1 keledai = new Hewan1();
        keledai.habitat();
        keledai.tidur();
        keledai.bernafas();
        keledai.bernama();
    }
}
