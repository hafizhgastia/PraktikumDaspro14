package Pertemuan2;

public class StudiKasus1_14 {
    public static void main(String[] args) {
        int Gaji_pokok=5000000, Tunjangan=100000, Jumlah_anak=4,Total_tunjangan;
        double potongan=0.1, Gaji_bersih,Total_potongan;

        Total_tunjangan = Tunjangan * Jumlah_anak;
        Total_potongan = potongan * Gaji_pokok;
        Gaji_bersih = Gaji_pokok + Total_tunjangan - Total_potongan;

        System.out.println("Total tunjangan adalah " + Total_tunjangan);
        System.out.println("Total potongan adalah " + Total_potongan);
        System.out.println("Gaji bersih adalah " + Gaji_bersih);

    }
}
