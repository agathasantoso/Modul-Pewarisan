/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author NAT
 */
public class Siswa extends Bio {
     private String noInduk;
    
    public Siswa (String noInduk, String nama, int usia, String alamat)
    {
        super(nama, usia, alamat);
        this.noInduk = noInduk;
    }
    
    public void info()
    {
        System.out.println("No. Induk Siswa : " +this.noInduk);
        super.info();
    }
}
