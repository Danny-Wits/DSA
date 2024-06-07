package Array.q3;

/**
 * answerU
 */
public class answerU {
    public int count;

    void test(int ar[]) {
        boolean var;
        count = 0;
        for (int j = 0; j < ar.length; j++) {
            for (int i = j + 1; i < ar.length; i++) {
                count++;
                if (ar[j] == ar[i]) {
                    System.out.print(ar[j] + ",");

                }

            }
        }

    }

}
