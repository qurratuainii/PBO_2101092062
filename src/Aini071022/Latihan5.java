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

public class Latihan5 {
    public static void main(String[] args){
        
        int nilai;
        String huruf = "";
        
        huruf = JOptionPane.showInputDialog("Masukkan nilai 1-10: ");
        
        nilai = Integer.parseInt(huruf);
        
        if(nilai == 1){
            huruf="Satu";
        }else if(nilai == 2){
            huruf="Dua";
        }else if(nilai == 3){
            huruf="Tiga";
        }else if(nilai == 4){
            huruf="Empat";
        }else if(nilai == 5){
            huruf="Lima";
        }else if(nilai == 6){
            huruf="Enam";
        }else if(nilai == 7){
            huruf="Tujuh";;
        }else if(nilai == 8){
            huruf="Delapan";;
        }else if(nilai == 9){
            huruf="Sembilan";
        }else if(nilai == 10){
            huruf="Sepuluh";
        }else{
            System.out.println("Invalid Number!");
        }
        
        JOptionPane.showMessageDialog(null, huruf);
    }
}
