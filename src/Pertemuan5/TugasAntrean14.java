package Pertemuan5;
import java.util.Scanner;

public class TugasAntrean14 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Masukkan Layanan:");
        int Layanan = Input.nextInt();

        switch (Layanan) {
            case 1:
                System.out.println("Legalisir Ijazah");
                break;
            case 2:
                System.out.println("Surat Keterangan Aktif Kuliah");
                break;
            case 3:
                System.out.println("Pembayaran UKT");
                break;
            case 4:
                System.out.println("Pengajuan Cuti Akademik");
                break;        
            default:
                System.out.println("Layanan Tidak Tersedia");
                break;
        }
    }
}
