/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

import java.util.Scanner;

/**
 *
 * @author ASUS X450JN
 */
class Pohon {
    String nama,nama1;
    int tinggi,tinggi1;
    
void setNama(){
    Scanner input = new Scanner(System.in);
    System.out.print("Nama kelapa : ");
        nama = input.nextLine();
}
void setTinggi(){
   Scanner input = new Scanner(System.in);
    System.out.print("Tinggi kelapa : ");
        tinggi = input.nextInt();
}
void getNama(){
    Scanner input = new Scanner(System.in);
    System.out.print("Nama cemara : ");
        nama = input.nextLine();
}
void getTinggi(){
    Scanner input = new Scanner(System.in);
    System.out.print("Tinggi cemara : ");
        tinggi = input.nextInt();
}
}

