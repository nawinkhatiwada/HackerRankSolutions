package thirtydaysofcodechallenge;

import java.util.Scanner;

public class Day_3_IntroductionToConditionalStatements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans;
        if (n % 2 == 0 && ((n >= 2 && n <= 5) || n > 20)) {
            ans = "Not Weird";
        } else {
            ans = "Weird";
        }

        System.out.println(ans);
    }
}
