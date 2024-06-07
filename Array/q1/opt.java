package Array.q1;
// The idea is to use the two-pointer technique.

import java.util.Arrays;

// But for using the two-pointer technique, the array must be sorted. 
// Once the array is sorted the two pointers can be taken which mark the beginning and end of the array respectively.
// If the sum is greater than the sum of those two elements, 
// shift the right pointer to decrease the value of the required sum and 
// if the sum is lesser than the required value, shift the left pointer to
// increase the value of the required sum.

public class opt {
    public int count = 0;

    opt() {
        count = 0;
    }

    boolean check(int[] array, int sum) {
        count=0;
        int start =0;
        int end = array.length-1;
        Arrays.sort(array);
        while (true) {
            count++;
            if (end<=start) {
                return false;
            }
            if (array[start]+array[end]==sum) {
                return true;
            }
            else if(array[start]+array[end]>sum){
                end--;
            }
            else if(array[start]+array[end]<sum){
                start++;
            }
       
        }

    }

}
