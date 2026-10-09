package Pertemuan2;
import java.util.Scanner;

public class StudiKasus2_14Modifikasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Lebar_tanah, Panjang_tanah, Diameter_kolam, Sisi_taman, Luas_tanah, Luas_taman;
        double Luas_kolam, Luas_sisa_tanah,pi=3.14;

        System.out.println("Masukkan lebar tanah");
        Lebar_tanah = input.nextInt();
        System.out.println("Masukkan panjang tanah");
        Panjang_tanah = input.nextInt();
        System.out.println("Masukkan diameter kolam");
        Diameter_kolam = input.nextInt();
        System.out.println("Masukkan sisi tanam");
        Sisi_taman = input.nextInt();

        Luas_tanah = Lebar_tanah * Panjang_tanah;
        Luas_kolam = pi * Diameter_kolam/2 * Diameter_kolam/2;
        Luas_taman = Sisi_taman * Sisi_taman;
        Luas_sisa_tanah = Luas_tanah - Luas_kolam - Luas_taman;

        System.out.println("Luas tanah adalah " + Luas_tanah);
        System.out.println("Luas kolam adalah " + Luas_kolam);
        System.out.println("Luas taman adalah " + Luas_taman);
        System.out.println("Luas sisa tanah adalah " + Luas_sisa_tanah);
        
    }
}
