package ua.kpi.tef;

/**
 * Created by Віталій on 07.03.2017.
 */

import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

public class Controller {
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
        int randNumber = model.rand();
        int UPPER = 100;
        int LOWER = 0;
        int countOfAttempts = 0;

        Stack attempts = new Stack();
        LinkedList<Integer> range = new LinkedList<>();

        // range [1, 100]
        range.addFirst(LOWER);
        range.addLast(UPPER);

        while(model.isCompare(randNumber, model.getValue()) != true) {
            model.setValue(inputIntValueWithScanner(sc));
            int result = model.lowerOrUpper(model.getValue(), randNumber);
            if (result == -1) {
                range.removeLast();
                range.addLast(model.getValue());
                view.printMessage(view.LOW_NUMBER + range);
            }
            if (result == 1) {
                range.removeFirst();
                range.addFirst(model.getValue());
                view.printMessage(view.UPPER_NUMBER + range);
            }

            countOfAttempts++;

            attempts.push(model.getValue());
        }

        view.printMessage(view.CONGRATULATIONS);
        view.printMessage(view.SUMMARY);
        view.printMessage(view.GUESSED_NUMBER + model.getValue());
        if (countOfAttempts == 1) view.printMessage(view.ROBOT);
        if (countOfAttempts > 1 && countOfAttempts <= 4) view.printMessage(view.BOSS);
        if (countOfAttempts > 4 && countOfAttempts < 8) view.printMessage(view.MASTER);
        if (countOfAttempts >= 8 && countOfAttempts < 12) view.printMessage(view.STUDENT);
        if (countOfAttempts >= 12 && countOfAttempts <= 20) view.printMessage(view.PUPIL);
        if (countOfAttempts > 20) view.printMessage(view.LOSER);
        view.printMessage(view.N_ATTEMPTS + countOfAttempts);
        view.printMessage(view.ATTEMPTS + attempts);
    }

    // The Utility methods
    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(view.USER_NUMBER);
        while( ! sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.USER_NUMBER);
            sc.next();
        }
        return sc.nextInt();
    }
}
