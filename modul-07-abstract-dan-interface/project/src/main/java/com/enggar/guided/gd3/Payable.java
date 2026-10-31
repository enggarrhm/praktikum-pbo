package com.enggar.guided.gd3;

public interface Payable {
    double getPaymentAcount();

    default void printReceipt(){
        System.out.println("Struk Resmi - Total: Rp " + getPaymentAcount());
    }

    // fungsi utilitas
    static void logTransaction(String message){
        System.out.println("[AUDIT LOG]" + message);
    }
}
