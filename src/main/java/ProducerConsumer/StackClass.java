package ProducerConsumer;

public class StackClass {
    public static int STACK_SIZE = 5;
    private int [] datastructure = new int[STACK_SIZE];
    int currentIndex=0;

     public void push(int x) throws OverflowException{
         if (currentIndex > (STACK_SIZE -1))
             throw new OverflowException();
        datastructure[currentIndex] = x;
         currentIndex= currentIndex+1;


    }
    public int pop() throws UnderflowException {
        if(currentIndex < 0){
            throw new UnderflowException();
        }

        int element = datastructure[currentIndex];
        currentIndex= currentIndex-1;
        return element;

    }
    public int getCurrentIndex(){
        return currentIndex;
    }
}
