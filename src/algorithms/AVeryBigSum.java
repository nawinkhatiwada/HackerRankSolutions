package algorithms;

import java.util.Scanner;

/**
 * Created by brainovation on 5/29/17.
 */
public class AVeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum = sum + arr[i];
        }
        System.out.print(String.valueOf(sum));
    }
}
