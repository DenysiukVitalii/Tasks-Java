package ua.kpi.tef.controller;


import ua.kpi.tef.view.View;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Віталій on 28.03.2017.
 */
public class UtilityController {
    // The Utility methods
    View view;

    public String inputWithScanner(Scanner sc, String reg, String output) {
        view.printMessage(output);
        String val = sc.next();
        while( !checker(val, reg) ) {
            view.printMessage(view.WRONG_INPUT + '\n' + output);
            val = sc.next();
        }
        return val;
    }

    public boolean checker(String check, String reg) {
        Pattern pt = Pattern.compile(reg);
        Matcher m = pt.matcher(check);
        return m.matches();
    }
}
