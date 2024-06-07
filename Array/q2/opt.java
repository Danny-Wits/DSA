package Array.q2;
// The idea is to use the two-pointer technique.


// In order to maximize the profit,
// we have to minimize the cost price and 
// maximize the selling price.So at every step,
// we will keep track of the minimum buy price of stock encountered so far.
// If the current price of stock is lower than the previous buy price,then we will update
//  the buy price,else if the current price of stock is greater than the previous buy price 
//  then we can sell at this price to get some profit.After iterating over the entire array,
//  return the maximum profit.

public class opt {
    public int count = 0;

    opt() {
        count = 0;
    }

    int max(int[] array) {
        count = 0;
        int maximum=0;
        int buyDay=0;
        for (int i = 0; i < array.length; i++) {
              count++;
             if(array[i]<=array[buyDay]){
                buyDay=i;
             }else if(array[i]-array[buyDay]>maximum){
                maximum=array[i]-array[buyDay];
             }
        }  
        return maximum;
    }
    

}
