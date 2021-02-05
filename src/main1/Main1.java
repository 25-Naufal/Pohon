/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

/**
 *
 * @author ASUS X450JN
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Pohon cemara = new Pohon();
        cemara.setNama();
        cemara.setTinggi();
    
        Pohon kelapa = new Pohon();
        kelapa.getNama();
        kelapa.getTinggi();
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println(" Nama pohon kelapa : "+kelapa.nama+", tinggi : "+kelapa.tinggi);
        System.out.println(" Nama pohon cemara : "+cemara.nama+", tinggi : "+cemara.tinggi);
        System.out.println("-----------------------------------------------------------------");
    }
    
}
