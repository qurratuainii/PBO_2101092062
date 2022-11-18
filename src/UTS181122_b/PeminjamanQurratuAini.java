/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS181122_b;

/**
 *
 * @author HP Folio 1040
 */
public class PeminjamanQurratuAini {
    private String KodePeminjaman;
    private String Tanggal;
    private String KodeNasabah;
    private String NamaNasabah;
    private int JumlahPeminjaman;
    private int LamaPeminjaman;
    private String Bulan;
    
    private double Bunga; 
    private int AngsuranPokok;
    private int AngsuranPerBulan;
    private int TotalHutang;
    
    private static int peminjamanCount;
    
    public String getKodePeminjaman(){
        return KodePeminjaman;
    }
    
    public void setKodePeminjaman(String KodePeminjaman){
        this.KodePeminjaman = KodePeminjaman;
    }
    
    public String getTanggal(){
        return Tanggal;
    }
    
    public void setTanggal(String Tanggal){
        this.Tanggal = Tanggal;
    }
    
    public String getKodeNasabah(){
        return KodeNasabah;
    }
    
    public void setKodeNasabah(String KodeNasabah){
        this.KodeNasabah = KodeNasabah;
    }
    
    public String getNamaNasabah(){
        return NamaNasabah;
    }
    
    public void setNamaNasabah(String NamaNasabah){
        this.NamaNasabah = NamaNasabah;
    }
    
    public int getJumlahPeminjaman(){
        return JumlahPeminjaman;
    }
    
    public void setJumlahPeminjaman(int JumlahPeminjaman){
        this.JumlahPeminjaman = JumlahPeminjaman;
    }
    
    public int getLamaPeminjaman(){
        return LamaPeminjaman;
    }
    
    public void setLamaPeminjaman(int LamaPeminjaman){
        this.LamaPeminjaman = LamaPeminjaman;
    }
    
     public String getBulan(){
        return Bulan;
    }
    
    public void setBulan(String Bulan){
        this.Bulan = Bulan;
    }
    
 
    public int getAngsuranPokok(){
        AngsuranPokok = JumlahPeminjaman / LamaPeminjaman;
        return AngsuranPokok;
    }
    
    public double getBunga(){
        Bunga = 0.12 * JumlahPeminjaman;
        return Bunga;
    }
    
    
    public int getAngsuranPerBulan(){
        AngsuranPerBulan = (int) (Bunga + AngsuranPokok);
        return (int) AngsuranPerBulan;
    }
    
    public int getTotalHutang(){
        TotalHutang = (int) (JumlahPeminjaman + Bunga);
        return TotalHutang;
    }
    
    
    public static int getPeminjamanCount(){
        return peminjamanCount;
    }

  

   
}
