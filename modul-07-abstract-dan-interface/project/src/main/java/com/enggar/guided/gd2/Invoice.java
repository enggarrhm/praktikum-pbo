package com.enggar.guided.gd2;

public class Invoice implements Payable {
    private String partName;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partName, int quantity, double pricePerItem){
        this.partName = partName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getpartName(){
        return partName;
    }

    @Override 
    public double getPaymentAcount(){
        return quantity * pricePerItem;
    }

}
