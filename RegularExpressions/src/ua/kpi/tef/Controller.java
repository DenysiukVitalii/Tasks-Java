package ua.kpi.tef;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Віталій on 12.03.2017.
 */
public class Controller {

    public String REG_NAME = "^[A-Z]{1}[a-z'-]{1,}|[А-Я]{1}[а-я'-]{1,}$";
    public String REG_SURNAME = "^[A-Z]{1}[a-z-[A-Z]?']{1,}|[А-Я]{1}[а-я-[А-Я]?']{1,}$";
    public String REG_LASTNAME = "^[A-Z]{1}[a-z'-]{1,}|[А-Я]{1}[а-я'-]{1,}$";
    public String REG_BIRTHDAY = "(0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[012])\\.((19|20)\\d\\d)";
    public String REG_PASSPORT = "^[A-Z]{2}[0-9]{6}$";
    public String REG_NICKNAME = "^[a-z0-9_-]{3,15}$";
    public String REG_PASSWORD = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%-_]).{6,20})";
    public String REG_PHONENUMBER = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
    public String REG_EMAIL = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
    public String REG_INDEXPOST = "^[0-9]{5}$";
    public String REG_CITY = "^[A-Z]{1}[a-z'-]{1,}|[А-Я]{1}[а-я'-]{1,}$";
    public String REG_STREET = "^[A-Z]{1}[a-z'-]{1,}|[А-Я]{1}[а-я'-]{1,}$";
    public String REG_HOUSE = "^[1-9]{1}|[1-9]?+[0-9/]{1,2}$";
    public String REG_APPARTMENT = "^[1-9]{1}|[1-9]?+[0-9]{1,2}$";
    public String REG_IP = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

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
        model.setBirthday(inputWithScanner(sc, REG_BIRTHDAY, view.INPUT_BIRTHDAY));
        model.setPassport(inputWithScanner(sc, REG_PASSPORT, view.INPUT_PASSPORT));
        model.setPhone(inputWithScanner(sc, REG_PHONENUMBER, view.INPUT_PHONE));
        model.setNickname(inputWithScanner(sc, REG_NICKNAME, view.INPUT_NICKNAME));
        model.setPassword(inputWithScanner(sc, REG_PASSWORD, view.INPUT_PASSWORD));
        model.setEmail(inputWithScanner(sc, REG_EMAIL, view.INPUT_EMAIL));
        model.setIndexPost(inputWithScanner(sc, REG_INDEXPOST, view.INPUT_INDEXPOST));
        model.setCity(inputWithScanner(sc, REG_CITY, view.INPUT_CITY));
        model.setStreet(inputWithScanner(sc, REG_STREET, view.INPUT_STREET));
        model.setHouse(inputWithScanner(sc, REG_HOUSE, view.INPUT_HOUSE));
        model.setAppartment(inputWithScanner(sc, REG_APPARTMENT, view.INPUT_APPARTMENT));
        model.setIP(inputWithScanner(sc, REG_IP, view.INPUT_IP));

        view.printFullName(model.getName(), model.getSurname());
        view.printAddress(model.getIndexPost(), model.getCity(), model.getStreet(), model.getHouse(), model.getAppartment());
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