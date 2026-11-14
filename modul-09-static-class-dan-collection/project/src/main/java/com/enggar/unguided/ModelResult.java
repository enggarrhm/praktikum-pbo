package com.enggar.unguided;

public class ModelResult implements Comparable<ModelResult> {

    // Static variable: menghitung jumlah eksperimen yang dibuat
    private static int jumlahEksperimen = 0;

    private String namaModel;
    private double akurasi;
    private int waktuTraining;

    public ModelResult(String namaModel, double akurasi, int waktuTraining) {
        this.namaModel = namaModel;
        this.akurasi = akurasi;
        this.waktuTraining = waktuTraining;
        jumlahEksperimen++; // bertambah setiap objek baru dibuat
    }

    // Static method untuk mengambil jumlah eksperimen
    public static int getJumlahEksperimen() {
        return jumlahEksperimen;
    }

    // Getter
    public String getNamaModel() {
        return namaModel;
    }

    public double getAkurasi() {
        return akurasi;
    }

    public int getWaktuTraining() {
        return waktuTraining;
    }

    // Default sorting: akurasi tertinggi ke terendah
    @Override
    public int compareTo(ModelResult other) {
        // descending: jika this lebih besar, return -1
        return Double.compare(other.akurasi, this.akurasi);
    }

    @Override
    public String toString() {
        return "Model=" + namaModel + ", akurasi=" + akurasi + ", waktu=" + waktuTraining + " detik";
    }
}