package ua.kpi.tef.controller;

import ua.kpi.tef.model.Model;
import ua.kpi.tef.view.View;

/**
 * Created by Віталій on 17.04.2017.
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }


    // The Work method
    public void processUser(){
        InputMessage inputMessage = new InputMessage();
        inputMessage.inputInfo();
        view.printMessage(model.userMsg.toString());
    }

}
