package algorithms.warmup;

import java.util.Scanner;

/**
 * Created by brainovation on 5/29/17.
 */
public class AVeryBigSum {
    /**
    You are given an array of integers of size N. You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.

    Input Format:
    The first line of the input consists of an integer N. The next line contains N space-separated integers contained in the array.

    Output Format
    Print a single value equal to the sum of the elements in the array.
    --------------------------------------------------------------------------------
     * Sample Input:
     * N = 5
     *ArrayOfElement: 1000000001 1000000002 1000000003 1000000004 1000000005
     *
     * Output :
     * 5000000015
     *
     */
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
