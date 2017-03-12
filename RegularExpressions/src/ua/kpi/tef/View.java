package ua.kpi.tef;

/**
 * Created by Віталій on 12.03.2017.
 */
public class View {
    public static final String INPUT_NAME = "Input your name: ";
    public static final String INPUT_SURNAME = "Input your surname: ";
    public static final String INPUT_LASTNAME = "Input your lastname: ";
    public static final String WRONG_INPUT_NAME = "Wrong input! Repeat please! ";
    public static final String OUT_HELLO = "Hello, ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printNameAndHello(String message, String value1, String value2){
        System.out.println(message + value1 + " " + value2);
    }
}