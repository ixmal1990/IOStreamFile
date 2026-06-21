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
import java.io.IOException;

public class Latihan2_4_No3 {
    public static void main(String[] args) {

        int jumlah = 0;

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {

            while (pembaca.readLine() != null) {
                jumlah++;
            }

        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        System.out.println("Jumlah baris: " + jumlah);
    }
}
    

