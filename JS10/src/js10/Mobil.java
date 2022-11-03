/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js10;

/**
 * created by AbelLevran 21343038
 * @author Bellevran
 */
public class Mobil {
    String merk, warna;
    int tahunProduksi;
   
    public void Maju(){
        int kec = 10;
        System.out.println("Mobil maju sejauh " + kec + "meter");
    }
    public void Mundur(){
        int kec = 5;
        System.out.println("Mobil mundur sejauh "+kec+"meter");
    }
}
