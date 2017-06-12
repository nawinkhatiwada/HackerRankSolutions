package algorithms.warmup;

import java.util.Scanner;

/**
 * Created by brainovation on 6/2/17.
 */
public class MiniMaxSum {

    /**
     * Given five positive integers, find the minimum and maximum values that
     * can be calculated by summing exactly four of the five integers.
     * Then print the respective minimum and maximum values as a single line of
     * two space-separated long integers.
     *
     * Input Format:
     * A single line of five space-separated integers.
     *
     * Output Format:
     * Print two space-separated long integers denoting the respective
     * minimum and maximum values that can be calculated by summing exactly four of the
     * five integers. (The output can be greater than 32 bit integer.)
     * <p>
     * Sample Input:
     * 1 2 3 4 5
     *
     * Sample Output:
     * 10 14
     *
     * Explanation:
     *
     * Our initial numbers are 1,2,3,4, and 5.
     * We can calculate the following sums using four of the five integers:
     * <p>
     * If we sum everything except 1, our sum is 2 + 3 + 4 + 5 = 14.
     * If we sum everything except 2, our sum is 1 + 3 + 4 + 5 = 13.
     * If we sum everything except 3, our sum is 1 + 2 + 4 + 5 = 12.
     * If we sum everything except 4, our sum is 1 + 2 + 3 + 5 = 11.
     * If we sum everything except 5, our sum is 1 + 2 + 3 + 4 = 10.
     * As you can see, the minimal sum is 1 + 2 + 3 + 4 = 10  and the maximal
     * sum is 2 + 3 + 4 + 5 = 14. Thus, we print these minimal and maximal sums
     * as two space-separated integers on a new line.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long max, min, sum;
        sum = max = min = in.nextLong();
        for (int i = 1; i < 5; i++) {
            long temp = in.nextLong();
            sum += temp;
            if (max > temp) {
                if (min > temp) {
                    min = temp;
                }
            } else {
                max = temp;
            }
        }
        System.out.print((sum - max) + " " + (sum - min));
    }
}

