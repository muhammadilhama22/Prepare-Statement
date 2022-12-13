/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atep;
public class program {
    
 public static void main(String[] args) {
 
     //INSERT
     //barang pensil = new barang();
     //pensil.insert("P001", "PENSIL 2B", 20, 2000);
     //pensil.insert("P002", "SPIDOL", 50, 1500);
     //barang buku = new barang();
     //buku.insert("B001", "BUKU TULIS", 30, 2500);
     //buku.insert("B002", "BUKU GAMBAR", 40, 3000);
     
     //UPDATE
     //barang pensil = new barang();
        //pensil.update("P001", "Pensil 2B", 20, 2000);
        //pensil.update("P002", "Spidol", 50, 1500);
        //barang buku = new barang();
        //buku.update("B001", "Buku Tulis", 30, 2500);
        //buku.update("B002", "Buku Gambar", 40, 3000);
        
       //DELETE
       barang pensil = new barang();
        pensil.delete("P001");
        barang buku = new barang();
        buku.delete("B002");
 }
}
