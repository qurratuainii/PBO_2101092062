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
public class CsBukuAlamat {
    private String nama;
    private String alamat;
    private String email;
    private String telepon;
    
    public CsBukuAlamat(){
        
    }
    
    public CsBukuAlamat(String nama, String alamat, String telepon, String email){
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
    }

    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getTelepon(){
        return telepon;
    }
    
    public String getEmail(){
        return email;
    }
}
