/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;
import java.sql.Connection; //digunakan untuk mengambil library NeatBeans atau menghubungkannya
import java.sql.DriverManager; //digunakan untuk mengambil library NeatBeans atau menghubungkannya
import java.sql.SQLException; //digunakan untuk mengambil library NeatBeans atau menghubungkannya
/**
 *
 * @author NITRO
 */
public class Koneksi {
    private Connection koneksi;
    public Connection Connect(){
        
        //konsep pbo Java Exception
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //melakukan pengecekan Driver
            System.out.println("DRIVER DATABASE SUDAH DITEMUKAN");
        } catch (ClassNotFoundException ex) {
            System.out.println("DRIVER TIDAK DAPAT DITEMUKAN " + ex);
        }
        
        String url = "jdbc:mysql://localhost:3306/toko_handphone"; //ini adalah url database kita yang nama databasenya ialah toko_handphone
        try {
            koneksi = DriverManager.getConnection(url, "root", ""); //ini untuk melakukan pengecekan bahwa driver terkoneksi yang disambungkan
            System.out.println("BERHASIL TERKONEKSI KE DATABASE"); //jika benar, maka ia akan muncul pemberitahuan bahwa koneksi berhasil
        } catch (SQLException ex) {
            System.out.println("GAGAL TERKONEKSI KE DATABASE " + ex); // jika salah, ia akan muncul pemberitahuan bahwa koneksi gagal
        }
        return koneksi;
    }
}
