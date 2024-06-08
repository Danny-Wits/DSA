package Array.q5;
// Kadane’s algorithm:
//Initialize:
//     max_so_far = INT_MIN
//     max_ending_here = 0

// Loop for each element of the array

//   (a) max_ending_here = max_ending_here + a[i]
//   (b) if(max_so_far < max_ending_here)
//             max_so_far = max_ending_here
//   (c) if(max_ending_here < 0)
//             max_ending_here = 0
// return max_so_far
public class opt {

    public static int count = 0;

    public static void test(int[] a) {
        // Function Call
        count=0;
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            count++;
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        System.out.println(max_so_far);
    }

}
