/*package jdbc;

import java.sql.*;

public class JDBCMain {
     static void doI(){
            String username = "root";
            String password = "12345678";
            String url = "jdbc:mysql://localhost:3306/maverick";
            Connection con=null;
         try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
             System.out.println("111111");
             con = DriverManager.getConnection(url,username,password);
             System.out.println("22222222");
             Statement stmnt = con.createStatement();
             System.out.println("333333");
             ResultSet rs = stmnt.executeQuery("select * from user");
             while (rs.next()){
                 System.out.println(rs.getString(1));
                 System.out.println(rs.getString(2));
                 System.out.println(rs.getInt(3));
             }
             con.close();
         } catch (Exception e){
             e.printStackTrace();
             System.out.println("in catch"+e);
             try {
                 con.close();
             } catch (SQLException ex) {
                 throw new RuntimeException(ex);
             }
         }


    }
    public static void main(String[] args) throws Exception{
       // doI();
        PreparedExecutor pe = new PreparedExecutor();
        pe.doPreparedStmnt(pe.getJcon().getJDBCConnection());
    }
}
*/