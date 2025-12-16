/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadatabase;

/**
 *
 * @author Windows
 */
public class Reguler extends Mahasiswa {
    
     public Reguler(int id, String nim, String nama, 
                           int tahunmasuk, int jumlahsks) {
        super(nim, nama, tahunmasuk, "Reguler", jumlahsks);
    }
    
    public void hitungbiaya() {
        this.biayakuliah = this.jumlahsks * 150000;
    }

    @Override
    public void hitungBiaya() {
        this.biayakuliah = this.jumlahsks * 150000;
    }

    
}

