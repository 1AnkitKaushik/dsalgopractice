package General;

public class RabbitCarrot {
    private int c;
    private int[] rabbits;
    public RabbitCarrot(int c,int[] rabbits){
        this.c=c;
        this.rabbits=rabbits;
    }
    public int countRemainingCarrots(){
        boolean[] eaten=new boolean[c+1];
        for (int a: rabbits){
            for(int i=a;i<=c;i+=a){
                eaten[i]=true;
            }
        }
        int remaining=0;
        for(int i=1;i<=c;i++){
            //System.out.println(i);
            if(eaten[i]==false){
                System.out.println("r"+i);
                remaining++;
            }
        }
        return remaining;
    }
}
