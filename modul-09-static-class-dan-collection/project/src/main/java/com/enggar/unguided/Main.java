package com.enggar.unguided;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Simpan data ke dalam List menggunakan generics
        List<ModelResult> daftar = new ArrayList<>();
        daftar.add(new ModelResult("Logistic Regression", 0.82, 12));
        daftar.add(new ModelResult("Random Forest", 0.91, 45));
        daftar.add(new ModelResult("SVM", 0.87, 60));
        daftar.add(new ModelResult("KNN", 0.79, 5));
        daftar.add(new ModelResult("Decision Tree", 0.84, 8));

        // Jumlah eksperimen (static method)
        System.out.println("Jumlah eksperimen: " + ModelResult.getJumlahEksperimen());

        // Urut berdasarkan akurasi tertinggi (Comparable)
        System.out.println("\nSorted by akurasi");
        Collections.sort(daftar); 
        for (ModelResult m : daftar) {
            System.out.println(m);
        }

        // Urut berdasarkan waktu training tercepat (Comparator)
        System.out.println("\nSorted by waktu training");
        Collections.sort(daftar, new WaktuComparator());
        for (ModelResult m : daftar) {
            System.out.println(m);
        }

        // Filtering akurasi minimal 0.85 (lambda)
        System.out.println("\nModel dengan akurasi minimal 0.85");
        daftar.stream().filter(m -> m.getAkurasi() >= 0.85).forEach(System.out::println);

        // Pencarian model "KNN" (lambda), null jika tidak ditemukan
        System.out.println("\nPencarian model KNN");
        ModelResult knn = daftar.stream().filter(m -> m.getNamaModel().equals("KNN")).findFirst().orElse(null);
        System.out.println(knn); 
    }
}