package ua.kpi.tef;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Віталій on 12.03.2017.
 */
public class Controller {

    public String REG_NAME = "^[A-ZА-Я]{1}[a-zа-я'-]{1,}$";
    public String REG_SURNAME = "^[A-ZА-Я]{1}[a-zа-я-[A-ZА-Я]?']{1,}+[a-zA-Zа-яА-Я']?$";
    public String REG_LASTNAME = "^[A-ZА-Я]{1}[a-zа-я']{1,}$";
    public String REG_NICKNAME = "^[a-z0-9_-]{3,15}$";
    public String REG_PHONENUMBER = "^\\(([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
    public String REG_EMAIL = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    public String REG_INDEXPOST = "^[0-9]{5}$";
    public String REG_CITY = "^[A-ZА-Я]{1}[a-zа-я'-]{1,}$";

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
        model.setName(inputWithScanner(sc, REG_NAME, view.INPUT_NAME));
        model.setSurname(inputWithScanner(sc, REG_SURNAME, view.INPUT_SURNAME));
        model.setLastName(inputWithScanner(sc, REG_LASTNAME, view.INPUT_LASTNAME));
        model.setNickname(inputWithScanner(sc, REG_NICKNAME, view.INPUT_NICKNAME));
        model.setPhone(inputWithScanner(sc, REG_PHONENUMBER, view.INPUT_PHONE));
        model.setEmail(inputWithScanner(sc, REG_EMAIL, view.INPUT_EMAIL));
        model.setIndexPost(inputWithScanner(sc, REG_INDEXPOST, view.INPUT_INDEXPOST));
        model.setCity(inputWithScanner(sc, REG_CITY, view.INPUT_CITY));


        view.printFullName(model.getName(), model.getSurname());
        view.printNameAndHello(view.OUT_HELLO, model.getPhone());
    }

    // The Utility methods

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