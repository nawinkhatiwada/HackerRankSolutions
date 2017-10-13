package thirtydaysofcodechallenge;

import java.util.Scanner;

public class Day_1_DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();
        double e = scan.nextDouble();
        scan.nextLine();
        String t = scan.nextLine();
        scan.close();
        System.out.println(String.valueOf(i + j));
        System.out.println(String.valueOf(d + e));
        System.out.println(s + t);
    }
}
