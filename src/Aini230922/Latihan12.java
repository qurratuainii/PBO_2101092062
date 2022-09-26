/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aini230922;

/**
 *
 * @author HP Folio 1040
 */
public class Latihan12 {
    
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 23;
        int n3 = 5;
        int hasil;
        
        hasil = (n1 >= n2) ? n1 : n2;
        hasil = (n3 >= hasil)? n3 : hasil;
        System.out.println("number 1 = " + n1);
        System.out.println("number 2 = " + n2);
        System.out.println("number 3 = " + n3);
        System.out.println("Nilai tertingginya adalah angka = " + hasil);
    }
}
