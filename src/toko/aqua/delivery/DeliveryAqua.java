/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko.aqua.delivery;
import java.util.*;
/**
 *
 * @author anandanarta
 */
public class DeliveryAqua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner scan = new Scanner(System.in);
        // TODO code application logic here
    Metode COD = new Metode();
    COD.setNamaMetode("Cash On Delivery");
    COD.setPrice(5000);
    Metode Kredit = new Metode();
    Kredit.setNamaMetode("Credit Card Payment");
    Kredit.setPrice(10000);
    Aqua aqua = new Aqua();
    aqua.setStock(50);
    aqua.setPrice(10000);
    /**Pre Deifined by User*/
    
    boolean All=true;
    while (All){
    Pembeli pembeli1 = new Pembeli();
        System.out.println("Masukkan nama pembeli :  ");
    
    {boolean Tes = true;
       
    while(Tes) {
        try {
         pembeli1.setUsername(scan.nextLine());
         Tes = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
       }
    Alamat alamatpembeli1 = new Alamat();
    tulisAlamat(alamatpembeli1);
    pembeli1.setAlamat(alamatpembeli1);
    
    Transaksi transaksipembeli1 = new Transaksi();
    transaksipembeli1.setPembeli(pembeli1);
        System.out.println("Masukkan banyak yang ingin dipesan : ");
        {boolean Tes=true;
        while(Tes){
        try{
            String b = scan.nextLine();
        
        transaksipembeli1.setNominal(aqua, b);
        Tes = false;} catch (Exception e){
            System.out.println("Terjadi error : "+e.getMessage() );
        }
        }
        }
        boolean all2=true;
        while (all2){
            System.out.println("Pilih cara pembayaran [1. COD] [2. Kredt] : ");
            int b = scan.nextInt();
            if (b == 1){transaksipembeli1.setMetode(COD); all2=false;}
            else if (b == 2){transaksipembeli1.setMetode(Kredit); all2=false;}
            else all2=true;
        }
        System.out.println("Verifikasi!");
        System.out.println(pembeli1.getUsername());
        cetakAlamat(pembeli1.getAlamat());
        System.out.println("Rp " +transaksipembeli1.getPrice(aqua));
        boolean All1 = true;
        while (All1) {
        System.out.println("Apakah ini benar (Y/N) ?");
        String uji = scan.nextLine();
        if ("Y".equals(uji)){All1=false; All=false;}
        else if ("N".equals(uji)){All1=false;}
        else All1=true;
        }
    
    }   
    
    
    
    
}
     static void cetakAlamat(Alamat alamat){
        System.out.println("Jalan : " + alamat.getJalan()+"no. "+ alamat.getNomorRumah() + alamat.getKelurahan() + alamat.getKecamatan()+ alamat.getKabupatenkota());
        
    }
   
    static void tulisAlamat(Alamat alamat){
        Scanner scan = new Scanner(System.in);
        System.out.println("masukan nama jalan:");
        {boolean error = true;
       while(error) {
       try {
         alamat.setJalan(scan.nextLine());
         error = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
       }
        
       System.out.println("masukan nomor rumah:");
      {boolean error = true;
       while(error) {
       try {
         alamat.setNomorRumah(scan.nextLine());
         error = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
       }
      
       System.out.println("masukan nama Kelurahan:");
        
       {boolean error = true;
        while(error){
           try {
                alamat.setKelurahan(scan.nextLine());
                error = false;
           } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            } 
        }
       
            
        }
         
       System.out.println("masukan nama Kecamatan:");
       {boolean error = true;
       while(error) {
       try {
         alamat.setKecamatan(scan.nextLine());
         error = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
       }
        
       System.out.println("masukan nama Kabupaten/Kota:");
        {boolean error = true;
       while(error) {
       try {
         alamat.setKabupatenkota(scan.nextLine());
         error = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
       }
        
        
        
        
   }}
