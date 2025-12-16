/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadatabase;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author imadw
 */
public class JavaDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Connection conn = DbConnection.connect();
            
        try {
            //1.  Buat koneksi ke DB
            Connection con = DbConnection.connect();
            //System.out.println("Berhasil");
            
            
            Reguler m1 = new  Reguler(0, "12345","Falissa",2024, 24);
            Beasiswa m2 = new  Beasiswa(0, "12346","Falissa",2024, 22);
            Internasional m3 =new Internasional(0, "12347","Falissa",2024,20);
            
            m1.hitungBiaya();
            m2.hitungBiaya();
            m3.hitungBiaya();
            
            String sql = "INSERT INTO mahasiswa (nim,nama,tahunmasuk,jenismahasiswa,jumlahsks,biayakuliah) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            insertMahasiswa(ps, m1);
            insertMahasiswa(ps, m2);
            insertMahasiswa(ps, m3);

            ps.close();
            con.close();
            
        } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
            
    static void insertMahasiswa(PreparedStatement ps, Mahasiswa m) throws SQLException {
        ps.setString(1, m.getNim());
        ps.setString(2, m.getNama());
        ps.setInt(3, m.gettahunmasuk());
        ps.setString(4, m.getjenismahasiswa());
        ps.setInt(5, m.getjumlahsks());
        ps.setDouble(6, m.getbiayakuliah());
        ps.executeUpdate();
    }}