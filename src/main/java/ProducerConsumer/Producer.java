package ProducerConsumer;

public class Producer implements Runnable {
    private StackClass stack;
    public Producer(){

    }

    public Producer(StackClass stackObj) {
        this.stack=stackObj;
    }

    public void run() {
        synchronized (stack) {
            if (stack.getCurrentIndex() > StackClass.STACK_SIZE) {
                try {
                    System.out.println("CatchingRunTryOfProducer");
                    stack.notifyAll();
                    stack.wait();
                } catch (InterruptedException e) {
                    System.out.println("CatchingRunCatchOfProducer");
                    throw new RuntimeException(e);
                }
            }
            else {
                try {
                    stack.push(5);
                } catch (OverflowException e) {
                  //  System.out.println("CatchingRunOfProducer");
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
