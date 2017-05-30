package algorithms;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by brainovation on 5/29/17.
 */
public class PlusMinus {
    /**
     * Input Format:
     * <p>
     * The first line contains an integer,N, denoting the size of the array.
     * The second line contains N space-separated integers describing an array of numbers(a0,a1,a2...a_n-1) .
     * <p>
     * <p>
     * Output Format:
     * You must print the following  lines:
     * <p>
     * - A decimal representing of the fraction of positive numbers in the array compared to its size.
     * - A decimal representing of the fraction of negative numbers in the array compared to its size.
     * - A decimal representing of the fraction of zeroes in the array compared to its size.
     * <p>
     * Sample Input:
     * <p>
     * N = 6
     * Array of items:{ -4 3 -9 0 4 1}
     * <p>
     * Sample Output:
     * <p>
     * 0.500000
     * 0.333333
     * 0.166667
     * <p>
     * Explanation:
     * <p>
     * There are 3 positive numbers,2  negative numbers,1 and  zero in the array.
     * The respective fractions of positive numbers, negative numbers and zeroes are , 3/6 = 0.500000 ,
     * 2/6 = 0.333333 & 1/6 = 0.166667
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        float negativeCount = 0;
        float positiveCount = 0;
        float equalsCount = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] < 0) {
                negativeCount++;
            } else if (arr[i] == 0) {
                equalsCount++;
            } else {
                positiveCount++;
            }

        }
        System.out.println(positiveCount / n);
        System.out.println(negativeCount / n);
        System.out.println(equalsCount / n);
    }
}
