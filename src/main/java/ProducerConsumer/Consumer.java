package ProducerConsumer;

import java.util.Stack;

public class Consumer implements Runnable {
    public Consumer() {
    }

    public Consumer(StackClass stackObj) {

    }
    StackClass q=new StackClass();
    public void run() {
        //wait mode if <0
        synchronized (this) {
            if (q.getCurrentIndex() > 0) {
                try {
                    q.pop();
                } catch (UnderflowException e) {
                    System.out.println("CatchingCatchOfConsumer");
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
