package strings;

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
        /*TestThreadInterface t=new TestThreadInterface();
        Thread t1=new Thread(t);
        t1.start();
        //t1.start();

        for(int i=0;i<1000;i++){
            System.out.print(i+" ");
        }
*/
        int counter =1;
        Account a = new Account();
        ThreadClass t1=new ThreadClass(counter,a);
        ThreadClass t2=new ThreadClass(++counter,a);
        ThreadClass t3=new ThreadClass(++counter,a);
        ThreadClass t4=new ThreadClass(++counter,a);
        ThreadClass t5 =new ThreadClass(++counter,a);
        ThreadClass t6=new ThreadClass(counter,a);
        ThreadClass t7=new ThreadClass(++counter,a);
        ThreadClass t8=new ThreadClass(++counter,a);
        ThreadClass t9=new ThreadClass(++counter,a);
        ThreadClass t10 =new ThreadClass(++counter,a);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}