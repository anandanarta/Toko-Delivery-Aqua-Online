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
public class Transaksi {
    private Pembeli pembeli;
    private String nominal;
    private Metode metode;
    
    Pembeli getPembeli(){
        return this.pembeli;
    }
    void setPembeli(Pembeli a){
        this.pembeli = a;
    }

    void setNominal (Aqua b, String a)
        throws Exception {
        for (char i : a.toCharArray()){
                if (!Character.isDigit(i)){
                    throw new Exception("Harus Angka!");
                }}
               int c=Integer.parseInt(a);
              if (c<=b.getStock()) this.nominal = a;
            
        
              
    }
    void setMetode(Metode a) {
       this.metode = a;}
    
    int getPrice  (Aqua b){
        int price = (this.metode).getprice();
        int a = Integer.parseInt(this.nominal);
        int c = b.getPrice();
        return (a*price)+(a*c);
    }
}

