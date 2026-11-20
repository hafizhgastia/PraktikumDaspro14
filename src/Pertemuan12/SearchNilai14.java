package Pertemuan12;
import java.util.Scanner;

public class SearchNilai14 {
    public static void main(String[] args) {
        Scanner Hafizh = new Scanner(System.in);

        System.out.print("Masukkan banyak elemen array: ");
        int n = Hafizh.nextInt();
        int[] nilai = new int[n];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = Hafizh.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari (key): ");
        int key = Hafizh.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            // System.out.println("Nilai " + key + " tidak ditemukan.");
            System.out.println("Nilai yang dicari tidak ditemukan: " + key + " tidak ada di dalam array yang berisi " + nilai.length + " data.");
        }
    }
}
