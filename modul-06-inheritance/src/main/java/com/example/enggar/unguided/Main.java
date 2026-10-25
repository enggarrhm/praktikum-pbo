package com.example.enggar.unguided;

public class Main {
     public static void main(String[] args) {
        Model[] daftarModel = new Model[3];

        daftarModel[0] = new ModelRegresi("Regresi Linier", 500, 4);
        daftarModel[1] = new ModelKlasifikasi("Decision Tree", 800, 3);
        daftarModel[2] = new ModelKlasifikasiDL("Neural Network", 1000, 5, 3);

        int totalBiaya = 0;

        for (Model m : daftarModel) {
            m.tampilkanInfo();
            int biaya = m.hitungBiaya();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println("---");
            totalBiaya += biaya;
        }

        System.out.println("Total biaya: " + totalBiaya);

        ModelKlasifikasiDL nn = (ModelKlasifikasiDL) daftarModel[2];
        ModelRegresi regresi = (ModelRegresi) daftarModel[0];

        System.out.println("Biaya 10 epoch (Neural Network): " + nn.hitungBiaya(10));
        System.out.println("Biaya 10 epoch (Regresi Linier): " + regresi.hitungBiaya(10));
        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): " + regresi.hitungBiaya(10, 50));
    }
}
