package javasolutions;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String us = NumberFormat.getCurrencyInstance(new Locale("en", "US"))
                .format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN", "Rs."))
                .format(payment);
        String china = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"))
                .format(payment);
        String france = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"))
                .format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }

}
