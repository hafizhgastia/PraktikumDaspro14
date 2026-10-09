package Pertemuan5;
import java.util.Scanner;

public class TugasParkir14 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int LamaParkir, LamaLebihan, TarifDasar=2000, TarifLebih=1000, TotalHarga;
        System.out.println("Masukkan Lama Parkir:");
        LamaParkir = Input.nextInt();

        LamaLebihan=LamaParkir-2;
        TotalHarga=LamaLebihan*TarifLebih+TarifDasar;
        TarifDasar=2000;

        if (LamaParkir >= 2) {
            System.out.println("Total Harga" +TotalHarga);
        }
        else {
            System.out.println("Tarif Awal" +TarifDasar);
        }
    }
}