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
public class Pembeli {
private String username;
private Alamat alamat;


void setUsername(String a)throws Exception {
       for (char i : a.toCharArray()){
                if (!Character.isLetter(i)){
                    throw new Exception("Harus Huruf!");
                }
        }
 this.username = a;
}

void setAlamat(Alamat a){
    this.alamat = a;
}

String getUsername(){
    return this.username;
}

Alamat getAlamat(){
    return this.alamat;
}
}
