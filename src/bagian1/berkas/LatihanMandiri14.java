/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian1.berkas;

/**
 *
 * @author ASUS
 * 
 */
import java.io.File;
import java.io.IOException;

public class LatihanMandiri14 {


    public static void main(String[] args) {

        // ==========================
        // No. 1 Cek file laporan.txt
        // ==========================
        File laporan = new File("laporan.txt");

        if (laporan.exists()) {
            System.out.println("Berkas laporan.txt ada.");
            System.out.println("Ukuran berkas: " + laporan.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }

        System.out.println();

        // ==========================
        // No. 2 Membuat folder arsip
        // ==========================
        File folder = new File("arsip");

        if (folder.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip sudah ada atau gagal dibuat.");
        }

        System.out.println();

        // ==========================
        // No. 3 Membuat dan menghapus file sementara.txt
        // ==========================
        File sementara = new File("sementara.txt");

        try {
            sementara.createNewFile();

            System.out.println("Sebelum dihapus, file ada? " + sementara.exists());

            sementara.delete();

            System.out.println("Sesudah dihapus, file ada? " + sementara.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

    }
}

