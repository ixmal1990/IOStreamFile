/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian3.kontak;

/**
 *
 * @author ASUS
 */
public class MainKontak {
public static void main(String[] args) {

        BukuKontak buku = new BukuKontak("kontak.txt");

        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@gmail.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@gmail.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@gmail.com"));

        buku.tampilkanSemua();

        buku.simpanKeBerkas();

        System.out.println();

        buku.cariKontak("Budi");

        System.out.println();

        buku.hapusKontak("Andi");

        System.out.println();

        buku.tampilkanSemua();

        System.out.println();

        BukuKontak bukuBaru = new BukuKontak("kontak.txt");

        bukuBaru.muatDariBerkas();

        bukuBaru.tampilkanSemua();

        System.out.println("Jumlah kontak: " + bukuBaru.jumlahKontak());

    }
}
    

