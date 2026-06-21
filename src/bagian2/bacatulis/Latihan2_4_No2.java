/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian2.bacatulis;

/**
 *
 * @author ASUS
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Latihan2_4_No2 {
    public static void main(String[] args) {

        // Append ke file
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {

            penulis.println("Sabtu");
            penulis.println("Minggu");

            System.out.println("Berhasil menambahkan data.");

        } catch (IOException e) {
            System.out.println("Gagal menambah: " + e.getMessage());
        }

        System.out.println("\nIsi file hari.txt:");

        // Membaca seluruh isi file
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {

            String baris;

            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }

        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}
    

