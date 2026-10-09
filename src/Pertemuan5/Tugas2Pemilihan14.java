package Pertemuan5;
import java.util.Scanner;

public class Tugas2Pemilihan14 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah SKS:");
        int JumlahSKS = Input.nextInt();

        if (JumlahSKS >24) {
            System.out.println("Melebihi batas");
        }
        else {
            System.out.println("KRS valid");
        }
    }
}
