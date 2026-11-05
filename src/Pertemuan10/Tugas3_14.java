package Pertemuan10;
import java.util.Scanner;

public class Tugas3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah Toko Minimal 1");
        }else {
            int totalSemua = 0;
            int barangTerbanyak = -1;
            int tokoTerbanyak = 0;
            String ringkasan = "";
            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("Toko " +i);
                int pelanggan = 0;
                do {
                    System.out.print("Jumlah pelanggan: ");
                    pelanggan = sc.nextInt();
                    if (pelanggan < 0) System.out.println("Tidak boleh negatif!");                    
                } while (pelanggan < 0);

                int totalBarangToko = 0;
                for (int j = 1; j <= pelanggan; j++) {
                    int barang = 0;
                    do {
                       System.out.println("Barang pelanggan " +j + "");
                       barang = sc.nextInt();
                       if (barang < 0) {
                        System.out.println("Tidak boleh negatif!");
                       } 
                    } while (barang < 0);
                    totalBarangToko += barang;
                }
                ringkasan += "Toko " +i +"- pelanggan: " +pelanggan +", total barang: " +totalBarangToko +"\n";
                totalSemua += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = i;
                }
                System.out.print(ringkasan);
                System.out.println("Total barang seluruh toko: " + totalSemua);
                System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
            }
        }
    }
}
