package unguided;

public class pengolahsuhu {
    private double[] suhuHarian;

    private static final double NILAI_KOSONG = -1.0;

    
    public pengolahsuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian;
    }

    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                System.out.println("Hari " + (i + 1) + " : (kosong)");
            } else {
                System.out.printf("Hari %d : %.1f°C%n", (i + 1), suhuHarian[i]);
            }
        }
    }

    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }
        return -1;
    }

    public void isiDataKosong() {
        int i = cariIndexKosong();
        if (i != -1) {
            suhuHarian[i] = (suhuHarian[i - 1] + suhuHarian[i + 1]) / 2;
        }
    }

    public double hitungRataRata() {
        double total = 0;
        for (int i = 0; i < suhuHarian.length; i++) {
            total += suhuHarian[i];
        }
        return total / suhuHarian.length;
    }
}

