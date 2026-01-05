package iowork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
   boolean createFileAtLocation(String location){
       FileWriter fw=null;
       try {
        File localFile = new File(location);

        fw = new FileWriter(localFile);

           fw.write("first file");
           fw.flush();
           fw.write("2nd file");
       } catch (IOException e) {
           System.out.println("error creating file");
       }
       finally {
           try {
               fw.close();
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
       }
       return true;
    }
}
