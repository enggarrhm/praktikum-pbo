package com.enggar.guided.gd1;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salaried = new SalariedEmployee("budi", 5000000);
        System.out.println("Nama : "+ salaried.getName());
        System.out.println("gaji : Rp" + salaried.earnings());
    }
}
