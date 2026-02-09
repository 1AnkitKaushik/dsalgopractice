package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedExecutor   {
    public JDBCConnector getJcon() {
        return jcon;
    }

    public void setJcon(JDBCConnector jcon) {
        this.jcon = jcon;
    }

    private JDBCConnector jcon = new JDBCConnector();

    void doPreparedStmnt(Connection con) throws Exception{
        PreparedStatement ps = con.prepareStatement("select * from user where user_id = ? or age > ?");
        ps.setString(1,"1");
        ps.setInt(2,20);

        if ( ps.execute()) {
            ResultSet rs = ps.getResultSet();

            while (rs.next()){
                //String userID=rs.getRowId();
                //String  username=rs.getUsername();
                //Int age=rs.getAge();

                System.out.println("a");
               //System.out.println("userID "+userID+ ", username "+username+"age ",+ age+"\n");
            }
           // System.out.println(rs.getString());

        }

    }

}
