package Array.q1;

/**
 * answerD
 */
public class answerD {
    public int count = 0;

    answerD() {
        count = 0;
    }

    boolean check(int[] array, int sum) {
        count = 0;
        for (int i = 0; i < array.length; i++) {
            int find = sum - array[i];
            if (search(array, find, i + 1)) {
                return true;
            }
        }
        return false;
    }

    boolean search(int[] array, int check, int start) {

        for (int i = start; i < array.length; i++) {
            count++;
            if (array[i] == check) {
                return true;
            }
        }
        return false;
    }
}