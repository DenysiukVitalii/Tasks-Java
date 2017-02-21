package ua.kpi.tef;

/**
 * Created by Віталій on 19.02.2017.
 */
public class View {
    public static final String INPUT_NAME = "Input your name: ";
    public static final String WRONG_INPUT_NAME = "Wrong input! Repeat please! ";
    public static final String OUT_HELLO = "Hello, ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printNameAndHello(String message, String value){
        System.out.println(message + value);
    }
}
