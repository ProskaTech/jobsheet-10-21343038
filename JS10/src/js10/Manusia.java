/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js10;

/**
 * created by AbelLevran 21343038
 * @author Bellevran
 */
import java.util.Scanner;
public class Manusia {
    String nama, tempat_lahir, tgl_lahir;
    int berat_badan, tinggi_badan;
    
    public void inputdata(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap\t: ");
        nama = input.nextLine();
        
        System.out.print("Masukkan tempat lahir\t: ");
        tempat_lahir = input.nextLine();
        
        System.out.print("Masukkan tanggal lahir\t: ");
        tgl_lahir = input.nextLine();
        
        System.out.print("Masukkan berat badan\t: ");
        berat_badan = input.nextInt();
        
        System.out.print("Masukkan tinggi badan\t: ");
        tinggi_badan = input.nextInt();
    }
    
    public void identitas(){
        System.out.println("Nama saya \t: "+nama);
        System.out.println("tempat lahir \t: "+tempat_lahir);
        System.out.println("tanggal lahir \t: "+tgl_lahir);
        System.out.println("berat badan \t: "+berat_badan);
        System.out.println("tinggi badan \t: "+tinggi_badan);
    }
    
    public static void main(String[] args) {
        Manusia A = new Manusia();
        A.inputdata();
        A.identitas();
    }
}