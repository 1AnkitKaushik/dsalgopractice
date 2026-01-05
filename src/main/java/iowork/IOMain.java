package iowork;
import java.io.*;
public class IOMain {
    public static void main (String [] args){
        String location = "D:\\coderepos\\resources\\def.txt";
        FileCreator fc = new FileCreator();
        fc.createFileAtLocation(location);
        //new question
       // String location1="D:\\coderepos\\resources\\56";
      //fc.createFileAtLocation(location1);

      // boolean mkdirs = new File("D:\\z\\y\\x\\w").mkdirs();
      String location2="D:\\z\\y\\x\\w\\FileTest1";
        //String location2="D:\\coderepos\\resources\\56";
      // FileCreator fc1=new FileCreator();
      // fc1.createFileAtLocation(location2);
    }
}
