package Pertemuan4;
import java.util.Scanner;
public class KasirMinimarket14 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int Kembalian,Lembar5000,TotalBelanja,UangYgDibayarkan,SisaKembalian;
        double PersentaseKembalian;

        System.out.println("Masukkan Total Belanjaan");
        TotalBelanja=Input.nextInt();
        System.out.println("Masukkan Uang Yg Dibayarkan");
        UangYgDibayarkan=Input.nextInt();

        Kembalian=TotalBelanja-UangYgDibayarkan;
        Lembar5000=Kembalian/5000;
        SisaKembalian=Kembalian%TotalBelanja;
        PersentaseKembalian=SisaKembalian/UangYgDibayarkan*100;

        System.out.println("Kembalian Adalah" +Kembalian);
        System.out.println("Lembar Adalah" +Lembar5000);
        System.out.println("Sisa Kembalian Adalah" +SisaKembalian);
        System.out.println("Persentase Kembalian Adalah" +PersentaseKembalian);

    }
}
