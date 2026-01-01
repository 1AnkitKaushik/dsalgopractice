package strings;
public class mostConsecutiveOnesShortMethod {
    public static void mostConsecutiveOnesShort(int n) {
        char[] binary = Integer.toBinaryString(n).toCharArray();
        int tmpCount = 0, maxCount = 0;
        for (int i = 0; i < binary.length; i++) {
            tmpCount = (binary[i] == '0') ? 0 : tmpCount + 1;
            if (tmpCount > maxCount) {
                maxCount = tmpCount;
            }
        }
        if(tmpCount>maxCount){
            maxCount= tmpCount;
        }
        System.out.println("Most Consecutive Ones Shortened "+ maxCount);
    }

}
