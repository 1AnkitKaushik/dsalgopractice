package jdbc;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CallableStoredProcedure {

    /*public class CallableStoredProcedure {
        public JDBCConnector getJcon() {
            return jcon;
        }

        public void setJcon(JDBCConnector jcon) {
            this.jcon = jcon;
        }

        private JDBCConnector jcon = new JDBCConnector();

        void doStoredProcedure(Connection con) throws Exception{
            //CallableStoredProcedure sp = con.callable("select * from user where user_id = ? or age > ?");
            CallableStatement cs = con.prepareCall("{call GetUserByIdOrAge(?, ?)}");
            cs.setInt(1, 5); // user_id cs.setInt(2, 30); // age ResultSet rs = cs.executeQuery();
        }

    }*/
}
