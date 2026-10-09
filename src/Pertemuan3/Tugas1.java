package Pertemuan3;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int harga_laptop, uang_muka, lama_cicilan, sisa_harga;
        double bunga=0.02, total_cicilan, total_bunga, jumlah_cicilan; 
        
        System.out.println("Masukkan Harga Laptop");
        harga_laptop=input.nextInt();
        System.out.println("Masukkan Uang Muka");
        uang_muka=input.nextInt();
        System.out.println("Masukkan Lama Cicilan");
        lama_cicilan=input.nextInt();

        sisa_harga=harga_laptop-uang_muka;
        total_bunga=bunga*sisa_harga;
        total_cicilan=sisa_harga/lama_cicilan;
        jumlah_cicilan=total_cicilan+total_bunga;
        System.out.println("Jumalah Cicilan Adalah " +jumlah_cicilan);

    }
}
