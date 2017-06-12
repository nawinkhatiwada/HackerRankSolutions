package algorithms.warmup;

import java.util.Scanner;

/**
 * Created by brainovation on 5/30/17.
 */
public class Staircase {
    /**
     * Sample input: n=6
     *
     * Sample output:
     *
     *       #
     *      ##
     *     ###
     *    ####
     *   #####
     *  ######
     *
     *
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if ((n - i) >= j)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println("");
        }
    }
}
