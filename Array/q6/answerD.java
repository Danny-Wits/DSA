package Array.q6;

public class answerD {

    public static int count = 0;

    public static void test(int[] array) {
        count=0;
        int curProduct=1;
        int maxProduct=Integer.MIN_VALUE;

        for (int i : array) {
            count++;
            if(curProduct*i>maxProduct){
                maxProduct=curProduct*i;
            }
        }
    
    }
   
}
