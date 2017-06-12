package algorithms.warmup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by brainovation on 6/9/17.
 */
public class TimeConversion {

    static String timeConversion(String s) throws ParseException {
        // Complete this function
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
        Date date = parseFormat.parse(s);
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date));

        return displayFormat.format(date);

    }

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
