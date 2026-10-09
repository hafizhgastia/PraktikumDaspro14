package Pertemuan7;
import java.util.Scanner;

public class StudiKasus2_14 {
    public static void main(String[] args) {
        Scanner hafizh = new Scanner(System.in);

        String NamaMahasiswa,JenisKegiatan;
        int JumlahDokumen, Juara, StatusPendanaan, Kurang;

        System.out.print("Nama mahasiswa:");
        NamaMahasiswa = hafizh.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA,BAKORMA,Mandiri,PKM atau Lainnya):");
        JenisKegiatan = hafizh.nextLine().trim().toUpperCase();

        if (JenisKegiatan.equals("BELMAWA") || JenisKegiatan.equals("BAKORMA") || JenisKegiatan.equals("Mandiri")) {
            System.out.print("Jumlah dokumen:");
            JumlahDokumen = hafizh.nextInt();
            System.out.print("Peringkat juara (0 jika bukan juara):");
            Juara = hafizh.nextInt();
            if (Juara >= 1 && Juara <= 3) {                  
                if (JumlahDokumen >= 4) {                          
                    System.out.println("Status : Berhak memperoleh dana penghargaan (Juara " + Juara + ", dokumen lengkap).");
                } else {
                    Kurang = 4-JumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + Kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }

        } else if (JenisKegiatan.equals("PKM")) {
            System.out.print("Jumlah dokumen  : ");
            JumlahDokumen = hafizh.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            StatusPendanaan = hafizh.nextInt();
 
            if (StatusPendanaan == 1) {                               
                if (JumlahDokumen >= 4) {                          
                    System.out.println("Status : Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    Kurang = 4-JumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + Kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
            }
 
        } else if (JenisKegiatan.equals("Lainnya")) {
            System.out.println("Status : Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        } else {
            System.out.println("Jenis kegiatan tidak dikenali.");
        }
        hafizh.close();
    }
}