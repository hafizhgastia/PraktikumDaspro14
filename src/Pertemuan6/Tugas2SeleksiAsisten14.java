package Pertemuan6;
import java.util.Scanner;

public class Tugas2SeleksiAsisten14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean terkenaSanksi;
        boolean sertifikatKompetensi;
        int nilaiDasarPemrograman;
        int nilaiWawancara;

        System.out.println("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.println("Apakah sedang mendapat sanksi akademik? (true/false): ");
        terkenaSanksi = sc.nextBoolean();
        System.out.println("Nilai Dasar Pemrograman: ");
        nilaiDasarPemrograman = sc.nextInt();
        System.out.println("Memiliki sertifikasi kompetensi? (true/false): ");
        sertifikatKompetensi = sc.nextBoolean();
        System.out.println("Nilai wawancara: ");
        nilaiWawancara = sc.nextInt();

        if (mahasiswaAktif && !terkenaSanksi) {
            if (nilaiDasarPemrograman >= 78 || sertifikatKompetensi) {
                if (nilaiWawancara >= 73) {
                    System.out.println("Mahasiswa diterima sebagai asisten praktikum");
                } else {
                    System.out.println("Gagal tahap wawancara: nilai wawancara kurang dari 73");
                }
                }else {
                    System.out.println("Gagal tahap akademik: niali Dasar Pemrograman kurang dari 78 " + "dan tidak memiliki sertifikat kompetensi");
                } 
            }else {
                System.out.println("Gagal tahap awal: mahasiswa tidak aktif dan sedang mendapat sanksi akademik");
            }
        }
    }
