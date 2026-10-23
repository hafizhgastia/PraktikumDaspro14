//P=14
//Harga tiket = 40000 + (14 mod 6) × 2000=44000 → gantikan Rp50.000 pada soal
//Syarat diskon pertama = lebih dari (3 + (14 mod 3))=5 tiket, dengan diskon (8 + (14 mod 5))%=12% → gantikan "lebih dari 4 tiket, diskon 10%"
//Syarat diskon kedua = lebih dari (8 + (14 mod 4))=10 tiket, dengan diskon (15 + (P mod 4))%=17% → gantikan "lebih dari 10 tiket, diskon 15%"
package Pertemuan9;
import java.util.Scanner;

public class Tugas1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket=44000, jmlTiket, totalTiket=0,i=0;
        double diskon=0, totalPenjualan=0, totalHarga;

        while (true) { 
            System.out.print("Masukkan Jumlah Tiket yang dibeli: ");
            jmlTiket = sc.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif");
                continue;
            }
            if (jmlTiket == 0) {
                break;
            }

            totalHarga=jmlTiket*hargaTiket;

            if (jmlTiket > 5) {
                diskon=0.12;
            } else if (jmlTiket > 10) {
                diskon=0.17;
            } 

            totalPenjualan=totalHarga*diskon-totalHarga;

            totalTiket+=jmlTiket;
            totalPenjualan+=totalHarga;

            i++;
        }
        System.out.println("Total tiket: " +totalTiket);
        System.out.println("Total penjualan: Rp " +totalPenjualan);
    }
}
