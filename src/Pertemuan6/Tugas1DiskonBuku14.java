package Pertemuan6;
import java.util.Scanner;

public class Tugas1DiskonBuku14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenis;
        int jumlah;
        double diskon;

        System.out.println("Jenis buku (kamus/novel/lainnya): ");
        jenis = sc.nextLine();
        System.out.println("Jumlah buku: ");
        jumlah = sc.nextInt();
        
        if (jenis.equalsIgnoreCase("kamus")) {
            diskon =  12;
            if (jumlah > 3) {
                diskon += 2;
           } 
        }else if (jenis.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (jumlah >3) {
                diskon += 2;
            } else {
                diskon += 1;
            }
        }else {
            diskon = 0;
            if (jumlah > 3) {
                diskon += 5;
            }
        }
        
        System.out.println("Diskon: " +diskon+"%");
    }
}
