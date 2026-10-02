/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided.enkapsulasi;

/**
 *
 * @author ADVAN WORKPLUS
 */
public class rekening {

    private int saldo = 0;

    public void tambahSaldo(int jumlah) {
        saldo = saldo + jumlah;
        System.out.println("saldo berhasil ditambahkan");
    }
    public void tampilkanSaldo() {
        System.out.println("saldo anda : " + saldo);
    }

}
