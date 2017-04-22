package ua.kpi.tef.controller;

import ua.kpi.tef.view.View;
import ua.kpi.tef.model.Model;

/**
 * Created by Віталій on 21.03.2017.
 */

import java.util.Scanner;

public class InputNoteBook{
    View view;
    Model model;
    RegexInfo regInfo;
    UtilityController utility = new UtilityController();

    public void inputInfo() {

        Scanner sc = new Scanner(System.in);
        String inputName = utility.inputWithScanner(sc, regInfo.REG_NAME, view.INPUT_NAME);
        String inputSurname = utility.inputWithScanner(sc, regInfo.REG_SURNAME, view.INPUT_SURNAME);
        String inputLastname = utility.inputWithScanner(sc, regInfo.REG_LASTNAME, view.INPUT_LASTNAME);
        String inputBirthday = utility.inputWithScanner(sc, regInfo.REG_BIRTHDAY, view.INPUT_BIRTHDAY);
        String inputPassport = utility.inputWithScanner(sc, regInfo.REG_PASSPORT, view.INPUT_PASSPORT);
        String inputPhone = utility.inputWithScanner(sc, regInfo.REG_PHONENUMBER, view.INPUT_PHONE);
        String inputNickname = utility.inputWithScanner(sc, regInfo.REG_NICKNAME, view.INPUT_NICKNAME);
        String inputPassword = utility.inputWithScanner(sc, regInfo.REG_PASSWORD, view.INPUT_PASSWORD);
        String inputEmail = utility.inputWithScanner(sc, regInfo.REG_EMAIL, view.INPUT_EMAIL);
        String inputIndex = utility.inputWithScanner(sc, regInfo.REG_INDEXPOST, view.INPUT_INDEXPOST);
        String inputCity = utility.inputWithScanner(sc, regInfo.REG_CITY, view.INPUT_CITY);
        String inputStreet = utility.inputWithScanner(sc, regInfo.REG_STREET, view.INPUT_STREET);
        String inputHouse = utility.inputWithScanner(sc, regInfo.REG_HOUSE, view.INPUT_HOUSE);
        String inputAppartment = utility.inputWithScanner(sc, regInfo.REG_APPARTMENT, view.INPUT_APPARTMENT);
        String inputIP = utility.inputWithScanner(sc, regInfo.REG_IP, view.INPUT_IP);

        model.setNewRecords(inputName, inputSurname, inputLastname, inputBirthday, inputPassport,
                inputPhone, inputNickname, inputPassword, inputEmail, inputIndex,
                inputCity, inputStreet, inputHouse, inputAppartment,
                inputIP
        );
    }
}
