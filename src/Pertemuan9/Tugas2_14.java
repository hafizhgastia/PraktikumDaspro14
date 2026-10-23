//P=14
//Tarif parkir mobil = 2500 + (14 mod 6) × 250 per jam=3000 → gantikan Rp3.000 pada soal
//Tarif parkir motor = 1500 + (14 mod 6) × 250 per jam=2000 (gunakan nilai (P mod 6) yang SAMA dengan tarif mobil) → gantikan Rp2.000 pada soal
package Pertemuan9;
import java.util.Scanner;

public class Tugas2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi=0, total=0;

        do {
            System.out.print("Masukkan Jenis Kendaraan: ");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir per jam: ");
                durasi = sc.nextInt();
            
                if (jenis == 1) {
                    total+=durasi*3000;
                } else {
                total+=durasi*2000;
                }
            } else {
        }
        
        } while (jenis!=0);

        System.out.println("Total harga parkiran: Rp " +total);
    }
}
