package algorithms.warmup;

import java.util.Scanner;

/**
 * Created by brainovation on 6/9/17.
 */
public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int n, int[] ar) {
        int max = ar[0];
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            int item = ar[i];
            if (max < item) {
                max = item;
                count = 1;
            } else if (max == item) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
