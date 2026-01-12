package iowork;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamFileProcessor {
    void writeToFile(String location) throws IOException {
        String testString = "This is a test string for buffered stream demo";
        File fileObj = new File(location);

        BufferedOutputStream bos = new BufferedOutputStream(
                                        new FileOutputStream(
                                                fileObj)
                                        );
        bos.write(testString.getBytes());
        bos.flush();
        bos.close();
    }
    List readfromFile(String location) throws IOException{
        File fileObj = new File(location);
        BufferedInputStream bis = new BufferedInputStream(
                                        new FileInputStream(fileObj));
        List inputList = new ArrayList();
        while (bis.available() > 0){
               byte [] inputBytes =  bis.readAllBytes();
               String s = new String(inputBytes);
               inputList.add(s);
        }
        return inputList;
    }
    void doProcess(List l){
        addSomeMoreData(l);
        Iterator itobj = l.iterator();
        int i=0;
        while (i < l.size()){

        String lineElement = (String)  itobj.next();
            System.out.println("Printing String    "+lineElement);l.add("test");
        }
    }

    private void addSomeMoreData(List l) {
       int i=0;
        while(i < 100){
            l.add(" "+i);
            i=i+1;
        }
    }
}
