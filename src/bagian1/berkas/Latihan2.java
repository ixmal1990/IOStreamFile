/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian1.berkas;

/**
 *
 * @author ASUS
 */
import java.io.File;
import java.io.IOException;

public class Latihan2 {

public static void main(String[] args) {
File berkas = new File("data.txt");
try {
if (berkas.createNewFile()) {
System.out.println("Berkas baru dibuat.");
} else {
System.out.println("Berkas sudah ada sebelumnya.");
}
} catch (IOException e) {
System.out.println("Terjadi kesalahan: " + e.getMessage());
}
}
}
    
