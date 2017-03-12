package ua.kpi.tef;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Віталій on 12.03.2017.
 */
public class Controller {

    public String regName = "^[A-ZА-Я]{1}[a-zа-я'-]{1,}$";
    public String regSurname = "^[A-ZА-Я]{1}[a-zа-я-[A-ZА-Я]?']{1,}+[a-zA-Zа-яА-Я']?$";
    public String regLastName = "^[A-ZА-Я]{1}[a-zа-я']{1,}$";
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
        model.setName(inputNameWithScanner(sc));
        model.setSurname(inputSurnameWithScanner(sc));
        model.setLastName(inputLastNameWithScanner(sc));
        view.printNameAndHello(view.OUT_HELLO, model.getName(), model.getLastName());
    }

    // The Utility methods

    public String inputNameWithScanner(Scanner sc) {
        view.printMessage(view.INPUT_NAME);
        String val = sc.next();
        while( !checker(val, regName) ) {
            view.printMessage(view.WRONG_INPUT_NAME + '\n' + view.INPUT_NAME);
            val = sc.next();
        }
        return val;
    }

    public String inputSurnameWithScanner(Scanner sc) {
        view.printMessage(view.INPUT_SURNAME);
        String val = sc.next();
        while( !checker(val, regSurname) ) {
            view.printMessage(view.WRONG_INPUT_NAME + '\n' + view.INPUT_SURNAME);
            val = sc.next();
        }
        return val;
    }

    public String inputLastNameWithScanner(Scanner sc) {
        view.printMessage(view.INPUT_LASTNAME);
        String val = sc.next();
        while( !checker(val, regLastName) ) {
            view.printMessage(view.WRONG_INPUT_NAME + '\n' + view.INPUT_LASTNAME);
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