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
public class Bio {
    private String nama;
    private int usia;
    private String alamat;
    public Bio (String nama, int usia, String alamat)
    {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }
    
    public void info()
    {
        System.out.println("Nama: "+this.nama);
        System.out.println("Usia: "+this.usia);
        System.out.println("Alamat: "+this.alamat);
    }
}
