package Array.q5;

public class answerD {

    public static int count = 0;

    public static void test(int[] array) {
        count = 0;
        int start = 0;
        int end =0;
        int temp=0;
        int maxSum = Integer.MIN_VALUE;
        int curSum=0;
        for (int i = 0; i < array.length; i++) {
            count++;
            curSum=curSum+array[i];
            
            if (curSum>maxSum) {
                maxSum=curSum;
                start=temp;
                end=i;
            }
            if (curSum<0) {
                curSum=0;
                temp=i+1;
            }
        }
        System.out.printf("The max sum is %d with the subArray ", maxSum);
        print(array, start, end);

    }

    private static void print(int[] array, int start, int end) {
        System.out.print("[");
        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print("]\n");
    }
}
