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

import java.util.ArrayList;
import java.io.*;


public class Gudang {

    private ArrayList<Barang> daftar = new ArrayList<>();
    private String namaBerkas;

    public Gudang(String namaBerkas) {
        this.namaBerkas = namaBerkas;
    }

    public void tambahBarang(Barang barang) {
        daftar.add(barang);
    }

    public void tampilkanSemua() {
        System.out.println("=== Daftar Barang ===");
        for (int i = 0; i < daftar.size(); i++) {
            System.out.println((i + 1) + ". " + daftar.get(i).info());
        }
    }

    public void simpanKeBerkas() {
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas))) {

            for (Barang b : daftar) {
                penulis.println(b.keBaris());
            }

            System.out.println("Data berhasil disimpan ke " + namaBerkas);

        } catch (IOException e) {
            System.out.println("Gagal menyimpan: " + e.getMessage());
        }
    }

    public void muatDariBerkas() {

        daftar.clear();

        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))) {

            String baris;

            while ((baris = pembaca.readLine()) != null) {

                String[] data = baris.split(";");

                if (data.length == 3) {
                    daftar.add(new Barang(
                            data[0],
                            Double.parseDouble(data[1]),
                            Integer.parseInt(data[2])
                    ));
                }
            }

            System.out.println("Data berhasil dimuat dari " + namaBerkas);

        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }

    public double totalNilai() {

        double total = 0;

        total = daftar.stream().map((b) -> b.getStok() * b.getHarga()).reduce(total, (accumulator, _item) -> accumulator + _item);

        return total;
    }
}

    
