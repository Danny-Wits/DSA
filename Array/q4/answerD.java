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
    count =0;
    int product = product(array);
    int []prod= new int[array.length];
    
    for (int i = 0; i < prod.length; i++) {
      count++;
      if(array[i]==0){
        
      }
      prod[i]=product/array[i];  
    }
    System.out.println("Product = " + Arrays.toString(prod));
  }
  int product(int [] array){
    int p=1;
    for (int i : array) {
      count++;
      p*=i;
    }
    return p;
  }

}