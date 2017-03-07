package ua.kpi.tef;

/**
 * Created by Віталій on 07.03.2017.
 */

public class View {
    public static final String USER_NUMBER = "\n\nGuess a number(from 1 to 100)\n> ";
    public static final String WRONG_INPUT_INT_DATA = "\nWrong data! ";

    // helpers and cong
    public static final String LOW_NUMBER = "Help: number is lower! Range:  ";
    public static final String UPPER_NUMBER = "Help: number is upper! Range: ";
    public static final String CONGRATULATIONS = "\nCongratulations! You guessed a number! ";

    // levels
    public static final String ROBOT = "\nYour level - robot! ";
    public static final String BOSS = "\nYour level - boss! ";
    public static final String MASTER = "\nYour level - master! ";
    public static final String STUDENT = "\nYour level - bachelor! ";
    public static final String PUPIL = "\nYour level - pupil! ";
    public static final String LOSER = "\nYour level - loser! ";

    // for summary
    public static final String SUMMARY = "\n\t\t  - Summary - ";
    public static final String GUESSED_NUMBER = "\nGuessed number: ";
    public static final String N_ATTEMPTS = "\nYour number of attempts = ";
    public static final String ATTEMPTS = "\nYour attempts: ";

    public void printMessage(String message){
        System.out.print(message);
    }
}
