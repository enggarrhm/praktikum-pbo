package unguided;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        double[] suhuHarian = { 30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9 };
        pengolahsuhu pengolah = new pengolahsuhu(suhuHarian);

        System.out.println("Data Suhu Awal");
        pengolah.tampilkanData();

        int indexkosong = pengolah.cariIndexKosong();
        System.out.println();
        System.out.println("index hari kosong: " + indexkosong);

        pengolah.isiDataKosong();

        System.out.println();

        System.out.println();
        System.out.println("data Suhu Setelah Pengisian");
        pengolah.tampilkanData();

        System.out.println();
        System.out.printf("rata-rata :  %.2f°C%n", pengolah.hitungRataRata());

        System.out.println();
        System.out.println("isi array suhuHarian di main setelah isidatakosong() dijalankan");

        System.out.println(Arrays.toString(suhuHarian));
        System.out.println("(ikut berubah : constructor menyimpan referensi array yang sama)");
    }
}
