package com.enggar;
//guided
import com.enggar.guided.agregasi.*;
import com.enggar.guided.komposisi.*;
//unguided
import com.enggar.unguided.agregasi.Pesanan;
import com.enggar.unguided.asosiasi.*;
import com.enggar.unguided.komposisi.ItemPesanan;
;
public class Main {
      public static void main(String[] args) {
        // runGuided2();
        // runGuided3();
        runUnguidedCafe();
    }

    public static void runGuided2(){
        Mahasiswa m1 = new Mahasiswa("103112400148", "Rendhi");
        Mahasiswa m2 = new Mahasiswa("103112400149", "John");


        Jurusan prodi = new Jurusan("SD","Sains Data");

        prodi.addMahasiswa(m1);
        prodi.addMahasiswa(m2);

        prodi.displayMahasiswa();

    }
    
    public static void runGuided3(){
        Komputer pc = new Komputer("Intel Core i5",3200,"LG 24 Inch","Logitech","Wireless");
        pc.displaySpecKomputer();
    }

    public static void runUnguidedCafe() {
        Kasir kasir = new Kasir("Budi");

        ItemPesanan item1 = new ItemPesanan("Iced Americano", 18000);
        ItemPesanan item2 = new ItemPesanan("Beef Croissant", 25000);
        ItemPesanan item3 = new ItemPesanan("Matcha Latte", 22000);

        Pesanan pesanan = new Pesanan(4, 5);

        pesanan.tambahItem(item1);
        pesanan.tambahItem(item2);
        pesanan.tambahItem(item3);

        System.out.println("=== DAFTAR PESANAN CAFE ===");
        pesanan.tampilkanPesanan();
        System.out.println();

        kasir.prosesPembayaran(pesanan);
    }
}