/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aini211022;

/**
 *
 * @author HP Folio 1040
 */

import java.io.*;

public class Latihan6 {
    public static void main(String[] args) throws IOException {
        BufferedReader In = new BufferedReader (
                                new InputStreamReader(System.in));
        
        int hasil = 1;
        
        System.out.print("Angka : ");
        int angka = Integer.parseInt(In.readLine());
        
        System.out.print("Pangkat : ");
        int pangkat = Integer.parseInt(In.readLine());
        
        for(int i=1; i<pangkat ; i++){
            hasil = hasil * angka;
        }
        System.out.println(angka + " ^ "+ pangkat +" = "+hasil);
    }
}
