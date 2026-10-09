package Pertemuan2;

public class StudiKasus2_14 {
    public static void main(String[] args) {
        int Lebar_tanah=30, Panjang_tanah=100, Diameter_kolam=5, Sisi_taman=2, Luas_tanah, Luas_taman;
        double Luas_kolam, Luas_sisa_tanah,pi=3.14;

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

