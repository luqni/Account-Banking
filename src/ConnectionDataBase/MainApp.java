package ConnectionDataBase;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class MainApp {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/shop";
	static final String USER = "root";
	static final String PASS = "";
	
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Melakukan koneksi ke database
        // harus dibungkus dalam blok try/catch
        try {
            // register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);
            
            // buat koneksi ke database
            conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            
            // buat objek statement
            stmt = conn.createStatement();
            
            // buat query ke database
            String sql = "SELECT * FROM Customer";
            
            // eksekusi query dan simpan hasilnya di obj ResultSet
            rs = stmt.executeQuery(sql);
            
            // tampilkan hasil query
            while(rs.next()){
                System.out.println("Customer Number: " + rs.getInt("CustomerNumber"));
                System.out.println("Nama Depan: " + rs.getString("first_name"));
                System.out.println("Nama Belakang: " + rs.getString("last_name"));
            }
            
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
