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
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Latihan4 {

public static void main(String[] args) {
try (BufferedReader pembaca = new BufferedReader(new FileReader("mahasiswa.txt"))){
String baris;
int nomor = 1;
while ((baris = pembaca.readLine()) != null) {
System.out.println(nomor + ". " + baris);
nomor++;
}
} catch (IOException e) {
System.out.println("Gagal membaca: " + e.getMessage());
}
}
}
