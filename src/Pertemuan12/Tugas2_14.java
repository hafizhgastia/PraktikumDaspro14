package Pertemuan12;
import java.util.Scanner;

public class Tugas2_14 {
    static int cariMenu(String[] menu, String namaDicari) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(namaDicari)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner Hafizh = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("===== DAFTAR MENU KAFE KAMPUS =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-16s Rp%d%n", (i + 1), menu[i], harga[i]);
        }
        System.out.println();
        System.out.print("Cari menu: ");
        String cari = Hafizh.nextLine();
        int hasilCari = cariMenu(menu, cari);
        if (hasilCari != -1) {
            System.out.println(menu[hasilCari] + " tersedia, harga Rp" + harga[hasilCari]);
        } else {
            System.out.println("Menu \"" + cari + "\" tidak tersedia.");
        }
        System.out.println();
        System.out.print("Jumlah item yang dipesan: ");
        int jumlah = Integer.parseInt(Hafizh.nextLine());

        String[] pesanan = new String[jumlah];
        int total = 0;

        for (int i = 0; i < pesanan.length; i++) {
            int idx = -1;
            while (idx == -1) {
                System.out.print("Pesanan ke-" + (i + 1) + ": ");
                String nama = Hafizh.nextLine();
                idx = cariMenu(menu, nama);
                if (idx == -1) {
                    System.out.println("Menu tidak tersedia, silakan coba lagi.");
                }
            }
            pesanan[i] = menu[idx];
            total += harga[idx];
        }
        System.out.println();
        System.out.println("========== DAFTAR PESANAN ==========");
        for (int i = 0; i < pesanan.length; i++) {
            int idx = cariMenu(menu, pesanan[i]);
            System.out.printf("%d. %-16s Rp%d%n", (i + 1), pesanan[i], harga[idx]);
        }
        System.out.println("------------------------------------");
        System.out.println("Total biaya : Rp" + total);
    }
}
