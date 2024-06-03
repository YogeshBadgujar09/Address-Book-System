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
    public boolean setFirstName(String firstName){

        pattern = Pattern.compile("^[A-Za-z]{3,}$");
        matcher = pattern.matcher(firstName);

        if(matcher.matches())
        {
            this.firstName = firstName;
            return true ;
        }
        else {
            System.out.println("Please enter Minimum 3 character");
            return  false ;
        }

    }

    public  boolean setLastName(String lastName){


        pattern = Pattern.compile("^[A-Za-z]{3,}$");
        matcher = pattern.matcher(lastName);

        if(matcher.matches())
        {
            this.lastName = lastName;
            return true ;
        }
        else {
            System.out.println("Please enter Minimum 3 character");
            return false ;
        }



    }

    public boolean  setAddress(String address){

        pattern = Pattern.compile("^[A-Za-z]{3,}$");
        matcher = pattern.matcher(address);

        if(matcher.matches())
        {
            this.address = address;
            return true ;
        }
        else {
            System.out.println("Please enter Minimum 3 character");
            return false ;
        }

       // this.address = address ;
    }

    public boolean setCity(String city){

        pattern = Pattern.compile("^[A-Za-z]{3,}$");
        matcher = pattern.matcher(city);

        if(matcher.matches())
        {
            this.city = city;
            return  true  ;
        }
        else {
            System.out.println("Please enter Minimum 3 character");
            return false ;
        }

    }

    public boolean setState(String state){

        pattern = Pattern.compile("^[A-Za-z]{3,}$");
        matcher = pattern.matcher(state);

        if(matcher.matches())
        {
            this.state= state;
            return true;

        }
        else {
            System.out.println("Please enter Minimum 3 character");
            return  false;

        }

    }

    public boolean setZipCode(String zipCode){

        pattern = Pattern.compile("^[0-9]{6}$");
        matcher = pattern.matcher(zipCode);

        if(matcher.matches())
        {
            this.zipCode = zipCode;
            return true ;
        }
        else {
            System.out.println("Please enter Minimum 3 character");
            return false ;
        }


    }

    public boolean setPhoneNumber(String phoneNumber){

        pattern = Pattern.compile("^[0-9]{10}$");
        matcher = pattern.matcher(phoneNumber);

        if(matcher.matches())
        {
            this.phoneNumber = phoneNumber ;
            return true ;
        }
        else {
            System.out.println("Please enter Minimum 3 character");
            return false;
        }

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
