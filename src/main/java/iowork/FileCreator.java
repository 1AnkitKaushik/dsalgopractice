package iowork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Objects;

//some change
public class FileCreator {
   boolean createFileAtLocation(String location){
       FileWriter fw;
       fw = null;
       try {
        File localFile = new File(location);
        if(localFile.isFile()) {
            System.out.println("File1");
            fw = new FileWriter(localFile);
        }
        else if(localFile.isDirectory()){
            System.out.println("Directory1");
            fw= new FileWriter(localFile);
        }
        else{
            System.out.println("Nooo");
            System.out.println(location);

        }
           assert fw != null;
           fw.write("first file");
           fw.flush();
           fw.write("2nd file");
           //fw.flush();
       } catch (IOException e) {
           e.printStackTrace();
           System.out.println("error creating file");
       }
       finally {
           try {
               Objects.requireNonNull(fw).close();
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
       }
       return true;
    }
}
