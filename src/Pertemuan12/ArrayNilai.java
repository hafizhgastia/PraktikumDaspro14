package Pertemuan12;
import java.util.Scanner;

public class ArrayNilai {
    public static void main(String[] args) {
        Scanner Hafizh = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = Hafizh.nextInt();
        }
        for (int nilai = nilaiAkhir.length; nilai > 0; nilai--) {
            int no = nilaiAkhir[nilaiAkhir.length - nilai];
            String hasil;
            if (no > 70) {
                hasil = "LULUS";
            } else {
                hasil = "TIDAK LULUS";
            }
            System.out.println("Mahasiswa ke-" + (nilaiAkhir.length - nilai + 1) + " | nilai " + no + " | " + hasil);
            // if (nilaiAkhir[i] > 70) {
            //     System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
            // }
        }
    }
}
