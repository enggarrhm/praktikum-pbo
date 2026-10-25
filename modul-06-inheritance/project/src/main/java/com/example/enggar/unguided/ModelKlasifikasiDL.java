package com.example.enggar.unguided;

public class ModelKlasifikasiDL extends ModelKlasifikasi{
     private int jumlahLayer;

    public ModelKlasifikasiDL(String namaModel, int jumlahDataLatih, int jumlahKelas, int jumlahLayer) {
        super(namaModel, jumlahDataLatih, jumlahKelas);
        this.jumlahLayer = jumlahLayer;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah layer: " + jumlahLayer);
    }

    @Override
    public int hitungBiaya() {
        return super.hitungBiaya() + (jumlahLayer * 200);
    }
}
