/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fauzan
 * NIM      : 10119077
 * Kelas    : IF-2
 * Deskripsi: Mengganti Kata
 */
public class PBOIF210119077Latihan28GantiKata {

    
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String kalimat,kata1,kata2,kata3;
        
        System.out.print("Masukkan Kalimat  : ");
        kalimat = masukan.nextLine();
        
        System.out.print("Ganti Kata    : ");
        kata1 = masukan.nextLine();
        System.out.print("Menjadi Kata  : ");
        kata2 = masukan.nextLine();
        
        kata3 = kalimat.replace(kata1, kata2);
        System.out.println("=====Hasil=====");
        System.out.println("Kalimat awal : "+kalimat);
        System.out.println("Kalimat baru : "+kata3);
    }
    
}
