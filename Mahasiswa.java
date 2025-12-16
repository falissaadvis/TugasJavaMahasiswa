/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadatabase;

import java.sql.Connection;
/**
 *
 * @author imadw
 */
public abstract class Mahasiswa {
    protected int id;
    protected String nim;
    protected String nama;
    protected int tahunmasuk;
    protected String jenismahasiswa;
    protected int jumlahsks;
    protected double biayakuliah;
   
    Connection con;
    
    public Mahasiswa(String nim, String nama, int tahunMasuk, 
                     String jenisMahasiswa, int jumlahsks) {
        this.nim = nim;
        this.nama = nama;
        this.tahunmasuk = tahunmasuk;
        this.jenismahasiswa = jenismahasiswa;
        this.jumlahsks = jumlahsks;
        this.biayakuliah = 0;
    }
    
    public abstract void hitungBiaya();
    
    public int getId() {
        return id;
    }
    
    public String getNim() {
        return nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int gettahunmasuk() {
        return tahunmasuk;
    }
    
    public String getjenismahasiswa() {
        return jenismahasiswa;
    }
    
    public int getjumlahsks() {
        return jumlahsks;
    }
    
    public double getbiayakuliah() {
        return biayakuliah;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void settahunmasuk(int tahunmasuk) {
        this.tahunmasuk = tahunmasuk;
    }
    
    public void setjenismahasiswa(String jenismahasiswa) {
        this.jenismahasiswa = jenismahasiswa;
    }
    
    public void setjumlahsks(int jumlahsks) {
        this.jumlahsks = jumlahsks;
    }
    
    public void setbiayakuliah(double biayakuliah) {
        this.biayakuliah = biayakuliah;
    }
    
     @Override
    public String toString() {
        return "Mahasiswa{" +
                "id=" + id +
                ", nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", tahunMasuk=" + tahunmasuk +
                ", jenisMahasiswa='" + jenismahasiswa + '\'' +
                ", sks=" + jumlahsks +
                ", biayaKuliah=" + biayakuliah +
                '}';
    }
}
   