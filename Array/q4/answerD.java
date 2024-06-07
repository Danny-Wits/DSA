package Array.q4;

import java.util.Arrays;

/**
 * answerD
 */
public class answerD {
  public int count = 0;

  answerD() {
  }

  void test(int[] array) {
    count = 0;

    if (array.length == 1) {
      System.out.println("[]");
      return;
    }
    int product = product(array);
    int[] prod = new int[array.length];
    for (int i = 0; i < prod.length; i++) {
      if (array[i] == 0) {
        int p = 1;
        for (int j = 0; j < prod.length; j++) {
          count++;
          if (i == j) {
            continue;
          }
          else if (array[j] == 0) {
            Arrays.fill(prod, 0);
            System.out.println("Product = " + Arrays.toString(prod));
            return;
          }
          p *= array[j];
        }
        prod[i] = p;
      } else {
        count++;
        prod[i] = product / array[i];
      }

    }
    System.out.println("Product = " + Arrays.toString(prod));
  }

  int product(int[] array) {
    int p = 1;
    for (int i : array) {
      count++;
      if (i == 0) {
        return 0;
      }
      p *= i;
    }
    return p;
  }

}