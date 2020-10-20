package com.pboreg;

class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}
public class Pengenalan_Class_dan_Objek {
    public static void main (String[] args){
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Robert Plant";
        mahasiswa1.NIM = "2019071088";
        mahasiswa1.jurusan = "Teknik Tarik Suara";
        mahasiswa1.IPK = 3.8;
        mahasiswa1.umur = 23;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur + "\n");

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Slash";
        mahasiswa2.NIM = "2019071088";
        mahasiswa2.jurusan = "Teknik Betot Senar";
        mahasiswa2.IPK = 3.8;
        mahasiswa2.umur = 23;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }

}
