package com.example.enggar.guided.gd2;

public class Manager extends Employed {
    private String alamat;

    public Manager(String nama, String alamat){
        super(nama);
        this.alamat = alamat;
    }
    public void tampilinformasi(){
        super.tampilnama();
        System.out.println("alamat: " + alamat);
        System.out.println("departemen : " + super.departeman);
    }
}
