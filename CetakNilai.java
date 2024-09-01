
package com.mycompany.tugas_1;

public class CetakNilai {
    public static void main (String[] args){
        Nilai mahasiswa1 = new Nilai();
        Nilai mahasiswa2 = new Nilai();

        mahasiswa1.npm = 12345;
        mahasiswa1.name = "John";
        mahasiswa1.absen = 100;
        mahasiswa1.tugas = 90;
        mahasiswa1.uts = 80;
        mahasiswa1.uas = 70;
        mahasiswa1.Nilai();
        mahasiswa1.Nilaii();

        System.out.println();

        mahasiswa2.npm = 98765;
        mahasiswa2.name = "Smith";
        mahasiswa2.absen = 75;
        mahasiswa2.tugas = 75;
        mahasiswa2.uts = 75;
        mahasiswa2.uas = 75;
        mahasiswa2.Nilai();
        mahasiswa2.Nilaii();
    }
}