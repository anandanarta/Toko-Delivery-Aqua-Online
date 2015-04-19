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
public class Information {
private Alamat alamat;
private int phonenumb;

void setAlamat(Alamat a){
    a=this.alamat;
}
void setPhone(int a){
    a=this.phonenumb;
}
public int getPhone (){
    return this.phonenumb;
}
public Alamat getAlamat(){
    return this.alamat;
}
}
