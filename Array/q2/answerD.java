package Array.q2;

/**
 * answerD
 */
public class answerD {
    public int count = 0;

    answerD() {
        count = 0;
    }

    int max(int[] array) {
      count = 0;
      int maximum=0;
      for (int i = 0; i < array.length; i++) {
        for (int j = i+1; j < array.length; j++) {
            count++;
            int currentProfit=array[j]-array[i];
            if(currentProfit>maximum){
                maximum=currentProfit;
            }
        }
      }  
      return maximum;
    }

   
}