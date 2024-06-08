package Array.q5;
// Given an array arr[] of size N. The task is to find the sum of the contiguous sub array within a arr[] with the largest sum. 

// Example:

// Input: arr = {-2,-3,4,-1,-2,1,5,-3}
// Output: 7
// Explanation: The subarray {4,-1, -2, 1, 5} has the largest sum 7.
import java.util.Arrays;
class test {
    public static void main(String[] args) {

        int[] test1 = {-2,-3,4,-1,-2,1,5,-3};
        int[] test2 = {2, -3, -4, -1, -2, 5, 3};
        int[] test3 = new int[50];
        Arrays.fill(test3, 1);
        int[] test4 = {5,4,1,7,8};
        int[] test5 = {-1};

        System.out.println("Danishwer");
        answerD.test(test1);
        System.out.printf(" | Size : %d  | iterations : %d\n", test1.length, answerD.count);
        answerD.test(test2);
        System.out.printf(" | Size : %d  | iterations : %d\n", test2.length, answerD.count);
        answerD.test(test3);
        System.out.printf(" | Size : %d  |  iterations : %d\n", test3.length, answerD.count);
        answerD.test(test4);
        System.out.printf(" | Size : %d  |  iterations : %d\n", test4.length, answerD.count);
        answerD.test(test5);
        System.out.printf(" | Size : %d  |  iterations : %d\n", test5.length, answerD.count);

        System.out.println("Umar");
        answerU.test(test1);
        System.out.printf(" | Size : %d  |    iterations : %d\n", test1.length, answerU.count);
        answerU.test(test2);
        System.out.printf(" | Size : %d  |   iterations : %d\n", test2.length, answerU.count);
        answerU.test(test3);
        System.out.printf(" | Size : %d  |   iterations : %d\n", test3.length, answerU.count);
        answerU.test(test4);
        System.out.printf(" | Size : %d  |     iterations : %d\n", test4.length, answerU.count);
        answerU.test(test5);
        System.out.printf(" | Size : %d  |     iterations : %d\n", test5.length, answerU.count);

        System.out.println("OPT");
        opt.test(test1);
        System.out.printf(" | Size : %d  |    iterations : %d\n", test1.length, opt.count);
        opt.test(test2);
        System.out.printf(" | Size : %d  |   iterations : %d\n", test2.length, opt.count);
        opt.test(test3);
        System.out.printf(" | Size : %d  |   iterations : %d\n", test3.length, opt.count);
        opt.test(test4);
        System.out.printf(" | Size : %d  |     iterations : %d\n", test4.length, opt.count);
        opt.test(test5);
        System.out.printf(" | Size : %d  |     iterations : %d\n", test5.length, opt.count);
    }
}
