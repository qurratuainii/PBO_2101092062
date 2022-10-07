/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aini071022;

/**
 *
 * @author HP Folio 1040
 */

import java.io.*;
public class Latihan3 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(
                new InputStreamReader(System.in));
    
        String gol = " ";
        int gpokok = 0;
        int gjam = 0;
        int jam = 0;
        
        try{
            System.out.print("Golongan : ");
            gol = dataIn.readLine();
            
            System.out.print("Gaji Pokok : ");
            gpokok = Int1eger.parseInt(dataIn.readLine());
            
            System.out.print("Gaji Perjam : ");
            gjam = Integer.parseInt(dataIn.readLine());
        }catch (IOException e){
            System.out.println("Error!");
        }
        
        switch(gol){{}
  
}
    

