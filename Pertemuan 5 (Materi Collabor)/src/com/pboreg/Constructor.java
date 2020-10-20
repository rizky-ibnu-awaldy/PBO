package com.pboreg;
//class dengan constructor
class mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    // constructor dipanggil saat objek pertama kali dibuat


    // consturctor dengan parameter
    mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}
public class Constructor {
    public static void main (String[] args){
        mahasiswa mahasiswa1 = new mahasiswa("ucup", "2343434", "teknik mesin" + "\n");
        mahasiswa mahasiswa2 = new mahasiswa("udin", "2222222", "teknik mesin");
    }

}
