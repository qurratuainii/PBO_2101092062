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

public class Latihan4 {
    public static void main(String[] args) throws IOException {
        BufferedReader In = new BufferedReader (
                                new InputStreamReader(System.in));
        
        int h = 1;
        
        System.out.print("Nilai angka : ");
        int angka = Integer.parseInt(In.readLine());
        
        System.out.print("Nilai pangkat : ");
        int pangkat = Integer.parseInt(In.readLine());
        
        int i =0;
        
        while (i<pangkat){
            h = h * angka;
            i++;
        }
        
        System.out.println(angka + " ^ " + pangkat + " = "+h);
    }
}
