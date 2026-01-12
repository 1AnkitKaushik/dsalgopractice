package General;

import java.util.List;
import java.util.Scanner;

import java.lang.*;

public class GeneralMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* System.out.println("Enter the no of days:");
        int i=sc.nextInt();
        System.out.println("Total amount of money after "+i+" days: "+ NinjaBank.totalAmount(i));*/
        //Question2
       /* System.out.println("Enter the no of carrots:");
        int c=sc.nextInt();
        System.out.println("Enter the no of rabbits:");
        int r=sc.nextInt();

        int[] rabbits= new int[r];
        System.out.println("Enter first jumps of rabbits: ");
        for (int i=0;i<r;i++){
            rabbits[i]=sc.nextInt();
        }
        RabbitCarrot rc=new RabbitCarrot(c,rabbits);
        int remaining= rc.countRemainingCarrots();
        System.out.println("Remaining carrots: "+remaining);*/
      //  String URL = "jdbc:mysql";
        String URL = "jdbc:mysql://localhost:3306/maverick";
        //String userName = "";
        //String password = "";
        String userName = "root";
        String password = "12345678";
        DBObject dbo = new DBObject(URL,
                                        userName,
                                                    password);
        ReportCreator rc=new DataReportCreator();
        Template tObject = rc.getinputTemplate("d:/coderepos/resources/config.txt");
        List<Data> dataList =  rc.getInputData(dbo);
        System.out.println("a1");
        rc.createReport(tObject,dataList);
        System.out.println("a2");
   /*     Data d = new Data();
        d.setAge(12);
        d.setUserName("pankaj");
        d.setUserID("u101");
        System.out.println(d.toString());*/

    }
}
