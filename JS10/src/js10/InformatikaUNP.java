/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js10;

/**
 * created by AbelLevran 21343038
 * @author Bellevran
 */
public class InformatikaUNP {
    public static void main(String[] args) {
        Mahasiswa informatika = new Mahasiswa();
        Mahasiswa elektronika = new Mahasiswa();
        
        informatika.nama = "Happy Alicia";
        informatika.nim = 1;
        informatika.jur = "S1 Informatika";
        informatika.univ = "UNP";
        
        elektronika.nama = "Albert";
        elektronika.nim = 2;
        elektronika.jur = "S1 Elektronika";
        elektronika.univ = "UNP";
        
        System.out.println("| Data Mahasiswa INFORMATIKA |");
        System.out.println("| -------------------------- |");
        System.out.println(" Nama : "+informatika.nama);
        System.out.println(" NIM : "+informatika.nim);
        System.out.println(" Jurusan : "+informatika.jur);
        System.out.println(" Universitas : "+informatika.univ);
        
        System.out.println("--------------------------");
        
        System.out.println("| Data Mahasiswa ELEKTRONIKA |");
        System.out.println("| -------------------------- |");
        System.out.println(" Nama : "+elektronika.nama);
        System.out.println(" NIM : "+elektronika.nim);
        System.out.println(" Jurusan : "+elektronika.jur);
        System.out.println(" Universitas : "+elektronika.univ);
    }
}
