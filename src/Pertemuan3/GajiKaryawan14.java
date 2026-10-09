package Pertemuan3;
import java.util.Scanner;

public class GajiKaryawan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int gajiPokok;
        double bonus, totgaji, totgajibulat;
        double tunjTranp=600000;
        double tunjMkn=400000;
        
        System.out.println("Masukkan gajiPokok");
        gajiPokok=sc.nextInt();

        bonus=0.05*gajiPokok;
        totgaji=gajiPokok+tunjTranp+tunjMkn+bonus-(0.1*gajiPokok);
        totgajibulat=(int)totgaji;
        System.out.println("Bonus Bulanan anda adalah Rp. " +bonus);
        System.out.println("Gaji yang diterima adalah Rp. " +totgaji);
    }
}
