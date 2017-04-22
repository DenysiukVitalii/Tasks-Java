package ua.kpi.tef.model;

import ua.kpi.tef.model.entity.inheritors.UserMessage;

/**
 * Created by Віталій on 17.04.2017.
 */
public class Model {

    public UserMessage userMsg;

    public Model() {
        userMsg = new UserMessage();
    }

    public void setNewRecords(String autor, String topic, String messageText, String dateRelease,
                              String timeRelease, String dateUpdate, String timeUpdate, int rating) {
        userMsg.setAutor(autor);
        userMsg.setTopic(topic);
        userMsg.setMessageText(messageText);
        userMsg.setDateRelease(dateRelease);
        userMsg.setTimeRelease(timeRelease);
        userMsg.setDateUpdate(dateUpdate);
        userMsg.setTimeUpdate(timeUpdate);
        userMsg.setRating(rating);
    }

}
