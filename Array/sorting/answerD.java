package Array.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class answerD {
    // In Bubble Sort algorithm,

    // traverse from left and compare adjacent elements and the higher one is placed
    // at right side.
    // In this way, the largest element is moved to the rightmost end at first.
    // This process is then continued to find the second largest and place it and so
    // on until the data is sorted.
    public static int[] bsort(int[] array) {
        long start = System.nanoTime();
        boolean swapped = true;
        int count = 0;
        while (swapped) {
            swapped = false;
            for (int j = 0; j < array.length - 1; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
        }

        long end = System.nanoTime();
        long time = (end - start) / 1000;
        System.out.print("TIME (ms) :  " + time);
        System.out.println("  | ITERATIONS : " + count);
        return array;
    }

    // The key process in quickSort is a partition(). The target of partitions is to
    // place the pivot (any element can be chosen to be a pivot) at its correct
    // position in the sorted array and put all smaller elements to the left of the
    // pivot, and all greater elements to the right of the pivot.

    // Partition is done recursively on each side of the pivot after the pivot is
    // placed in its correct position and this finally sorts the array.

    public static void qsort(int [] array){
        List<Integer>arr=new ArrayList<>();
        for (int i:array) {
            arr.add(i);
        }
        List<Integer>sorted=qsortHelper(arr);
        for (int i = 0; i < array.length; i++) {
            array[i]= sorted.get(i);
        }
       // System.out.println(Arrays.toString(array));
    }

    public static List<Integer> qsortHelper(List<Integer> array) {

        int pivot = array.size() - 1;
        if (pivot <= 0)return array;
        List<Integer> before = new ArrayList<>();
        List<Integer> after = new ArrayList<>();
        for (int i = 0; i < array.size()-1; i++) {
            if (array.get(i) >= array.get(pivot)) {
                after.add(array.get(i));
            } else {
                before.add(array.get(i));
            }
        }
        before = qsortHelper(before);
        after = qsortHelper(after);
        before.add(array.get(pivot));
        before.addAll(after);

        return before;

    }

    public static void msort(int[] array) {
        int length = array.length;
        if(length<=1)return;
        int middle=length/2;
        int [] leftArray=new int[middle];
        int [] rightArray=new int[length-middle];
       for (int i = 0; i < leftArray.length; i++) {
        leftArray[i]=array[i];
       }
       for (int i = 0; i <rightArray.length; i++) {
        rightArray[i]=array[i+middle];
       }
       msort(leftArray); 
       msort(rightArray);
       merge(leftArray,rightArray,array);
    }
    
    public static void merge(int [] leftArray,int[] rightArray , int[] array){
        int leftLength=leftArray.length;
        int rightLength=rightArray.length;
        int i=0,j=0,k=0;

        while (j<leftLength&&k<rightLength) {
              if (leftArray[j]<rightArray[k]) {
                 array[i]=leftArray[j];
                    i++;
                    j++;
              }else{
                array[i]=rightArray[k];
                i++;
                k++;
              }
        }
        while (k<rightLength) {
            array[i]=rightArray[k];
                i++;
                k++;
        }
        while (j<leftLength) {
            array[i]=leftArray[j];
            i++;
            j++;
        }
    }

}
