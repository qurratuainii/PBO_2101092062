/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aini281022;

/**
 *
 * @author HP Folio 1040
 */
public class Latihan7 {
    public static void main(String[] args) {
        
        int a = Integer.parseInt (args[2]);
        int b = Integer.parseInt (args[3]);
        
        int sum, difference, product, quotient;
        
        sum = a+b;
        difference = a-b;
        product = a*b;
        quotient = a/b;
        
        System.out.println("Sum = "+sum);
        System.out.println("Difference = "+difference);
        System.out.println("Product = "+product);
        System.out.println("Quotient = "+quotient);
    }
}
