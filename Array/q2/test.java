package Array.q2;
// Given an array prices[] of length N, representing the prices of the stocks on different days,

// the task is to find the maximum profit possible by buying and selling the stocks on different days when at
// most one transaction is allowed.

// Note: Stock must be bought before being sold.

// Input: prices[] = {7, 1, 5, 3, 6, 4}
// Output: 5
// Explanation:
// The lowest price of the stock is on the 2nd day, i.e. price = 1. Starting from the 2nd day,
//  the highest price of the stock is witnessed on the 5th day, i.e. price = 6. 
public class test {

    public static void main(String[] args) {
        var D = new answerD();
        var U = new answerU();
        var O = new opt();
        int[] test1 = { 7, 1, 5, 3, 6, 4 ,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
        int[] test2 = { 7, 6, 4, 3, 1 };
        int[] test3 = {2, 4, 1, 4, 3, 7};
        int[] test4 ={3, 3, 5, 0, 0, 3, 1};

        System.out.println("Danishwer");
        System.out.print(((D.max(test1) == 5) ? "PASS" : "FAIL"));
        System.out.printf(" |  iterations : %d\n", D.count);
        System.out.print(((D.max(test2) == 0) ? "PASS" : "FAIL"));
        System.out.printf(" |  iterations : %d\n", D.count);
        System.out.print((D.max(test3) ==6)? "PASS" : "FAIL");
        System.out.printf(" | iterations : %d\n", D.count);
        System.out.print((D.max(test4)==3) ? "PASS" : "FAIL");
        System.out.printf(" | iterations : %d\n", D.count);

        System.out.println("Umar");
        System.out.print(((U.max(test1) == 5) ? "PASS" : "FAIL"));
        System.out.printf(" |  iterations : %d\n", U.count);
        System.out.print(((U.max(test2) == 0) ? "PASS" : "FAIL"));
        System.out.printf(" |  iterations : %d\n", U.count);
        System.out.print((U.max(test3) ==6)? "PASS" : "FAIL");
        System.out.printf(" | iterations : %d\n", U.count);
        System.out.print((U.max(test4)==3) ? "PASS" : "FAIL");
        System.out.printf(" | iterations : %d\n", U.count);

        System.out.println("OPT");
        System.out.print(((O.max(test1) == 5) ? "PASS" : "FAIL"));
        System.out.printf(" |  iterations : %d\n", O.count);
        System.out.print(((O.max(test2) == 0) ? "PASS" : "FAIL"));
        System.out.printf(" |  iterations : %d\n", O.count);
        System.out.print((O.max(test3) ==6)? "PASS" : "FAIL");
        System.out.printf(" | iterations : %d\n", O.count);
        System.out.print((O.max(test4)==3) ? "PASS" : "FAIL");
        System.out.printf(" | iterations : %d\n", O.count);
    }
}
