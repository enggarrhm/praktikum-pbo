package unguided.laporan;
import unguided.model.Dataset;
public class LaporanDataset {
    
    public void cetak(Dataset dataset) {

        System.out.println("=== Laporan Dataset ===");
        System.out.println("Nama         : " + dataset.getNama());
        System.out.println("Jumlah Baris : " + dataset.getJumlahBaris());
        System.out.println("Jumlah Kolom : " + dataset.getJumlahKolom());

        System.out.printf(
            "Missing      : %d sel (%.2f%%)%n",
            dataset.getJumlahMissing(),
            dataset.getPersentaseMissing()
        );

        String status;

        if (dataset.perluDibersihkan()) {
            status = "Perlu dibersihkan";
        } else {
            status = "Bersih";
        }

        System.out.println("Status       : " + status);
        System.out.println();
    }
}