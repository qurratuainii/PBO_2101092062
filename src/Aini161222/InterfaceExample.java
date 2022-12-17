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
public class InterfaceExample {
    public static void main(String[] args) {
        Relation myInteger = new MyInteger();
        Relation myDouble =  new MyDouble();
        
        boolean hasilInt = myInteger.isGreater(5,6);
        System.out.println("Hasil MyInteger : "+hasilInt);
        
        boolean hasilDbl = myDouble.isGreater(6.4, 2.2);
        System.out.println("Hasil MyDouble : "+hasilDbl);
        
        Relation myline = new Line();
        Line line1 = new Line(2,5,2,7);
        Line line2 = new Line(2, 5, 2, 2);
        
        boolean lineA_lineB = myline.isGreater(line1,line2);
        System.out.println("Line A > Line B :"+lineA_lineB);
        
        
        
        
    }
}
