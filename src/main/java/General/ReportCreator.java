package General;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class ReportCreator {
     Template getinputTemplate(String location){
         File configFile = new File(location);
         String regex = "[=]+";
         Template t = new Template();

         try {
             BufferedReader readerObj = new BufferedReader( new FileReader( configFile));
             while (readerObj.ready()) {
                 String line = readerObj.readLine();
                 String[] configLineItem = line.split(regex);
                 t.getConfigMap().put(configLineItem[0], configLineItem[1]);
             }
         } catch (IOException ioe) {
             throw new RuntimeException(ioe);
         }
         return t;
    }
    List<Data> getInputData(DBObject dbo){
        List<Data> l =new ArrayList<>();
        try {

            //1. Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. Establish a connection to the database
            Connection con = DriverManager.getConnection(dbo.getUrl(),dbo.getUsername(),dbo.getPassword());

            Statement stmnt = con.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from user");
            while (rs.next()){
                Data tempD = new Data();
                tempD.setUserID(rs.getString(1));
                tempD.setUserName(rs.getString(2));
                tempD.setAge(rs.getInt(3));
                l.add(tempD);
                System.out.println(tempD.toString());
                /*System.out.println(rs.getString(1));
                //Data d=new Data;
                //l.add(rs.getString(1));
                System.out.println(rs.getString(2));
               // l.add(rs.getString(2));
                System.out.println(rs.getInt(3));
               // l.add(rs.getString(3));*/

            }

           // return l;
            //l.add
            //return l;

        }
        catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e.getCause());
        }
         return l;
    }

      abstract void  createReport(Template tObject, List<Data> dataList);
  //  abstract void class create
}
