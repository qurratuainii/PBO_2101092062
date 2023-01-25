/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpus.model;

/**
 *
 * @author HP Folio 1040
 */
public class Buku {
    private String kodebuku;
    private String judul;
    private String pengarang;
    private String penerbit;
    private int lama;
    private int denda;
    private int lamapinjam;
    
    public Buku(){
        
    }

    public Buku(String kodebuku, String judul, String pengarang, String penerbit) {
        this.kodebuku = kodebuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }
    
    public int getLama() {
        return lama;
    }
    
    public int getDenda(){
        if(lama == 7){
            denda = 0;
        }else{
            lamapinjam = lama - 7;
            denda = 3000 * lamapinjam;
        }
        return denda;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    public void setLama(int lama) {
        this.lama = lama;
    }
    
    
    
}
