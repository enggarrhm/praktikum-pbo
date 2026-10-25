package com.example.enggar.unguided;

public class ModelRegresi extends Model {
        private int jumlahFitur;

    public ModelRegresi(String namaModel, int jumlahDataLatih, int jumlahFitur) {
        super(namaModel, jumlahDataLatih);
        this.jumlahFitur = jumlahFitur;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah fitur: " + jumlahFitur);
    }

    @Override
    public int hitungBiaya() {
        return super.hitungBiaya() + (jumlahFitur * 10);
    }

    // Method baru: dua parameter (epoch dan batch)
    public int hitungBiaya(int epoch, int batch) {
        return (getJumlahDataLatih() * epoch) / batch;
    }
}
