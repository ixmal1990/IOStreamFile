/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Nama : Muhammad Ixmal Alimudin 
// NPM  : 2410010280
package tugas;

/**
 *
 * @author ASUS
 */
public class MainTugas {

    public static void main(String[] args) {

        // Array kategori
        String[] kategori = {
            "Makanan",
            "Minuman",
            "Alat Tulis"
        };

        System.out.println("=== Daftar Kategori ===");

        for (String k : kategori) {
            System.out.println("- " + k);
        }

        System.out.println();

        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(new Barang("Buku", 5000, 20));
        gudang.tambahBarang(new Barang("Pensil", 3000, 30));
        gudang.tambahBarang(new Barang("Penghapus", 2000, 15));
        gudang.tambahBarang(new Barang("Air Mineral", 4000, 40));
        gudang.tambahBarang(new Barang("Roti", 7000, 25));

        gudang.tampilkanSemua();

        System.out.println();

        gudang.simpanKeBerkas();

        System.out.println();

        Gudang gudangBaru = new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        gudangBaru.tampilkanSemua();

        System.out.println();

        System.out.println("Total Nilai Persediaan = Rp" + gudangBaru.totalNilai());

    }
}
    

