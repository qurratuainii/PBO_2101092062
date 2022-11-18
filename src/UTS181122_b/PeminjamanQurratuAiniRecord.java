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
public class PeminjamanQurratuAiniRecord {
    public static void main(String[] args) {
        PeminjamanQurratuAini pinjaman = new PeminjamanQurratuAini();
        
        pinjaman.setKodePeminjaman("AB21254");
        pinjaman.setTanggal("18 November 2022");
        pinjaman.setKodeNasabah("AB2");
        pinjaman.setNamaNasabah("Qurratu Aini");
        pinjaman.setJumlahPeminjaman(100000);
        pinjaman.setLamaPeminjaman(2);
        pinjaman.setBulan("12%");
       
         
        System.out.println("Kode Peminjaman     : "+pinjaman.getKodePeminjaman());
        System.out.println("Tanggal             : "+pinjaman.getTanggal());
        System.out.println("Kode Nasabah        : "+pinjaman.getKodeNasabah());
        System.out.println("Nama Nasabah        : "+pinjaman.getNamaNasabah());
        System.out.println("Jumlah Peminjaman   : "+pinjaman.getJumlahPeminjaman());
        System.out.println("LamaPeminjaman      : "+pinjaman.getLamaPeminjaman());
        System.out.println("Bunga               : "+pinjaman.getBulan());
        System.out.println("");
        System.out.println("Angsuran Pokok       : "+pinjaman.getAngsuranPokok());
        System.out.println("Bunga                : "+pinjaman.getBunga());
        System.out.println("Angsuran Per Bulan   : "+pinjaman.getAngsuranPerBulan());
        System.out.println("Total Hutang         : "+pinjaman.getTotalHutang());
  
    }
}
