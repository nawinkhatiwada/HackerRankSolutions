package thirtydaysofcodechallenge;

import java.util.Scanner;

public class Day_0_HelloWorld {

    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();
        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");
        System.out.println(inputString);

        // TODO: Write a line of code here that prints the contents of inputString to stdout.
    }
}
