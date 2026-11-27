package Pertemuan13;
import java.util.Scanner;

public class BioskopWithScanner14 {
    public static void main(String[] args) {
        Scanner Hafizh = new Scanner(System.in);

        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) { 
            System.out.print("Masukkan nama: ");
            nama = Hafizh.nextLine();
            System.out.print("Masukkan baris: ");
            baris = Hafizh.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = Hafizh.nextInt();
            Hafizh.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            pilihan = Hafizh.nextLine();

            if (pilihan.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
