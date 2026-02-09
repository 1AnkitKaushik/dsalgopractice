package Recursion;

public class factorial {
    public int factorial(int n) {
        if(n<0){
            System.out.println("Factorial not possible");
            return 0;
        }
        else if (n == 1 || n == 0) {
            return 1;
        }
        else {
            return n*factorial(n - 1);
        }
    }
}
