package Array.q1;

/**
 * answerU
 */
public class answerU {
    public int count;

    answerU() {
        count = 0;
    }

    boolean check(int[] ar, int sum) {
        count = 0;
        for (int j = 0; j < ar.length; j++) {
            for (int i = j + 1; i < ar.length; i++) {
                count++;
                if (ar[j] + ar[i] == sum) {
                    return true;
                }
            }
        }
        return false;
    }
}
