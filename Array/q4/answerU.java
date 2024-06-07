package Array.q4;

import java.util.Arrays;

/**
 * answerU
 */
public class answerU {
    public int count;

    void test(int array[]) {
        int mul;
        int prod[] = new int[array.length];
        count = 0;
        for (int j = 0; j < array.length; j++) {
            mul = 1;
            for (int i = 0; i < array.length; i++) {
                count++;
                if (i == j) {
                    continue;
                }
                mul *= array[i];

            }
            prod[j] = mul;
        }
        System.out.println("Product = " + Arrays.toString(prod));
    }

}
