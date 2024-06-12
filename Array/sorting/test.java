package Array.sorting;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        // Test case 1 (already sorted)
        int[] test1 = { -1, 2, 2, 3, 3, 4, 5, 6, 7 };
        int[] sol1 = { -1, 2, 2, 3, 3, 4, 5, 6, 7 };

        // Test case 2 (single element)
        int[] test2 = { 5 };
        int[] sol2 = { 5 };

        // Test case 3 (descending order)
        int[] test3 = { 7, 6, 5, 4, 3, 2, 1 };
        int[] sol3 = { 1, 2, 3, 4, 5, 6, 7 };

        // Test case 4 (empty array)
        int[] test4 = {};
        int[] sol4 = {};

        // Test case 5 (empty array)
        int[] test5 = { 1, 1, 1, 1, 1 };
        int[] sol5 = { 1, 1, 1, 1, 1 };

        // Test case 6 (large positive and negative values)
        int[] test6 = { Integer.MAX_VALUE, -100, 50, Integer.MIN_VALUE, 0 };
        int[] sol6 = { Integer.MIN_VALUE, -100, 0, 50, Integer.MAX_VALUE };

        // Test case 7 (duplicate values with different order)
        int[] test7 = { 3, 1, 4, 1, 5, 2 };
        int[] sol7 = { 1, 1, 2, 3, 4, 5 };
        int[] test8 = new int[500];
        // Arrays.fill(test8,1);
        int[] ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8;
        // System.out.println("Danishwer");
        // int[] ans1 = answerD.bsort(test1.clone());
        // System.out.println(Arrays.equals(ans1, sol1) ? "PASS" : "FAIL");
        // int[] ans2 = answerD.bsort(test2.clone());
        // System.out.println(Arrays.equals(ans2, sol2) ? "PASS" : "FAIL");
        // int[] ans3 = answerD.bsort(test3.clone());
        // System.out.println(Arrays.equals(ans3, sol3) ? "PASS" : "FAIL");
        // int[] ans4 = answerD.bsort(test4.clone());
        // System.out.println(Arrays.equals(ans4, sol4) ? "PASS" : "FAIL");
        // int[] ans5 = answerD.bsort(test5.clone());
        // System.out.println(Arrays.equals(ans5, sol5) ? "PASS" : "FAIL");
        // int[] ans6 = answerD.bsort(test6.clone());
        // System.out.println(Arrays.equals(ans6, sol6) ? "PASS" : "FAIL");
        // int[] ans7 = answerD.bsort(test7.clone());
        // System.out.println(Arrays.equals(ans7, sol7) ? "PASS" : "FAIL");
        // int[] ans8 = answerD.bsort(test8.clone());
        // System.out.println(Arrays.equals(ans8, test8) ? "PASS" : "FAIL");

        // System.out.println("Umar");
        // ans1 = answerU.bsort(test1.clone());
        // System.out.println(Arrays.equals(ans1, sol1) ? "PASS" : "FAIL");
        // ans2 = answerU.bsort(test2.clone());
        // System.out.println(Arrays.equals(ans2, sol2) ? "PASS" : "FAIL");
        // ans3 = answerU.bsort(test3.clone());
        // System.out.println(Arrays.equals(ans3, sol3) ? "PASS" : "FAIL");
        // ans4 = answerU.bsort(test4.clone());
        // System.out.println(Arrays.equals(ans4, sol4) ? "PASS" : "FAIL");
        // ans5 = answerU.bsort(test5.clone());
        // System.out.println(Arrays.equals(ans5, sol5) ? "PASS" : "FAIL");
        // ans6 = answerU.bsort(test6.clone());
        // System.out.println(Arrays.equals(ans6, sol6) ? "PASS" : "FAIL");
        // ans7 = answerU.bsort(test7.clone());
        // System.out.println(Arrays.equals(ans7, sol7) ? "PASS" : "FAIL");
        // ans8 = answerU.bsort(test8.clone());
        // System.out.println(Arrays.equals(ans8, test8) ? "PASS" : "FAIL");

        //System.out.println("Danishwer");
        // answerD.msort(test1);
        // System.out.println(Arrays.equals(test1, sol1) ? "PASS" : "FAIL");
        //  answerD.msort(test2);
        //  System.out.println(Arrays.equals(test2, sol2) ? "PASS" : "FAIL");
       answerD.msort(test3);
        System.out.println(Arrays.equals(test3, sol3) ? "PASS" : "FAIL");
    //      answerD.msort(test4);
    //     System.out.println(Arrays.equals(test4, sol4) ? "PASS" : "FAIL");
    //      answerD.msort(test5);
    //     System.out.println(Arrays.equals(test5, sol5) ? "PASS" : "FAIL");
    //     answerD.msort(test6);
    //     System.out.println(Arrays.equals(test6, sol6) ? "PASS" : "FAIL");
    //     answerD.msort(test7);
    //     System.out.println(Arrays.equals(test7, sol7) ? "PASS" : "FAIL");
    //     answerD.msort(test8.clone());
    //     System.out.println(Arrays.equals(test8, test8) ? "PASS" : "FAIL");

        // System.out.println("Umar");
        // ans1 = answerU.msort(test1.clone());
        // System.out.println(Arrays.equals(ans1, sol1) ? "PASS" : "FAIL");
        // ans2 = answerU.msort(test2.clone());
        // System.out.println(Arrays.equals(ans2, sol2) ? "PASS" : "FAIL");
        // ans3 = answerU.msort(test3.clone());
        // System.out.println(Arrays.equals(ans3, sol3) ? "PASS" : "FAIL");
        // ans4 = answerU.msort(test4.clone());
        // System.out.println(Arrays.equals(ans4, sol4) ? "PASS" : "FAIL");
        // ans5 = answerU.msort(test5.clone());
        // System.out.println(Arrays.equals(ans5, sol5) ? "PASS" : "FAIL");
        // ans6 = answerU.msort(test6.clone());
        // System.out.println(Arrays.equals(ans6, sol6) ? "PASS" : "FAIL");
        // ans7 = answerU.msort(test7.clone());
        // System.out.println(Arrays.equals(ans7, sol7) ? "PASS" : "FAIL");
        // ans8 = answerU.msort(test8.clone());
        // System.out.println(Arrays.equals(ans8, test8) ? "PASS" : "FAIL");

    }

}
