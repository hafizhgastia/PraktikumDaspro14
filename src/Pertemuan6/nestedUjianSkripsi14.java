package Pertemuan6;
import java.util.Scanner;

public class nestedUjianSkripsi14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String bebasKompen;
        int bimbingP1, bimbingP2;
        String pesan;

        System.out.println("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak) : ");
        bebasKompen = sc.nextLine().trim();
        System.out.println("Masukkan jumlah log bimbingan Pembimbing 1: ");
        bimbingP1 = sc.nextInt();
        System.out.println("Masukkan jumlah log bimbingan Pembimbing 2: ");
        bimbingP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbingP1 >= 10 && bimbingP2 >= 5) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbingP1 < 10 && bimbingP2 < 5) {
                pesan = "Gagal Log bimbingan P1 kurang dari 10 kali dan P2 kurang dari 5 kali";
            } else if (bimbingP1 < 10) {
                pesan = "Gagal Log bimbingan P1 belum mencapai 10 kali";
            } else {
                pesan = "Gagal Log bimbingan P2 belum mencapai 5 kali";
            }
        } else {
            pesan = "Gagal Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
    }
}