package Pertemuan3;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lembar, biayacetak=500, biayajilid=5000, totalbiaya;

        System.out.println("Masukkan Lembar");
        lembar=input.nextInt();
        totalbiaya=(biayacetak*lembar)+biayajilid;
        System.out.println("Total Biaya Adalah " +totalbiaya);
       }
    
}
