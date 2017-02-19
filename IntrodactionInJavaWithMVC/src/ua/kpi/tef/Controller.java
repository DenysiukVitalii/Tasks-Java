package ua.kpi.tef;

/**
 * Created by Віталій on 19.02.2017.
 */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Controller {
    // The Regex
    public static final String REGEX_NAME = "^[a-zA-Z]*$";

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

        model.setValue(inputNameWithScanner(sc));

        view.printNameAndHello(view.OUT_HELLO, model.getValue());
    }

    // The Utility methods
    public String inputNameWithScanner(Scanner sc) {
        view.printMessage(view.INPUT_NAME);
        while(! sc.hasNext(REGEX_NAME)) {
             view.printMessage(view.WRONG_INPUT_NAME + '\n' + view.INPUT_NAME);
          sc.next();
         }
        return sc.next();
    }

    public boolean checker(String check) {
        Pattern pt = Pattern.compile(REGEX_NAME);
        Matcher m = pt.matcher(check);
        return m.matches();
    }
}
