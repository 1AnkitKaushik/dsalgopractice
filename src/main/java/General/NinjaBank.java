package General;

public class NinjaBank {
    public static int totalAmount(int i){
        int n=i/7;
        int d=i%7;
        return 28*n+7*n*(n-1)/2 + n*d+d*(d+1)/2;
    }
}
