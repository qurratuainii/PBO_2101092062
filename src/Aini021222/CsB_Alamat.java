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
public class CsB_Alamat {
    public static void main(String[] args) {
        CsBukuAlamat bukualamat = new CsBukuAlamat("Habib Fakhri","Padang","+621345","habiab@gmail.com");
        
        System.out.println("Nama            : " + bukualamat.getNama());
        System.out.println("Alamat          : " + bukualamat.getAlamat());
        System.out.println("Nomor Telepon   : " + bukualamat.getTelepon());
        System.out.println("Alamat E-mail   : " + bukualamat.getEmail());
        
        
    }
}
