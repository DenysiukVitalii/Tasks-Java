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
        int counter = 0;

        Stack attempts = new Stack();
        LinkedList<Integer> range = new LinkedList<>();

        // range [1, 100]
        range.addFirst(1);
        range.addLast(100);

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

            counter++;

            attempts.push(model.getValue());
        }

        view.printMessage(view.CONGRATULATIONS);
        view.printMessage(view.SUMMARY);
        view.printMessage(view.GUESSED_NUMBER + model.getValue());
        if (counter == 1) view.printMessage(view.ROBOT);
        if (counter > 1 && counter <= 4) view.printMessage(view.BOSS);
        if (counter > 4 && counter < 8) view.printMessage(view.MASTER);
        if (counter >= 8 && counter < 12) view.printMessage(view.STUDENT);
        if (counter >= 12 && counter <= 20) view.printMessage(view.PUPIL);
        if (counter > 20) view.printMessage(view.LOSER);
        view.printMessage(view.N_ATTEMPTS + counter);
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
