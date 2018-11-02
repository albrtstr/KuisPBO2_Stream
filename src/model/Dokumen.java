/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jarkom
 */
public class Dokumen {

    private String isi;

    public Dokumen() {
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public void simpanKeFile(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(isi.getBytes());
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dokumen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dokumen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//    public void bacaDariFile(File file){
//        try {
//            FileInputStream fis = new FileInputStream(file);
//            ObjectInputStream obj = new ObjectInputStream(fis);
//            Dokumen dok = (Dokumen) obj.readObject();
//            this.isi = dok.isi;
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Dokumen.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException | IOException ex) {
//            Logger.getLogger(Dokumen.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    public void bacaDariFile(File file) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            String hasilBaca = "";
            int dataInt;
            boolean isIsi = false;
            while ((dataInt = fis.read()) != -1) {
                hasilBaca += (char) dataInt;
                
            }
            this.setIsi(hasilBaca);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dokumen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dokumen.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Dokumen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public int hitungJumlahKata() {
        return this.getIsi().split(" ").length;
    }
}
