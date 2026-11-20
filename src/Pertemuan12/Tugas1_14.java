package Pertemuan12;
import java.util.Scanner;

public class Tugas1_14 {
    public static void main(String[] args) {
        Scanner Hafizh = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int n = Hafizh.nextInt();
        int[] nilaiMhs = new int[n];
        int total = 0;    
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = Hafizh.nextInt();
            total += nilaiMhs[i];
        }
        rata2 = (double) total / nilaiMhs.length;

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }
        System.out.println();
        System.out.println("Rata-rata: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println();

        for (int i = 0; i < nilaiMhs.length; i++) {
            String status;
            if (nilaiMhs[i] > 70) {
                status = "LULUS";
            } else {
                status = "TIDAK LULUS";
            }
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i] + " (" + status + ")");
        }
    }
}
