package ua.kpi.tef.model.entity.inheritors;

import ua.kpi.tef.model.MessageForum;

/**
 * Created by Віталій on 18.04.2017.
 */
public class UserMessage extends MessageForum {

    protected int rating;

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
    public UserMessage(){
        super();
        rating = 0;
    }

    public UserMessage(String autor, String topic, String messageText, String dateRelease,
                       String timeRelease, String dateUpdate, String timeUpdate, int rating) {

        super(autor, topic, messageText, dateRelease, timeRelease, dateUpdate, timeUpdate);

        this.rating = rating;
    }

    @Override
    public UserMessage clone(){
        return (UserMessage) super.clone();
    }

    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null) return false;
        if (getClass() == object.getClass()) {

            UserMessage msg = (UserMessage)object;
            return this.autor == msg.autor && this.topic == msg.topic
                    && this.messageText == msg.messageText && this.dateRelease == msg.dateRelease
                    && this.timeRelease == msg.timeRelease && this.dateUpdate == msg.dateUpdate
                    && this.timeUpdate == msg.timeUpdate && this.rating == msg.rating;
        }
        else
            return false;
    }

    @Override
    public int hashCode(){
        int result = autor.hashCode();
        result = 31 * result + topic.hashCode();
        result = 31 * result + messageText.hashCode();
        result = 31 * result + dateRelease.hashCode();
        result = 31 * result + timeRelease.hashCode();
        result = 31 * result + dateUpdate.hashCode();
        result = 31 * result + timeUpdate.hashCode();
        result = 31 * result + (int)rating;
        return result;
    }

    @Override
    public String toString(){
        return getClass().getName() + "{\n" +
                "\tautor: " + autor + '\n' +
                "\ttopic: " + topic + '\n' +
                "\tmessageText: " + messageText + '\n' +
                "\tdateRelease: " + dateRelease + '\n' +
                "\ttimeRelease: " + timeRelease + '\n' +
                "\tdateUpdate: " + dateUpdate + '\n' +
                "\ttimeUpdate: " + timeUpdate + '\n' +
                "\trating: " + rating + '\n' +
                '}';
    }

}
