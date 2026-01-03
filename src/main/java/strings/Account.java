package strings;

public class Account {
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    int amount=100;
    public synchronized boolean debit(int input){
        if(input>amount) {
            System.out.println("---in account---");
            return false;
        }
        System.out.println("---in account before debit---");
        amount=amount-input;
        return true;
    }
    boolean credit(int input){
        amount=amount+input;
        return true;
    }
}
