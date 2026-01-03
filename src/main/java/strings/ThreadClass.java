package strings;

public class ThreadClass extends Thread{
 Account a;
   int counter =-1;
    public ThreadClass(int counter, Account a) {
        this.counter=counter;
        this.a=a;
    }

    public void run(){

        System.out.println( a.debit(80)+" 1st stmnt"+ a.getAmount()+"------"+counter);
        System.out.println("just delaying !!");
        System.out.println( a.debit(80)+" 2nd stmnt"+a.getAmount()+"========"+counter);


    }


}
