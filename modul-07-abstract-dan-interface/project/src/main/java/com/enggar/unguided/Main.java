package com.enggar.unguided;

public class Main {
     public static void main(String[] args) {

        ItemTransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan");

        ItemTransaksi tiketReguler = new TiketReguler("Interstellar", 40000, 2, 3);
        ItemTransaksi tiketVIP     = new TiketVIP("Dune: Part Two", 60000, 2, 25000);
        ItemTransaksi paketSnack   = new PaketSnack("Combo Popcorn Caramel + 2 Soda", 1, 55000);

        ItemTransaksi[] keranjang = new ItemTransaksi[3];
        keranjang[0] = tiketReguler;
        keranjang[1] = tiketVIP;
        keranjang[2] = paketSnack;

        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");
        double grandTotal = 0.0;
        for (ItemTransaksi item : keranjang) {
            item.cetakRincianItem();         
            grandTotal += item.getNominalBayar();
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("TOTAL TRANSAKSI : Rp" + grandTotal);
        System.out.println("=============================================================");

        ItemTransaksi.catatLogKasir("Transaksi selesai diproses.");
    }
}
