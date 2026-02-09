package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnector {
    public Connection getJDBCConnection() throws Exception{
        String username = "root";
        String password = "12345678";
        String url = "jdbc:mysql://localhost:3306/maverick";
        Connection con=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("111111");
            con = DriverManager.getConnection(url, username, password);
            System.out.println("22222222");
        } catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
