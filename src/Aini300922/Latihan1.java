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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
///jika ingin 3 buah diatas ganti aja dengan import java.io.*;

public class Latihan1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(
                new InputStreamReader(System.in));
        
        String name = "";
        String address = "";
        String jurusan = "";
        
        
        try{
            System.out.print("Please Enter Your Name: ");
            name = dataIn.readLine();
  
            System.out.print("Please Enter Your Address: ");
            address = dataIn.readLine();
         
            System.out.print("Please Enter Your Major: ");
            jurusan = dataIn.readLine();
            }catch (IOException e){
            System.out.print("Error!");
        }
        System.out.println("Hello " + name +"!" +
                           "\nAlamat saya  " + address +
                           "\nJurusan saya " + jurusan);
    }
}
