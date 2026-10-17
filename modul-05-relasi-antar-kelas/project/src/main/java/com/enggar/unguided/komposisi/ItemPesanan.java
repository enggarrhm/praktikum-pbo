package com.enggar.unguided.komposisi;

public class ItemPesanan {
     private String namaItem;
    private RincianHarga rincian; // Komposisi: objek internal

    public ItemPesanan(String namaItem, double hargaDasar) {
        this.namaItem = namaItem;
        // Komposisi: RincianHarga di-instansiasi di dalam constructor
        this.rincian = new RincianHarga(hargaDasar);
    }

    public String getNamaItem() {
        return this.namaItem;
    }

    public RincianHarga getRincian() {
        return this.rincian;
    }
}
