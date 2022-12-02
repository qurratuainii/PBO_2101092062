/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aini021222;

/**
 *
 * @author HP Folio 1040
 */
public class StudentRecord1 {
    public static void main(String[] args) {
        StudentRecord student[] = new StudentRecord[100];
        StudentRecord s = new StudentRecord();
        s.setName("Ali");
        s.setAddress("Padang");
        
        student[0]=s;
        
        System.out.println("Nama       : "+student[0].getName());
        System.out.println("Address    : "+student[0].getAddress());
        
    }
}
