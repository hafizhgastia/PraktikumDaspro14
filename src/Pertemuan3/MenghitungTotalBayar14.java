package Pertemuan3;
import java.util.Scanner;

public class MenghitungTotalBayar14 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        double harga;
        double potongan;
        double jml_bayar;
        double diskon=0.15;
        
        System.out.println("Masukkan harga");
        harga=sc.nextInt();

        potongan=diskon*harga;
        jml_bayar=harga-potongan;
        System.out.println("jumlah yang harus anda bayar adalah Rp. " +jml_bayar);
    }
}
