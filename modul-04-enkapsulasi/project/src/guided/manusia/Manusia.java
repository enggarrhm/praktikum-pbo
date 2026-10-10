package guided.manusia;

public class Manusia {
    // deklarasi atribut
    private String nama;
    private int umur;

    // sebuah konstraktor
    public Manusia(){};
    public Manusia(String nama){
        this.nama = nama;
    }
    public Manusia(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    // method setter
    // definisi method
    public void setNama (String a){
        nama = a;
    }
    public String getNama() {
        return nama;
    }
    public void setUmur (int a) {
        umur = a;
    }
    public int getUmur () {
        return umur;
    }

}
