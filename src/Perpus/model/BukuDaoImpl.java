/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpus.model;

import Aini.model.Anggota;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP Folio 1040
 */
public class BukuDaoImpl implements BukuDao {
      private List<Buku> data = new ArrayList<>();
    
    public BukuDaoImpl(){
        data.add(new Buku("AB1", "ADM", "nanjan", "cebhcrhb"));
        //data.add(new Buku());
       //data.add(new Buku());
    }
    
    public Buku save(Buku buku) {
        data.add(buku);
        return buku;
    }

    public Buku update(int index, Buku buku) {
        data.set(index, buku);
        return buku;
    }

    public void delete(int index) {
        data.remove(index);
    }

    public Buku getBuku(int index) {  
        return data.get(index);
    }
    
    public List<Buku> getAllBuku() {
        return data;
    }
}
