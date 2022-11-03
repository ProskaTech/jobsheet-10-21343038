/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js10;

/**
 * created by AbelLevran 21343038
 * @author Bellevran
 */
public class Aktor {
    String nama;
    int umur;
    
    Aktor(String n ,int u){ //aktor adalah constructor
        nama = n;
        umur = u;
    }
    
    void tampilAktor(){
        System.out.println("Namaku: "+nama);
        System.out.println("Umurku: "+umur+"tahun");
    }
    
    public static void main(String[] args) {
        Aktor a;
        
        a = new Aktor("Ronaldo",37);
        a.tampilAktor();
        System.out.println("===============");
        
        a = new Aktor("Messi",38);
        a.tampilAktor();
        System.out.println("===============");
    }
}
