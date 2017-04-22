package ua.kpi.tef.model;



import ua.kpi.tef.model.entity.NoteBook;

public class Model {
    private NoteBook newRecord;

    public Model() {
        newRecord = new NoteBook();
    }

    public NoteBook getNewRecord() {
        return newRecord;
    }

    public void setNewRecords(String inputName, String inputSurname, String inputLastname, String inputBirthday, String inputPassport,
                              String inputPhone, String inputNickname, String inputPassword, String inputEmail, String inputIndex,
                              String inputCity, String inputStreet, String inputHouse, String inputAppartment, String inputIp) {
        newRecord.setName(inputName);
        newRecord.setSurname(inputSurname);
        newRecord.setLastName(inputLastname);
        newRecord.setNickname(inputNickname);
        newRecord.setBirthday(inputBirthday);
        newRecord.setPhone(inputPhone);
        newRecord.setEmail(inputEmail);
        newRecord.setIndexPost(inputIndex);
        newRecord.setCity(inputCity);
        newRecord.setStreet(inputStreet);
        newRecord.setHouse(inputHouse);
        newRecord.setAppartment(inputAppartment);
        newRecord.setPassword(inputPassword);
        newRecord.setPassport(inputPassport);
        newRecord.setIP(inputIp);
    }



}
