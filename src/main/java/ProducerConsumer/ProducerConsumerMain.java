package ProducerConsumer;

public class ProducerConsumerMain {
    public static void main(String [] str) throws Exception{
       StackClass stackObj = new StackClass();
       Producer producerObj = new Producer(stackObj);
       Consumer consumerObj = new Consumer(stackObj);
       Thread producerThread = new Thread(producerObj);
       Thread consumerThread = new Thread(consumerObj);
       producerThread.start();
       consumerThread.start();

    }
}
