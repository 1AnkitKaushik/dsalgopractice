package iowork;

public class IOMain {
    public static void main (String [] args){
        String location = "D:\\coderepos\\resources\\def.txt";
        FileCreator fc = new FileCreator();
        fc.createFileAtLocation(location);
        //new question
        String location1="D:\\coderepos\\resources\\1\\1.txt";
        fc.createFileAtLocation(location1);
        String location1="D:\\coderepos\\resources\\1\\1.txt";

        String location2="D:\\coderepos\\resources\\1\\1.txt";
        String location3="D:\\coderepos\\resources\\1\\1.txt";
        String location4="D:\\coderepos\\resources\\1\\4\\1.txt";
    }
}
