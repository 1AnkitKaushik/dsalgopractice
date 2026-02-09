package Recursion;

public class Fibonacci {
    public int Fibonacci(int n){
        if(n<0){
            System.out.println("Fibonacci sequence for no. less than 1 is not defined.");
            return 0;
        }
        if (n==1 || n==2){
            return 1;
        }
        else return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
