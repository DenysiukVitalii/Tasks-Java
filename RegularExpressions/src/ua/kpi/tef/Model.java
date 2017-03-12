package ua.kpi.tef;

/**
 * Created by Віталій on 12.03.2017.
 */
public class Model {
    private String name;
    private String surname;
    private String lastname;
    private String nickname;
    private String phone;
    private String email;
    private String address;
    private String indexPost;
    private String city;
    private String street;
    private String house;
    private String appartment;

    public String getName() {return name;}
    public String getSurname() {return surname;}
    public String getLastName() {return lastname;}

    public void setName(String value) {
        this.name = value;
    }
    public void setSurname(String value) {
        this.surname = value;
    }
    public void setLastName(String value) {
        this.lastname = value;
    }
    public void setNickname(String value) {
        this.nickname = value;
    }
    public void setPhone(String value) {
        this.phone = value;
    }
    public void setEmail(String value) {
        this.email = value;
    }
    public void setIndexPost(String value) {
        this.indexPost = value;
    }
    public void setCity(String value) {
        this.city = value;
    }
    public void setStreet(String value) {
        this.street = value;
    }
    public void setHouse(String value) {
        this.house = value;
    }
    public void setAppartment(String value) {
        this.appartment = value;
    }

}
