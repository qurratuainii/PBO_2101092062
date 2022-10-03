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

public class Latihan5 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (
                new InputStreamReader(System.in));
        
        String word1 = "";
        String word2 = "";
        String word3 = "";
        
        try{
            System.out.print("Enter word1 : ");
            word1 = dataIn.readLine();
            
            System.out.print("Ënter word2 : ");
            word2 = dataIn.readLine();
            
            System.out.print("Enter word3 : ");
            word3 = dataIn.readLine();
        }catch (IOException e){
            System.out.print("Error!");
        }
        
        System.out.println("\n "+word1+" "+word2+" "+word3);
    }
    
}
