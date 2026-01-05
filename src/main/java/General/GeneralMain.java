package General;

import java.util.Scanner;

import java.lang.*;

public class GeneralMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of days:");
        int i=sc.nextInt();
        System.out.println("Total amount of money after "+i+" days: "+ NinjaBank.totalAmount(i));

    }
}
