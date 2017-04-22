package ua.kpi.tef.controller;

/**
 * Created by Віталій on 21.03.2017.
 */
interface RegexInfo {
     String REG_NAME = "^[A-Z]{1}[a-z'-]{1,}|[А-ЯІЄЇ]{1}[а-яієЇ'-]{1,}$";
     String REG_SURNAME = "^[A-Z]{1}[a-z-[A-Z]?']{1,}|[А-ЯІЄЇ]{1}[а-яієї-[А-Я]?']{1,}$";
     String REG_LASTNAME = "^[A-Z]{1}[a-z'-]{1,}|[А-ЯЄІЇ]{1}[а-яєії'-]{1,}$";
     String REG_BIRTHDAY = "(0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[012])\\.((19|20)\\d\\d)";
     String REG_PASSPORT = "^[A-Z]{2}[0-9]{6}$";
     String REG_NICKNAME = "^[a-z0-9_-]{3,15}$";
     String REG_PASSWORD = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%-_]).{6,20})";
     String REG_PHONENUMBER = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
     String REG_EMAIL = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
     String REG_INDEXPOST = "^[0-9]{5}$";
     String REG_CITY = "^[A-Z]{1}[a-z'-]{1,}|[А-ЯЄЇІ]{1}[а-яєїі'-]{1,}$";
     String REG_STREET = "^[A-Z]{1}[a-z'-]{1,}|[А-ЯЄЇІ]{1}[а-яєїі'-]{1,}$";
     String REG_HOUSE = "^[1-9]{1}|[1-9]?+[0-9/]{1,2}$";
     String REG_APPARTMENT = "^[1-9]{1}|[1-9]?+[0-9]{1,2}$";
     String REG_IP = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
}
