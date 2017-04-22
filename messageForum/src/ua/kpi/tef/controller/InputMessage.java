package ua.kpi.tef.controller;

import ua.kpi.tef.model.Model;
import ua.kpi.tef.view.View;
import java.util.Scanner;

/**
 * Created by Віталій on 18.04.2017.
 */
public class InputMessage {
    View view;
    Model model;
    RegexInfo regInfo;
    UtilityController utility = new UtilityController();

    public void inputInfo() {

        model = new Model();
        Scanner sc = new Scanner(System.in);
        String inputAutor = utility.inputWithScanner(sc, regInfo.REG_NICKNAME, view.INPUT_AUTOR);
        String inputTopic = utility.inputWithScanner(sc, regInfo.REG_TOPIC, view.INPUT_TOPIC);
        String inputMessageText = utility.inputWithScanner(sc, regInfo.REG_MESSAGE, view.INPUT_MESSAGE);
        String inputDateRelease = utility.inputWithScanner(sc, regInfo.REG_DATE, view.INPUT_DATERELEASE);
        String inputTimeRelease= utility.inputWithScanner(sc, regInfo.REG_TIME, view.INPUT_TIMERELEASE);
        String inputDateUpdate = utility.inputWithScanner(sc, regInfo.REG_DATE, view.INPUT_DATEUPDATE);
        String inputTimeUpdate = utility.inputWithScanner(sc, regInfo.REG_TIME, view.INPUT_TIMEUPDATE);
        int inputRating = utility.inputIntValueWithScanner(sc, view.INPUT_RATING);

        model.setNewRecords(inputAutor, inputTopic, inputMessageText, inputDateRelease, inputTimeRelease,
                inputDateUpdate, inputTimeUpdate, inputRating);
    }
}
