package Array.sorting;

public class answerU {
    // In Bubble Sort algorithm,
    // traverse from left and compare adjacent elements and the higher one is placed
    // at right side.
    // In this way, the largest element is moved to the rightmost end at first.
    // This process is then continued to find the second largest and place it and so
    // on until the data is sorted.
    public static int[] bsort(int[] ar) {
        long start = System.nanoTime();
        int temp;
        int count = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < ar.length - 1; i++) {
                count++;
                if (ar[i] > ar[i + 1]) {
                    temp = ar[i + 1];
                    ar[i + 1] = ar[i];
                    ar[i] = temp;
                    flag = true;
                }

            }
        }
        long end = System.nanoTime();
        long time = (end - start) / 1000;
        System.out.print(" TIME (ms) :  " + time);
        System.out.println("  | ITERATION : " + count);
        return ar;

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