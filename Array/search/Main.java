package Array.search;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Test cases
        int[] test1 = { -1, 2, 2, 3, 3, 4, 5, 6, 7 };
        int needle1 = 5;
        boolean expected1 = true;

        int[] test2 = {};
        int needle2 = 5;
        boolean expected2 = false;

        int[] test3 = { 10 };
        int needle3 = 10;
        boolean expected3 = true;
        int needle3b = 20;
        boolean expected3b = false;

        int[] test4 = { 1, 2, 3, 2, 1 };
        int needle4 = 2;
        boolean expected4 = true;

        // Test case 7 (long array)
        int[] test7 = new int[1000]; // Adjust size as needed
        Arrays.fill(test7, 0);
        int needle7 = 5; // Adjust needle value as needed

        // Perform binary search and verify results
        boolean sol1 = Search.binarySearch(test1, needle1);
        boolean sol2 = Search.binarySearch(test2, needle2);
        boolean sol3 = Search.binarySearch(test3, needle3);
        boolean sol3b = Search.binarySearch(test3, needle3b);
        boolean sol4 = Search.binarySearch(test4, needle4);
        boolean sol7 = Search.binarySearch(test7, needle7);

        // Print test results
        System.out.println("Test 1: " + (sol1 == expected1 ? "PASS" : "FAIL"));
        System.out.println("Test 2: " + (sol2 == expected2 ? "PASS" : "FAIL"));
        System.out.println("Test 3: " + (sol3 == expected3 ? "PASS" : "FAIL"));
        System.out.println("Test 3b: " + (sol3b == expected3b ? "PASS" : "FAIL"));
        System.out.println("Test 4: " + (sol4 == expected4 ? "PASS" : "FAIL"));
        System.out.println("Test 7 (long array): " + (!sol7 ? "PASS" : "FAIL"));
    }
}
