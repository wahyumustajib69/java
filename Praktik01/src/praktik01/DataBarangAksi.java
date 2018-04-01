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
public class DataBarangAksi {
    public static void main(String[]args){
        DataBarang Tabel = new DataBarang();
        
        Tabel.kode ="B0001";
        Tabel.nama ="Beras";
        Tabel.kategori="Dry Goods";
        Tabel.jumlah=12;
        Tabel.harga_beli=12000;
        Tabel.harga_jual=15000;
        Tabel.total=Tabel.jumlah*Tabel.harga_jual;
        Tabel.diskon=0.2;
        Tabel.bayar=(Tabel.total*Tabel.diskon)+Tabel.total;
        
        Tabel.cetakhasil();
    }
}
