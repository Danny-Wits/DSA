package Array.q4;
// Given an array of n elements that contains elements from 0 to n-1,

//  with any of these numbers appearing any number of times. Find these repeating numbers in O(n) 
//  and use only constant memory space.

// Note: The repeating element should be printed only once.
class test {
    public static void main(String[] args) {
        var D = new answerD();
        var U = new answerU();
        var O = new opt();
        int[] test1 = {10, 3, 5, 6, 2};
        int[] test2 = {-1,1,0,-3,3};
        int[] test3 = { 3, 5, 1, 1, 3,4,3,3,1,5,1,1,3,1,1,2,3,4,3,2,1,1,12,3,12,3,3,2,3,2,1,1,1,1,1,1,0};
        int[] test4 = { 0,0, 3, 5, 0, 1, 3,4,3,3,1,5,1,1,3,1,1,2,3,4,3,2,1,1,1,12,3,12,3,3,2,3,2,0,0,0,0,0,0,0,0,1,1,1,1,1,1 };

        System.out.println("Danishwer");
        D.test(test1);
        System.out.printf(" | Size : %d  | iterations : %d\n",test1.length, D.count);
        D.test(test2);
        System.out.printf(" | Size : %d  | iterations : %d\n",test2.length, D.count);
        D.test(test3);
        System.out.printf(" | Size : %d  |  iterations : %d\n",test3.length, D.count);
        D.test(test4);
        System.out.printf(" | Size : %d  |  iterations : %d\n",test4.length, D.count);

        System.out.println("Umar");
        U.test(test1);
        System.out.printf(" | Size : %d  |    iterations : %d\n",test1.length, U.count);
        U.test(test2);
        System.out.printf(" | Size : %d  |   iterations : %d\n", test2.length,U.count);
        U.test(test3);
        System.out.printf(" | Size : %d  |   iterations : %d\n", test3.length,U.count);
        U.test(test4);
        System.out.printf(" | Size : %d  |     iterations : %d\n",test4.length, U.count);

        System.out.println("OPT");
        O.test(test1);
        System.out.printf(" | Size : %d  |    iterations : %d\n",test1.length, O.count);
        O.test(test2);
        System.out.printf(" | Size : %d  |   iterations : %d\n", test2.length,O.count);
        O.test(test3);
        System.out.printf(" | Size : %d  |   iterations : %d\n", test3.length,O.count);
        O.test(test4);
        System.out.printf(" | Size : %d  |     iterations : %d\n",test4.length, O.count);
    }
}
