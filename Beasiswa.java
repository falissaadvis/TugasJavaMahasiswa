/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadatabase;

/**
 *
 * @author Windows
 */
public class Beasiswa extends Mahasiswa {
    
    public Beasiswa(int id, String nim, String nama, 
                            int tahunMasuk, int jumlahsks) {
        super(nim, nama, tahunMasuk, "Beasiswa", jumlahsks);
    }
    
    public void hitungbiaya() {
         this.biayakuliah = this.jumlahsks * 150000 * 0.5;
    }

    @Override
    public void hitungBiaya() {
        this.biayakuliah = this.jumlahsks * 150000 * 0.5;
    }
}

