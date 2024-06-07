package Array.q3;

import java.util.Arrays;

/**
 * answerD
 */
public class answerD {
    public int count = 0;

    answerD() {
        count = 0;
    }
    void test(int[] array){
    count=0;
    Arrays.sort(array);
    int value=array[0];
    boolean printed=false;
    System.out.print("Repeating numbers are : [");
    for (int i = 1; i < array.length; i++) {
        count++;
        if(value==array[i] &&!printed){
          System.out.print(value+" ,");
          printed=true;
        }
        if(value!=array[i]){
          printed=false;
          value=array[i];
        }
      }
      System.out.print("]");
    }
}