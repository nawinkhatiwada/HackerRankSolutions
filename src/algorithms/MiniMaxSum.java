package algorithms;

import java.util.Scanner;

/**
 * Created by brainovation on 6/2/17.
 */
public class MiniMaxSum {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        int sum = 0;
//        for (int i = 0; i < 5; i++) {
//            arr[i] = in.nextInt();
//            for (int j = 0; j < 4; j++) {
//                if (i == j) {
//                    j++;
//                } else {
//                    sum = sum + arr[j];
//                }
//            }
//        }
//        System.out.println(sum);

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

