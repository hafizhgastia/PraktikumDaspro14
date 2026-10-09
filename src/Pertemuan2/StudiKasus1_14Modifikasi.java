package Pertemuan2;
import java.util.Scanner;

public class StudiKasus1_14Modifikasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Gaji_pokok, Tunjangan, Jumlah_anak,Total_tunjangan;
        double potongan=0.1, Gaji_bersih,Total_potongan;
        
        System.out.println("Masukkan gaji pokok");
        Gaji_pokok = input.nextInt();
        System.out.println("Masukkan tunjangan");
        Tunjangan = input.nextInt();
        System.out.println("Masukkan jumlah anak");
        Jumlah_anak = input.nextInt();

        Total_tunjangan = Tunjangan * Jumlah_anak;
        Total_potongan = potongan * Gaji_pokok;
        Gaji_bersih = Gaji_pokok + Total_tunjangan - Total_potongan;

        System.out.println("Total tunjangan adalah " + Total_tunjangan);
        System.out.println("Total potongan adalah " + Total_potongan);
        System.out.println("Gaji bersih adalah " + Gaji_bersih);

    }


}
