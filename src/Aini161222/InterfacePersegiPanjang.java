/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aini161222;

/**
 *
 * @author HP Folio 1040
 */
public class InterfacePersegiPanjang {
    public static void main(String[] args) {
        Relation pp = new PersegiPanjang();
        PersegiPanjang luas1 = new PersegiPanjang(5,5);
        PersegiPanjang luas2 = new PersegiPanjang(20,5);
        
        boolean persegipanjangA_persegipanjangB = pp.isGreater(luas1,luas2);
        System.out.println("Luas A > Luas B :"+persegipanjangA_persegipanjangB);
    }
}
