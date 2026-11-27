package Pertemuan13;
import java.util.Scanner;

public class SIAKAD14 {
    public static void main(String[] args) {
        Scanner Hafizh = new Scanner(System.in);

        int[][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" +(i+1));

            for (int j = 0; j < nilai.length; j++) {
                System.out.print("Nilia mata kuliah " +(j+1) +":");
                nilai[i][j] = Hafizh.nextInt();
            }
        }
    }
}
