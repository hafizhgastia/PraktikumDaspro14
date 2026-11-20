package Quiz2;
import java.util.Scanner;

public class Pengunjung_14 {
    public static void main(String[] args) {
        Scanner Hafizh = new Scanner(System.in);
        String namaToko, tambahToko, pesan="";
        int jumlahPengunjung=0, hari=0, berkembang=0, sebelumnya=0;

        do {
            System.out.print("Nama Toko: ");
            namaToko = Hafizh.nextLine();
            for (int i = 1; i <= 5; i++) {
                System.out.print("Pengunjung hari " +i +": ");
                jumlahPengunjung = Hafizh.nextInt();
                if (jumlahPengunjung < 0) {
                    System.out.println("Data tidak valid, Ulangi!");
                    i--;
                    continue;
                }
                if (i == 1 || jumlahPengunjung > sebelumnya) {
                    hari++;
                    sebelumnya=jumlahPengunjung;
                }
                if (hari >= 3) {
                    pesan = "Status : Berkembang";
                } else {
                    pesan = "Status : Tidak berkembang";
                }
        
            }
            System.out.println("Hari naik : " + (hari-1));
            System.out.println(pesan);

            System.out.print("Tambah toko lagi? (y/t): ");
            tambahToko = Hafizh.nextLine();
            Hafizh.nextLine();
            
        } while (!tambahToko.equalsIgnoreCase("t"));
    }
}
