package com.example.enggar.unguided;

public class Model {
    private String namaModel;
    private int jumlahDataLatih;

    public Model(String namaModel, int jumlahDataLatih) {
        this.namaModel = namaModel;
        this.jumlahDataLatih = jumlahDataLatih;
    }

    public int getJumlahDataLatih() {
        return jumlahDataLatih;
    }

    public String getNamaModel() {
        return namaModel;
    }

    public void tampilkanInfo() {
        System.out.println("Model: " + namaModel + " | Data latih: " + jumlahDataLatih);
    }

    // Overloading tanpa parameter
    public int hitungBiaya() {
        return jumlahDataLatih * 2;
    }

    // Overloading dengan satu parameter (epoch)
    public int hitungBiaya(int epoch) {
        return jumlahDataLatih * epoch;
    }
}
