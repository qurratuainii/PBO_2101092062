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

public class Latihan4_2 {
   public static void main(String[] args) {
        int nilai1 = 0;
        int nilai2 = 0;
        int nilai3 = 0;
        double rata;
        
        nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 1"));
        nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 2"));
        nilai3 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 3"));
        
        rata = (nilai1 + nilai2 + nilai3)/3;
        
        String hasil="";
        
        hasil += "Nilai 1 : "+nilai1+"\n";
        hasil += "Nilai 2 : "+nilai2+"\n";
        hasil += "Nilai 3 : "+nilai3+"\n";
        hasil += "Rata-rata dari nilai tersebut "+rata+"\n";
        
        if(rata >= 60){
            hasil += ":-)";
        }else{
            hasil += ":-(";
        }
        
        JOptionPane.showMessageDialog(null, hasil);
    }
}
