package Array.q5;

import java.util.Arrays;
class test {
    public static void main(String[] args) {

        int[] test1 = { 10, 3, 5, 6, 2 };
        int[] test2 = { -1, 1, 0, -3, 3 };
        int[] test3 = new int[20];
        Arrays.fill(test3, 2);
        int[] test4 = { 0, 0, 3, 5, 0, 1, 3, 4, 3, 3, 1, 5, 1, 1, 3, 1, 1, 2, 3, 4, 3, 2, 1, 1, 1, 12, 3, 12, 3, 3, 2,
                3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1 };

        System.out.println("Danishwer");
        answerD.test(test1);
        System.out.printf(" | Size : %d  | iterations : %d\n", test1.length, answerD.count);
        answerD.test(test2);
        System.out.printf(" | Size : %d  | iterations : %d\n", test2.length, answerD.count);
        answerD.test(test3);
        System.out.printf(" | Size : %d  |  iterations : %d\n", test3.length, answerD.count);
        answerD.test(test4);
        System.out.printf(" | Size : %d  |  iterations : %d\n", test4.length, answerD.count);

        System.out.println("Umar");
        answerU.test(test1);
        System.out.printf(" | Size : %d  |    iterations : %d\n", test1.length, answerU.count);
        answerU.test(test2);
        System.out.printf(" | Size : %d  |   iterations : %d\n", test2.length, answerU.count);
        answerU.test(test3);
        System.out.printf(" | Size : %d  |   iterations : %d\n", test3.length, answerU.count);
        answerU.test(test4);
        System.out.printf(" | Size : %d  |     iterations : %d\n", test4.length, answerU.count);

        System.out.println("OPT");
        opt.test(test1);
        System.out.printf(" | Size : %d  |    iterations : %d\n", test1.length, opt.count);
        opt.test(test2);
        System.out.printf(" | Size : %d  |   iterations : %d\n", test2.length, opt.count);
        opt.test(test3);
        System.out.printf(" | Size : %d  |   iterations : %d\n", test3.length, opt.count);
        opt.test(test4);
        System.out.printf(" | Size : %d  |     iterations : %d\n", test4.length, opt.count);
    }
}
