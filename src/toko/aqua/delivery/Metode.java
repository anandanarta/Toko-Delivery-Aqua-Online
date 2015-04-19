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
public class Metode {
    String namaMetode;
    int price;
    
void setNamaMetode(String a){
    this.namaMetode = a;
}    

void setPrice(int a){
this.price = a;
}
int getprice(){
    return this.price;
}

String getMetode(){
    return this.namaMetode;
}

}
