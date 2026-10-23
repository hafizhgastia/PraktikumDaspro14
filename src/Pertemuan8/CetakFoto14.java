//P=14 
// Harga per lembar kode 1 4R 3000+(14 mod 4)x500= 4000,
// Harga per lembar kode 2 5R 5000+(14 mod 4) x500=6000, 
// Harga per lembar kode 3 10R 15000+(14 mod 4)x500=16000
// B 15+(14 mod 6)=17
// S 40+(14 mod 5)x5=60

package Pertemuan8;
import java.util.Scanner;

public class CetakFoto14 {
    public static void main(String[] args) {
    Scanner Hafizh = new Scanner(System.in);

    String Layanan;
    int BiayaDasar, KodeUkuran=0,JumlahLembar=0,layananKilat;
    Double Tambahan,TotalBayar;

    System.out.print("Masukkan Kode layanan: ");
    KodeUkuran = Hafizh.nextInt();
    System.out.print("Masukkan Jumlah Lembaran: ");
    JumlahLembar = Hafizh.nextInt();

    switch (KodeUkuran) {
        case 1:
            if (JumlahLembar > 17) {
                BiayaDasar=4000;
                Tambahan=BiayaDasar*0.25;
                TotalBayar=BiayaDasar+Tambahan;
                System.out.println("Biaya Dasar: " +BiayaDasar);
                System.out.println("Tambahan: " +Tambahan);
                System.out.println("Total yang di Bayar: " +TotalBayar);
            } else if (JumlahLembar > 60) {
                BiayaDasar=4000;
                Tambahan=0.0;
                TotalBayar=BiayaDasar+Tambahan;
                System.out.println("Biaya Dasar: " +BiayaDasar);
                System.out.println("Tambahan: 0");
                System.out.println("Total yang di Bayar: " +TotalBayar);
            } else {
                System.out.println("Input Tidak Valid");
            }
            
            break;
        case 2:
            if (JumlahLembar > 17) {
                BiayaDasar=6000;
                Tambahan=BiayaDasar*0.25;
                TotalBayar=BiayaDasar+Tambahan;
                System.out.println("Biaya Dasar: " +BiayaDasar);
                System.out.println("Tambahan: " +Tambahan);
                System.out.println("Total yang di Bayar: " +TotalBayar);
            } else if (JumlahLembar > 60) {
                BiayaDasar=6000;
                Tambahan=0.0;
                TotalBayar=BiayaDasar+Tambahan;
                System.out.println("Biaya Dasar: " +BiayaDasar);
                System.out.println("Tambahan: 0");
                System.out.println("Total yang di Bayar: " +TotalBayar);
            } else {
                System.out.println("Input Tidak Valid");
            } 
            break;
        case 3:
                if (JumlahLembar > 17) {
                BiayaDasar=16000;
                Tambahan=BiayaDasar*0.25;
                TotalBayar=BiayaDasar+Tambahan;
                System.out.println("Biaya Dasar: " +BiayaDasar);
                System.out.println("Tambahan: " +Tambahan);
                System.out.println("Total yang di Bayar: " +TotalBayar);
            } else if (JumlahLembar > 60) {
                BiayaDasar=16000;
                Tambahan=0.0;
                TotalBayar=BiayaDasar+Tambahan;
                System.out.println("Biaya Dasar: " +BiayaDasar);
                System.out.println("Tambahan: 0");
                System.out.println("Total yang di Bayar: " +TotalBayar);
            } else {
                System.out.println("Input Tidak Valid");
            }
    
            break;
        }
     }
}
// Layanan
// Biaya Dasar
// Tambahan
// Total Bayar