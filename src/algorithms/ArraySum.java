package algorithms;

import java.util.Scanner;

/**
 * Created by brainovation on 5/24/17.
 */
public class ArraySum {
    public static void main(String[] args) {
//      /*
//      sample input:
//         n =  6
//         array = 1 2 3 4 10 11
//
//      sample output:
//        sum of array element
//      */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum = sum + arr[i];
        }
        System.out.println(sum);

//        Scanner scanner = new Scanner(System.in);
//        num(scanner.nextInt());
    }



//    public static void num(int num) {
//        try {
//            int test = 1 / num;
//            System.out.print(num);
//            num(num - 1);
//        } catch (ArithmeticException e) {
//            return;
//        }
//    }

}
