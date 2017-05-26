package algorithms;

import java.util.Scanner;

/**
 * Created by brainovation on 5/26/17.
 */
public class CompareTheTriplet {
    /*
        sample input :
        {a0,a1,a2} = 5 6 7
        {b0,b1,b2} = 3 6 10

        sample output : {1,1}
     */
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        // Complete this function
        int arrA[] = {a0, a1, a2};
        int arrB[] = {b0, b1, b2};
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < 3; i++) {
            if (arrA[i] > arrB[i]) {
                sumA = sumA + 1;
            } else if (arrB[i] > arrA[i]) {
                sumB = sumB + 1;
            }
        }
        return new int[]{sumA, sumB};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
