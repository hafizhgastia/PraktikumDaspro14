package Pertemuan13;
import java.util.Scanner;

public class BioskopWithScanner14 {
    public static void main(String[] args) {
        Scanner Hafizh = new Scanner(System.in);

        int baris, kolom, menu;
        String nama;
        String[][] penonton = new String[4][2];

        while (true) { 
            System.out.println("\n===== MENU =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = Hafizh.nextInt();
            Hafizh.nextLine();

            if(menu == 1){
                System.out.print("Masukkan nama: ");
                nama = Hafizh.nextLine();
                System.out.print("Masukkan baris (1-4): ");
                baris = Hafizh.nextInt();
                System.out.print("Masukkan kolom (1-2): ");
                kolom = Hafizh.nextInt();
                Hafizh.nextLine();
                penonton[baris-1][kolom-1] = nama;
                System.out.println("Data tersimpan.");
            } 
            else if(menu == 2){
                System.out.println("\nDaftar Penonton:");
                for(int i = 0; i < penonton.length; i++){
                    for(int j = 0; j < penonton[i].length; j++){
                        if(penonton[i][j] != null)
                            System.out.print(penonton[i][j] + "\t");
                        else
                            System.out.print("-\t");
                    }
                    System.out.println();
                }
            }
            else if(menu == 3){
                break;
            }
            else{
                System.out.println("Pilihan salah!");
            }
        }
    }
}
