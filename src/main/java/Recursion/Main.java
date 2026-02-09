package Recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter the number whose factorial is needed:");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        factorial o=new factorial();
        System.out.println(o.factorial(n1));

        System.out.println("Find the nth no. in Fibonacci Sequence where n is:");
        int n2=sc.nextInt();
        Fibonacci f=new Fibonacci();
        System.out.println(f.Fibonacci(n2));
        for (int i = 1; i <=n2; i++) {
            System.out.print(f.Fibonacci(i) + " ");
        }
    }
}
