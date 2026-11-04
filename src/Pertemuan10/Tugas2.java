package Pertemuan10;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai n= ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("n minimal 3");
        }else {
            int total=0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int Hasil = i*j;
                    System.out.printf("%4d", Hasil);
                    total+=Hasil;
                }
                System.out.println();
            }
            System.out.println("Total Seluruh Angka= " +total);
        }
        sc.close();
    }
}
