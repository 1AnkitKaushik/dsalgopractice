package strings;

public class TestThreadInterface implements Runnable{
 //   TestThreadInterface t=new TestThreadInterface();
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(i + " ");
        }
    }
}
