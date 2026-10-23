//P=14
//(batas perulangan FOR) = 8 + (14 mod 5)=12
//Batas kelulusan pada Pertanyaan no. 4 (modifikasi kode) = 55 + (14 mod 11)=58 → gantikan angka 60 pada soal 
package Pertemuan9;
import java.util.Scanner;

public class SiakadFor14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlMahasiswaLulus=0, jmlMahasiswaTdkLulus=0;
        double nilai, tertinggi=0, terendah=100;

        for (int i = 1; i <= 12; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 58) {
                jmlMahasiswaLulus++;
            } else {
                jmlMahasiswaTdkLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " +tertinggi);
        System.out.println("Nilai terendah: " +terendah);
        System.out.println("Jumlah Mahasiswa Lulus: " +jmlMahasiswaLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " +jmlMahasiswaTdkLulus);
    }
}
