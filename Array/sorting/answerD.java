package Array.sorting;

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
    public static int[] qsort(int[] clone) {
       
    }




}
