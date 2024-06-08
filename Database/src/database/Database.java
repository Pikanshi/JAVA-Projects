
package database;
import java.sql.*;
import java.util.*;

public class Database {

    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        String url = "jdbc:sqlite:/Users/asagarw/sqlite/univ.db";
        Connection con = DriverManager.getConnection(url);
        Statement stm = con.createStatement();
        stm.executeUpdate("drop table temp");
        
        /*
//        Statement stm = con.createStatement();
//        stm.executeUpdate("update dept set dname = 'Chem' where deptno = 50");
        PreparedStatement stm = con.prepareStatement("insert into students values(?,?,?,?)");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Data: ");
        int r = sc.nextInt();
        String name = sc.next();
        String city = sc.next();
        int dno = sc.nextInt();
        stm.setInt(1, r);
        stm.setString(2, name);
        stm.setString(3, city);
        stm.setInt(4, dno);
        
        stm.executeUpdate();
        
//        ResultSet rs = stm.executeQuery();
        
//        while(rs.next()) {
//            System.out.print(rs.getInt("roll") + " ");
//            System.out.print(rs.getString("name") + " ");
//            System.out.print(rs.getString("city") + " ");
//            System.out.println(rs.getInt(4));
//        }

*/
        stm.close();
        con.close();
    }
    
}
