/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik01;

/**
 *
 * @author WAHYU'S PC
 */
public class DataBarang {
   String kode,nama,kategori;
   int jumlah;
   double harga_jual,harga_beli,diskon,total,bayar;
   
   void cetakhasil(){
       System.out.println("Data Barang");
       System.out.println("Kode Barang  : "+kode);
       System.out.println("Nama Barang  : "+nama);
       System.out.println("Kategori     : "+kategori);
       System.out.println("Jumlah       : "+jumlah);
       System.out.println("Harga Beli   : "+harga_jual);
       System.out.println("Harga Jual   : "+harga_beli);
       System.out.println("Diskon       : "+diskon);
       System.out.println("Total Harga  : "+total);
       System.out.println("Total Bayar  : "+bayar);
   }
    
}
