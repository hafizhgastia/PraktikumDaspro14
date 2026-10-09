package Pertemuan5;
import java.util.Scanner;

public class Tugas1Pemilihan14 {
    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false):");
        boolean uktLunas = Input.nextBoolean();

        // if (uktLunas) {
        //     System.out.println("Pembayaran UKT terverifikasi");
        //     System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        // }
        // else {
        //     System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulus");
        // }
        String pesan=(uktLunas) ? "Pembayaran UKT terverifikasi":"Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu";
        System.out.println(pesan);
    }
}