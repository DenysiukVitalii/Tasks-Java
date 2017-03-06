package ua.kpi.tef;

/**
 * Created by Віталій on 05.03.2017.
 */

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

        view.printMessage(view.ARRAY);
        view.printArray(model.getArr());

        if(model.howArray() == 1) view.printMessage(view.ALL_POSITIVE);
        if(model.howArray() == 2) view.printMessage(view.POSITIVE_NEGATIVE);
        if(model.howArray() == -1) view.printMessage(view.ALL_NEGATIVE);

    }

}
