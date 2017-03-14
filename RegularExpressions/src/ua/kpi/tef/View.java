package ua.kpi.tef;

/**
 * Created by Віталій on 12.03.2017.
 */
public class View {
    public static final String INPUT_NAME = "Input your name: ";
    public static final String INPUT_SURNAME = "Input your surname: ";
    public static final String INPUT_LASTNAME = "Input your lastname: ";
    public static final String INPUT_NICKNAME = "Input your nickname: ";
    public static final String INPUT_PHONE = "Input your phone: ";
    public static final String INPUT_EMAIL = "Input your e-mail: ";
    public static final String INPUT_INDEXPOST = "Input your index-post: ";
    public static final String INPUT_CITY = "Input your city: ";
    public static final String INPUT_STREET = "Input your street: ";

    public static final String WRONG_INPUT = "Wrong input! Repeat please! ";
    public static final String OUT_HELLO = "Hello, ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printNameAndHello(String message, String value1){
        System.out.println(message + value1);
    }
    public void printFullName(String name, String surname){
        String first = name.split("")[0];
        System.out.println(surname + " " + first + ".");
    }

    public void printContactBook(String name, String surname){

    }
}