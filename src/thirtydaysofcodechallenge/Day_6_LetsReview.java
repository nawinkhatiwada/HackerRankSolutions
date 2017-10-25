package thirtydaysofcodechallenge;

import java.util.Scanner;

public class Day_6_LetsReview {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfInputs = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numOfInputs; i++) {
            String inputs = scanner.nextLine();
            StringBuilder evenPosItem = new StringBuilder();
            StringBuilder oddPosItem = new StringBuilder();

            for (int j = 0; j < inputs.length(); j++) {
                if (j % 2 == 0) {
                    evenPosItem.append(inputs.charAt(j));
                } else {
                    oddPosItem.append(inputs.charAt(j));
                }
            }
            System.out.println(evenPosItem + " " + oddPosItem);
        }
    }
}
