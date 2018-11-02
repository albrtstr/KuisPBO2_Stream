/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Dokumen;

/**
 *
 * @author user only
 */
public class Test4 {
    public static void main(String[] args) {
        Dokumen test = new Dokumen();
        test.setIsi("test fjh fj fhdf dujduej");
        System.out.println(test.getIsi());
        int jumlahKata = test.hitungJumlahKata();
        System.out.println("Jumlah kata = "+jumlahKata);
    }
}
