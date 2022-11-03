/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js10;

/**
 * created by AbelLevran 21343038
 * @author Bellevran
 */
public class MobilUtama {
    public static void main(String[] args) {
        Mobil Honda = new Mobil();
        Honda.merk = "Civic";
        Honda.warna = "Hitam";
        Honda.tahunProduksi = 2020;
        System.out.println("Merek\t: "+Honda.merk);
        System.out.println("Warna\t: "+Honda.warna);
        System.out.println("Tahun Produksi\t: "+Honda.tahunProduksi);
        Honda.Maju();
        Honda.Maju();
        Honda.Mundur();
        
    }
}
