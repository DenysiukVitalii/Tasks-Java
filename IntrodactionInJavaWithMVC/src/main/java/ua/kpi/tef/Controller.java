package ua.kpi.tef;

/**
 * Created by Віталій on 19.02.2017.
 */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Controller {
    // The Regex
    public static final String REG_NAME = "^[A-ZА-Я]{1}[a-zа-я'-]{1,}$";

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setValue(inputNameWithScanner(sc,REG_NAME));

        view.printNameAndHello(view.OUT_HELLO, model.getValue());
    }

    // The Utility methods
    public String inputNameWithScanner(Scanner sc, String reg) {
        view.printMessage(view.INPUT_NAME);
        String val = sc.next();
        while( !checker(val, reg) ) {
             view.printMessage(view.WRONG_INPUT_NAME + '\n' + view.INPUT_NAME);
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
