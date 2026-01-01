package strings;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("");

        int n=sc.nextInt();

        //Calling using static
        mostConsecutiveOnesUsingMethod.mostCosecutiveOnes(n);
        //Calling using Constructor
        new mostConsecutiveOnesUsingConstructor(n);
        //Shortened Logic

        //mostConsecutiveOnesShorte
        mostConsecutiveOnesShortMethod.mostConsecutiveOnesShort(n);

*/
       /* TestThread t=new TestThread();
        t.start(); //asynchronised
       // t.run();     //sunchronised
        for(int i=0;i<1000;i++){
            System.out.print(i+" ");
        }

        */
        TestThreadInterface t=new TestThreadInterface();
        Thread t1=new Thread(t);
        t1.start();
        //t1.start();

        for(int i=0;i<1000;i++){
            System.out.print(i+" ");
        }


    }
}