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

public class Latihan4 {
    public static void main(String[] args) throws IOException{
        BufferedReader In = new BufferedReader(
                      new InputStreamReader(System.in));
    
        int nilai1 = 0;
        int nilai2 = 0;
        int nilai3 = 0;
        double rata = 0;

            System.out.print("Nilai 1 : ");
            nilai1 = (Integer.parseInt(In.readLine()));
            
            System.out.print("Nilai 2 : ");
            nilai2 = Integer.parseInt(In.readLine());
            
            System.out.print("Nilai 3 : ");
            nilai3 = Integer.parseInt(In.readLine());
            
            rata = (nilai1 + nilai2 + nilai3)/3;
        
            System.out.println("Rata-rata = "+rata);
        if(rata >= 60){
               System.out.println(":-)"); 
        }else{
            System.out.println(":-(");
        }
    }
}
