/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aini300922;

/**
 *
 * @author HP Folio 1040
 */

import java.io.*;

public class Latihan2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(
                new InputStreamReader(System.in));
        
        int angka1 = 0;
        int angka2 = 0;
        int jumlah = 0;
        
        try{
            System.out.print("Masukkan angak 1 : ");
            angka1 = Integer.parseInt(dataIn.readLine());
            
            System.out.print("Masukkan angka 2 : ");
            angka2 = Integer.parseInt(dataIn.readLine());
            
            jumlah = angka1 + angka2;
        } catch (IOException e){
            System.out.println("Error!");
        }
        
            System.out.println("hasil Penjumlahan " + angka1 + 
                    " + " + angka2 + " = " + jumlah);
            
        System.out.println("Hasil = " + jumlah);
        
        
        
    }
}
