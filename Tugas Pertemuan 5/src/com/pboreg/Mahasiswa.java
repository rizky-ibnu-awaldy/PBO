package com.pboreg;

public class Mahasiswa {
    public static void main(String[] args){
        Data_Mahasiswa data = new Data_Mahasiswa();
        System.out.println("Nama Mahasiswa: " + data.nama);
        System.out.println("NIM: " + data.NIM);
        System.out.println("Program Studi: " + data.prodi);
        System.out.println("IPK: " + data.tampilkanIPK());
        System.out.println("Usia: " + data.tampilkanUsia() + " Tahun");
    }
}
