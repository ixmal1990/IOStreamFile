/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author ASUS
 */
public class Barang {
private final String nama;
    private final double harga;
    private final int stok;

    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public String keBaris() {
        return nama + "," + harga + "," + stok;
    }

    public String info() {
        return "Nama: " + nama +
               " | Harga: " + harga +
               " | Stok: " + stok;
    }
}
