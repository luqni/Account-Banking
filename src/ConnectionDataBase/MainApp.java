package ConnectionDataBase;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.ResultSet;

public class MainApp {
//	?zeroDateTimeBehavior=convertToNull
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/shop?zeroDateTimeBehavior=convertToNull";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // register driver
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            while (!conn.isClosed()) {
                showMenu();
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void showMenu() {
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Insert Data");
        System.out.println("2. Show Data");
        System.out.println("3. Edit Data");
        System.out.println("4. Delete Data");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.print("PILIHAN> ");

        try {
            int pilihan = Integer.parseInt(input.readLine());

            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
//                    insertBuku();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
//                    updateBuku();
                    break;
                case 4:
                    deleteBuku();
                    break;
                default:
                    System.out.println("Pilihan salah!");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void showData() {
        String sql = "SELECT * FROM Customer";

        try {
            rs = stmt.executeQuery(sql);
            
            System.out.println("+--------------------------------+");
            System.out.println("|    DATA Customer   |");
            System.out.println("+--------------------------------+");

            while (rs.next()) {
                int id = rs.getInt("CustomerNumber");
                String NamaDepan = rs.getString("first_name");
                String NamaBelakang = rs.getString("last_name");
                Date BirthDate = rs.getDate("BirthDate");

                
                System.out.println(String.format("%d. %s %s %s)", id, NamaDepan, NamaBelakang,BirthDate));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    static void insertBuku() {
//        try {
//            // ambil input dari user
//            System.out.print("Nama Depan: ");
//            String first_name = input.readLine().trim();
//            System.out.print("Nama Belakang: ");
//            String last_name = input.readLine().trim();
//            System.out.print("Birth Date: ");
//      	  	Date BirthDate = input.readLine().trim();
////	  System.out.print("Birth Date: ");
//	  String BirthDate = input.readLine().trim();
//	  System.out.print("User Name: ");
//	  String username = input.readLine().trim();
//	  System.out.print("Password: ");
//	  String pass = input.readLine().trim();
//	  System.out.print(" Phone Type: ");
//	  String phoneType = input.readLine().trim();
//	  System.out.print("Phone Number: ");
//	  String phoneNumber = input.readLine().trim();
//	  System.out.print("id_Account: ");
//	  String id_Account = input.readLine().trim();
 
            // query simpan
//            String sql = "INSERT INTO Customer (first_name, last_name, BirthDate) VALUE('%s','%s', '%s')";
//            
//			sql = String.format(sql,first_name, last_name);
//
//            // simpan buku
//            stmt.execute(sql);
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

//    static void updateBuku() {
//        try {
//            
//            // ambil input dari user
//            System.out.print("ID yang mau diedit: ");
//            int idBuku = Integer.parseInt(input.readLine());
//            System.out.print("Judul: ");
//            String judul = input.readLine().trim();
//            System.out.print("Pengarang: ");
//            String pengarang = input.readLine().trim();
//
//            // query update
//            String sql = "UPDATE buku SET judul='%s', pengarang='%s' WHERE id_buku=%d";
//            sql = String.format(sql, judul, pengarang, idBuku);
//
//            // update data buku
//            stmt.execute(sql);
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    

    static void deleteBuku() {
        try {
            
            // ambil input dari user
            System.out.print("ID yang mau dihapus: ");
            int idBuku = Integer.parseInt(input.readLine());
            
            // buat query hapus
            String sql = String.format("DELETE FROM Customer WHERE CustomerNumber=%d", idBuku);

            // hapus data
            stmt.execute(sql);
            
            System.out.println("Data telah terhapus...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
