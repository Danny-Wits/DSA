package Array.q1;
// Given an array A[] of n numbers and another number x, 

//the task is to check whether or not there exist two elements in A[] whose sum is exactly x. 

// Examples: 
public class test {
  
    public static void main(String[] args) {
        var D = new answerD();
        var U = new answerU();
        var O = new opt();
        int[] test1 = { 1, 4, 45, 6, 10, 8 };
        int sum1 = 16;
        int[] test2 = { 1, 2, 4, 3, 6 };
        int sum2 = 10;
        int[] test3 = { 1, 4, 5, 6, 10, 8 };
        int sum3 = 20;
        int[] test4 = { 1, -2, 1, 0, 5,1,3,4,4,4,4,4,4,4,4,4,4,5,5,6,6,7,7,78,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7 };
        int sum4 = 0;
      
        System.err.println("Danishwer");
        System.err.print(((D.check(test1, sum1)) ? "PASS" : "FAIL"));
        System.err.printf(" |  iterations : %d\n", D.count);
        System.err.print(((D.check(test2, sum2)) ? "PASS" : "FAIL"));
        System.err.printf(" |  iterations : %d\n", D.count);
        System.err.print(((!D.check(test3, sum3)) ? "PASS" : "FAIL"));
        System.err.printf(" |  iterations : %d\n", D.count);
        System.err.print(((!D.check(test4, sum4)) ? "PASS" : "FAIL"));
        System.err.printf(" |  iterations : %d\n", D.count);

        System.err.println("Umar");
        System.err.print(((U.check(test1, sum1)) ? "PASS" : "FAIL"));
        System.err.printf(" |  iterations : %d\n", U.count);
        System.err.print(((U.check(test2, sum2)) ? "PASS" : "FAIL"));
        System.err.printf(" |  iterations : %d\n", U.count);
        System.err.print(((!U.check(test3, sum3)) ? "PASS" : "FAIL"));
        System.err.printf(" |  iterations : %d\n", U.count);
        System.err.print(((!U.check(test4, sum4)) ? "PASS" : "FAIL"));
        System.err.printf(" |  iterations : %d\n", U.count);

        System.err.println("OPT");
        System.err.print(((O.check(test1, sum1)) ? "PASS" : "FAIL"));
        System.err.printf(" |  iterations : %d\n", O.count);
        System.err.print(((O.check(test2, sum2)) ? "PASS" : "FAIL"));
        System.err.printf(" |  iterations : %d\n", O.count);
        System.err.print(((!O.check(test3, sum3)) ? "PASS" : "FAIL"));
        System.err.printf(" |  iterations : %d\n", O.count);
        System.err.print(((!O.check(test4, sum4)) ? "PASS" : "FAIL"));
        System.err.printf(" |  iterations : %d\n", O.count);

    }
}
