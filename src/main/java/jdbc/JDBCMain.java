package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCMain {
     static void doI(){
            String username = "root";
            String password = "12345678";
            String url = "jdbc:mysql://localhost:3306/maverick";
         try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
             System.out.println("111111");
             Connection con = DriverManager.getConnection(url,username,password);
             System.out.println("22222222");
             Statement stmnt = con.createStatement();
             System.out.println("333333");
             ResultSet rs = stmnt.executeQuery("select * from user");
             while (rs.next()){
                 System.out.println(rs.getString(1));
                 System.out.println(rs.getString(2));
                 System.out.println(rs.getInt(3));
             }
         } catch (Exception e){
             e.printStackTrace();
             System.out.println("in catch"+e);
         }


    }
    public static void main(String [] args){
        doI();
    }
}
