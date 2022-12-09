/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aini091222;

/**
 *
 * @author HP Folio 1040
 */
public class Employee extends Person{
     //@ovveride
    public String getName(){
        System.out.println("Employee: getName");
        return name;
    }
}
