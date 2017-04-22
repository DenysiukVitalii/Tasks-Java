package ua.kpi.tef.controller;

/**
 * Created by Віталій on 18.04.2017.
 */
public interface RegexInfo {
    String REG_TOPIC = "^[A-Z]{1}[a-z'-]{1,}|[А-ЯІЄЇ]{1}[а-яієЇ'-]{1,}$";
    String REG_DATE = "(0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[012])\\.((19|20)\\d\\d)";
    String REG_TIME = "[0-9]?[0-9]?\\:[0-9]?[0-9]?";
    String REG_MESSAGE = "^[A-Za-z\\ ]+$";
    String REG_NICKNAME = "^[a-z0-9_-]{3,15}$";
}
