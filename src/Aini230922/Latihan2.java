/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aini230922;

import java.text.DecimalFormat;

/**
 *
 * @author HP Folio 1040
 */
public class Latihan2 {
    
    public static void main(String[] args){
        DecimalFormat formatdata = new DecimalFormat("#.##");
        int i = 37;
        int j = 42;
        double x = 27.475;
        double y = 7.22;
        
        System.out.println("variable values...");
        System.out.println("    i = " + i);
        System.out.println("    j = " + j);
        System.out.println("    x = " + x);
        System.out.println("    y = " + y);
        
        System.out.println("Adding...");
        System.out.println("    i + j = " + (i + j));
        System.out.println("    x + y = " + (x + y));
            
        System.out.println("Subtracting...");
        System.out.println("    i - j = " + (i - j));
        System.out.println("    x - y = " + formatdata.format(x - y));
            
        System.out.println("Multiplying...");
        System.out.println("    i * j = " + (i * j));
        System.out.println("    x * y = " + formatdata.format(x * y));
        
        System.out.println("Dividing...");
        System.out.println("    i / j - "  + (i / j));
        System.out.println("    x / y = " + formatdata.format(x / y));
        
        System.out.println("Computing the reminder...");
        System.out.println("    i % j = " + (i % j));
        System.out.println("    x % y = " + formatdata.format(x % y));
        
        System.out.println("Mixing tipes...");
        System.out.println("    j + y = " + (j + y));
        System.out.println("    i * x = " + (i * x));    
    }
}
