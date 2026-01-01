package strings;

public class mostConsecutiveOnesUsingMethod {
    public static void mostCosecutiveOnes(int n){
        char[] binary=Integer.toBinaryString(n).toCharArray();
        int tmpCount=0,maxCount=0;
        for(int i=0;i<binary.length;i++){
            if(binary[i]=='0'){
                if(tmpCount>maxCount){
                    maxCount= tmpCount;
                }
                tmpCount=0;
            }
            else tmpCount++;
        }
        if(tmpCount>maxCount){
            maxCount= tmpCount;
        }
        System.out.println("Most Consecutive Ones Using Method "+ maxCount);
    }
}
