package com.yogesh.addressbook;
import java.sql.Struct;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ContactsModel {

    private String firstName;
    private String lastName;
    private String address ;
    private String city ;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String email ;

    Pattern pattern ;
    Matcher matcher ;
    public void setFirstName(String firstName){

             this.firstName = firstName;
    }


    public void setLastName(String lastName){

        this.lastName = lastName;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public  void setCity(String city)
    {

            this.city = city;
    }

    public  void setState(String state){

            this.state= state;

    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber ;
    }

    public void setEmail(String email){
        this.email = email ;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "ContactsModule{" +
                "fName='" + firstName + '\'' +
                ", lName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phoneNo='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
