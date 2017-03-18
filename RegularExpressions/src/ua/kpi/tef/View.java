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
    public static final String INPUT_HOUSE = "Input your number of house: ";
    public static final String INPUT_APPARTMENT = "Input your number of appartment: ";
    public static final String INPUT_IP = "Input your ip-adress: ";
    public static final String INPUT_PASSWORD = "Input your password: ";
    public static final String INPUT_BIRTHDAY = "Input your birthday: ";
    public static final String INPUT_PASSPORT = "Input your passport: ";


    public static final String WRONG_INPUT = "Wrong input! Repeat please! ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printFullName(String name, String surname){
        String first = name.split("")[0];
        System.out.println(surname + " " + first + ".");
    }

    public void printAddress(String index, String city, String street, String house, String appartment){
        System.out.println(index + ", " + city + ", " + street + ", " + house + ", ap. " + appartment);
    }
}