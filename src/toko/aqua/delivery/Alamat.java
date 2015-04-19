/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko.aqua.delivery;

/**
 *
 * @author anandanarta
 */
    public class Alamat {
    private String jalan;
    private String nomorRumah;
    private String kelurahan;
    private String kecamatan;
    private String kabupatenkota;
 
   

   
    public String getJalan() {
        return jalan;
    }

   
    public void setJalan(String jalan) throws Exception {
        for (char i : jalan.toCharArray()){
             if (!Character.isDigit(i)&&!Character.isLetter(i)){
                 throw new Exception("Hanya boleh Angka dan Huruf!");
                 }
        
        }
        this.jalan = jalan;
    }

   
    public String getNomorRumah() {
        return nomorRumah;
    }

   
    public void setNomorRumah(String nomorRumah) throws Exception {
                for (char i : nomorRumah.toCharArray()){
             if (!Character.isDigit(i)&&!Character.isLetter(i)){
                 throw new Exception("Hanya boleh Angka dan Huruf!");
                 
                 }
        }
        this.nomorRumah = nomorRumah;
    }

   
    public String getKelurahan() {
       return kelurahan;
    }


    public void setKelurahan(String kelurahan) throws Exception {
               
        for (char i : kelurahan.toCharArray()){
             if (!Character.isLetter(i)){
                 throw new Exception("Harus Huruf!");
                 }
        }
             this.kelurahan = kelurahan;
    }

   
    public String getKecamatan() {
        return kecamatan;
    }

   
    public void setKecamatan(String kecamatan) throws Exception {
        for (char i : kecamatan.toCharArray()){
                if (!Character.isLetter(i)){
                    throw new Exception("Harus Huruf!");
        }
        }
        this.kecamatan = kecamatan;
           
    }

    public String getKabupatenkota() {
        return kabupatenkota;
    }

 
    public void setKabupatenkota(String kabupatenkota) throws Exception {
        for (char i : kabupatenkota.toCharArray()){
             if (!Character.isLetter(i)){
                 throw new Exception("Harus Huruf!");
                 }
        }
        this.kabupatenkota = kabupatenkota;
    }

   
   

  
   
    
}

