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
public class Balok {
    private double p; 
    private double l;
    private double t;
    
    public Balok(){ ///ini harus ditambahkan karena 
        
    }
    
    public Balok(double p, double l, double t){ 
        this.p = p; 
        this.l = l;
        this.t = t;
    }
    
    public double getVolume(){  ///fungsi utk mendptkn garis
        double volume = Math.sqrt(p*l*t); 
        return volume; 
    }
    
    public boolean isGreater(Object a, Object b){
        double aVolume = ((Balok)a).getVolume(); 
        double bVolume = ((Balok)b).getVolume(); 
        return (aVolume > bVolume); 
    } 
    
    public boolean isLess(Object a, Object b){
        double aVolume = ((Balok)a).getVolume(); 
        double bVolume = ((Balok)b).getVolume(); 
        return (aVolume < bVolume); 
    } 
    
    public boolean isEqual(Object a, Object b){
        double aVolume = ((Balok)a).getVolume(); 
        double bVolume = ((Balok)b).getVolume(); 
        return (aVolume == bVolume);
    }
}
