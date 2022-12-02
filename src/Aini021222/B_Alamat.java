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
public class B_Alamat {
    public static void main(String[] args) {
        BukuAlamat buku = new BukuAlamat();
        
        buku.setNama( "qurratu aini");
        buku.setAlamat("Bukittinggi");
        buku.setTelepon(62812345);
        buku.setEmail("qurratuaini@gmail.com");
        
        System.out.println("Nama            : " + buku.getNama());
        System.out.println("Alamat          : " + buku.getAlamat());
        System.out.println("Nomor Telepon   : " + buku.getTelepon());
        System.out.println("Alamat E-mail   : " + buku.getEmail());
        
    }
}
