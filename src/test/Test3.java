/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.File;
import model.Dokumen;

/**
 *
 * @author user only
 */
public class Test3 {
    public static void main(String[] args) {
        Dokumen test = new Dokumen();
        test.bacaDariFile(new File("dok.dat"));
        System.out.println("Isi Dokumen = ");
        System.out.println(test.getIsi());
    }
}
