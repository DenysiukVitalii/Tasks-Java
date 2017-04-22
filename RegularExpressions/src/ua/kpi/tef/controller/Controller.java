package ua.kpi.tef.controller;

import ua.kpi.tef.model.Model;
import ua.kpi.tef.view.View;
import ua.kpi.tef.model.entity.NoteBook;
/**
 * Created by Віталій on 12.03.2017.
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
        InputNoteBook inputNotebook = new InputNoteBook();
        inputNotebook.inputInfo();

        NoteBook notebook = new NoteBook();
        view.printMessage(notebook.printSurnameAndName());
        view.printMessage(notebook.printAddress());
    }


}