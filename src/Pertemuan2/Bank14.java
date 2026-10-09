package Pertemuan2;
import java.util.Scanner;

public class Bank14 {
    public static void main(String[] args) {
        int Tabungan_awal, Lama_menabung;
        double Bunga, Presenytase_bunga = 0.02, Tabungan_akhir;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan tabungan awal");
        Tabungan_awal = input.nextInt();
        System.out.println("Masukkan lama menabung");
        Lama_menabung = input.nextInt();

        Bunga= Lama_menabung * Presenytase_bunga * Tabungan_awal;
        Tabungan_akhir = Tabungan_awal + Bunga;
        System.out.println("Bunga adalah " + Bunga);
        System.out.println("Tabungan akhir adalah " + Tabungan_akhir);

    }

}