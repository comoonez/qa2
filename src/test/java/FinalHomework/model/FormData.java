package FinalHomework.model;

public class FormData {

    private String name;
    private String surname;
    private String discount;
    private int personCount;
    private int childrenCount;
    private int luggageCount;
    private String flightDate;

    public String getPersonName() {
        return name;
    }

    public void setPersonName(String name) {
        this.name = name;
    }

    public String getPersonSurname() {
        return surname;
    }

    public void setPersonSurname(String surname) {
        this.surname = surname;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public int getAdultCount() {
        return personCount;
    }

    public void setAdultCount(int personCount) {
        this.personCount = personCount;
    }

    public int getChildrenCount() {
        return childrenCount;
    }

    public void setChildrenCount(int childrenCount) {
        this.childrenCount = childrenCount;
    }

    public int getLuggageCount() {
        return luggageCount;
    }

    public void setLuggageCount(int luggageCount) {
        this.luggageCount = luggageCount;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String date) {
        this.flightDate = date;
    }
}