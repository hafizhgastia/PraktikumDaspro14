package Pertemuan13;

import java.util.Scanner;

public class TugasMandiri14 {
    public static void main(String[] args) {
        Scanner Hafizh = new Scanner(System.in);
        
         int[][] survei = new int[10][6];

        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survei[i].length; j++) {
                int jawab;
                do {
                    System.out.print("Pertanyaan " + (j + 1) + " (1-5): ");
                    jawab = Hafizh.nextInt();
                } while (jawab < 1 || jawab > 5);
                survei[i][j] = jawab;
            }
        }

        double totalAll = 0;

        System.out.println("\nRata-rata per responden:");
        for (int i = 0; i < survei.length; i++) {
            double total = 0;
            for (int j = 0; j < survei[i].length; j++) {
                total += survei[i][j];
            }
            totalAll += total;
            System.out.println("Responden " + (i + 1) + ": " + total / survei[i].length);
        }

        System.out.println("\nRata-rata per pertanyaan:");
        for (int j = 0; j < survei[0].length; j++) {
            double total = 0;
            for (int i = 0; i < survei.length; i++) {
                total += survei[i][j];
            }
            System.out.println("Pertanyaan " + (j + 1) + ": " + total / survei.length);
        }

        System.out.println("\nRata-rata keseluruhan: " + totalAll / (survei.length * survei[0].length));
    }
}
