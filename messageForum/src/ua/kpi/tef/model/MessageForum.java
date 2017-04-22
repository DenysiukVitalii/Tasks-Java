package ua.kpi.tef.model;

/**
 * Created by Віталій on 17.04.2017.
 */
public abstract class MessageForum implements Cloneable{
    protected String autor;
    protected String topic;
    protected String messageText;
    protected String dateRelease;
    protected String timeRelease;
    protected String dateUpdate;
    protected String timeUpdate;


    public MessageForum(){
        autor = "Someone";
        topic = "Topic";
        messageText = "";
        dateRelease = "01.01.2000";
        timeRelease = "00:00";
        dateUpdate = "01.01.2000";
        timeUpdate = "00:00";
    }

    public MessageForum(String autor, String topic, String messageText, String dateRelease, String timeRelease, String dateUpdate, String timeUpdate){
        this.autor = autor;
        this.topic = topic;
        this.messageText = messageText;
        this.dateRelease = dateRelease;
        this.timeRelease = timeRelease;
        this.dateUpdate = dateUpdate;
        this.timeUpdate = timeUpdate;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
    public void setDateRelease(String dateRelease) {
        this.dateRelease = dateRelease;
    }
    public void setTimeRelease(String timeRelease) {
        this.timeRelease = timeRelease;
    }
    public void setDateUpdate(String dateUpdate) {
        this.dateUpdate = dateUpdate;
    }
    public void setTimeUpdate(String timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public MessageForum clone(){
        try{
            return (MessageForum) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError("Cloning did not happen!");
        }
    }

    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null) return false;
        if (getClass() == object.getClass()) {

            MessageForum msg = (MessageForum) object;
            return this.autor == msg.autor && this.topic == msg.topic
                    && this.messageText == msg.messageText && this.dateRelease == msg.dateRelease
                    && this.timeRelease == msg.timeRelease && this.dateUpdate == msg.dateUpdate
                    && this.timeUpdate == msg.timeUpdate;
        }
        else
            return false;
    }

    @Override
    public int hashCode(){
        int result = autor.hashCode();
        result = 13 * result + topic.hashCode();
        result = 23 * result + messageText.hashCode();
        result = 31 * result + dateRelease.hashCode();
        result = 37 * result + timeRelease.hashCode();
        result = 31 * result + dateUpdate.hashCode();
        result = 23 * result + timeUpdate.hashCode();
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
                '}';
    }
}
