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
public class Aqua {
    private int stock;
    private int price;
   
    
    
    void setPrice(int b){
        this.price = b;
    }
    void setStock(int c){
        this.stock = c;
    }
    public int getStock(){
        return this.stock;
    }
    public int getPrice(){
        return this.price;
    }
    
}

