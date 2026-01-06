package General;

import java.util.Scanner;

import java.lang.*;

public class GeneralMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* System.out.println("Enter the no of days:");
        int i=sc.nextInt();
        System.out.println("Total amount of money after "+i+" days: "+ NinjaBank.totalAmount(i));*/
        //Question2
        System.out.println("Enter the no of carrots:");
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
        System.out.println("Remaining carrots: "+remaining);

    }
}
