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

import javax.swing.JOptionPane;

public class Latihan5_2 {
    public static void main(String[] args) {
        int nilai;
        String huruf="";
     
        huruf = JOptionPane.showInputDialog("Masukkan nilai 1-10");
        
        nilai = Integer.parseInt(huruf);
        
        switch(nilai){
            case 1 : 
                huruf = "Satu";
                break;
            case 2 :
                huruf = "Dua";
                break;
            case 3 :
                huruf = "Tiga";
                break;
            case 4 :
                huruf = "Ëmpat";
                break;
            case 5 :
                huruf = "Lima";
                break;
            case 6 :
                huruf = "Enam";
                break;
            case 7 : 
                huruf = "Tujuh";;
                break;
            case 8 :
                huruf = "Delapan";
                break;
            case 9 : 
                huruf = "Sembilan";
                break;
            case 10 :
                huruf = "Sepuluh";
                break;
            default:
                huruf = "Invalid number";
        }
        
        JOptionPane.showMessageDialog(null, huruf);
    }
}
