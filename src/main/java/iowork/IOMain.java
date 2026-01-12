package iowork;
import java.io.*;
import java.util.List;
import java.util.RandomAccess;

public class IOMain {
    public static void main (String [] args) throws IOException{
        String location = "D:\\coderepos\\resources\\def.txt";
       // FileCreator fc = new FileCreator();
       // fc.createFileAtLocation(location);
        //new question
       // String location1="D:\\coderepos\\resources\\56";
      //fc.createFileAtLocation(location1);

      // boolean mkdirs = new File("D:\\z\\y\\x\\w").mkdirs();
      String location2="D:\\z\\y\\x\\w\\FileTest1";
        //String location2="D:\\coderepos\\resources\\56";
      // FileCreator fc1=new FileCreator();
      // fc1.createFileAtLocation(location2);
        String newLocation = "D:\\coderepos\\resources\\xyz.txt";
        StreamFileProcessor streamProcessor = new StreamFileProcessor();
        streamProcessor.writeToFile(newLocation);
        List inputData = streamProcessor.readfromFile(newLocation);
       // streamProcessor.doProcess(inputData);
        List ankitList = new AnkitList();
        someProcessing(ankitList);
    }

    private static void someProcessing(List l) {
        if (l instanceof RandomAccess){
            //use index based access
        }
        else{
            //use iterator
        }
    }
}
