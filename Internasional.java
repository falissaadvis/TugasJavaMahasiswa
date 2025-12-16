/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadatabase;

/**
 *
 * @author Windows
 */
public class Internasional extends Mahasiswa {
    
    public Internasional(int id, String nim, String nama, 
                                 int tahunmasuk, int jumlahsks) {
        
        super(nim, nama, tahunmasuk, "Internasional", jumlahsks);
    }
    
    @Override
    public void hitungBiaya() {
        this.biayakuliah = (this.jumlahsks * 300000) + 500000;
    }
} 