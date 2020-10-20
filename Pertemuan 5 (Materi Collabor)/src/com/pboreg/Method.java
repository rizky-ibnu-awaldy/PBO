package com.pboreg;
class Mahasiswa3{
    // Data member
    String nama;
    String NIM;

    // constructor
    Mahasiswa3(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }
    //Method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    //Method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }
    //Method dengan return tapi tidak ada parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }
    // method dengan return dan dengan parameter
    String sayHalo(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}



public class Method {
    public static void main(String[] args) {
        Mahasiswa3 mahasiswa1 = new Mahasiswa3("ucup","4444444");
        // method
        mahasiswa1.show();
        mahasiswa1.setNama("Budi");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHalo("haloo");
        System.out.println(data);
    }
}
