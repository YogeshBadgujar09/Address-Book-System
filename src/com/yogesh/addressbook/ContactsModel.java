package com.yogesh.addressbook;
import java.util.Scanner;
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


    public String checkInput(String data , Scanner scanner)
    {
        Pattern pattern = Pattern.compile("^[A-Za-z]{3,}$");
        Matcher matcher = pattern.matcher(data);

        while(!matcher.matches())
        {
            System.out.println("Enter valid data [Minimum three Character].");
            data = scanner.next();
            matcher = pattern.matcher(data);
        }

        return data ;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setState(String state){
        this.state= state;
    }

    public void setZipCode(String zipCode ,Scanner scanner){

        Pattern pattern = Pattern.compile("^[0-6]{6}$");
        Matcher matcher = pattern.matcher(zipCode);

        while(!matcher.matches())
        {
            System.out.println("Please enter valid Zip Code[Enter 10 Digits]");
            zipCode = scanner.next();
            matcher = pattern.matcher(zipCode);
        }

    }

    public void setPhoneNumber(String phoneNumber , Scanner scanner){

        Pattern pattern = Pattern.compile("^[0-9]{10}$");
        Matcher matcher = pattern.matcher(phoneNumber);

        while(!matcher.matches())
        {
            System.out.println("Enter 6 Digits].");
            phoneNumber = scanner.next();
            matcher = pattern.matcher(phoneNumber);
        }
    }

    public void setEmail(String email , Scanner scanner){

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]+@" +  "[a-zA-Z0-9-]+" + "\\." + "[a-z" + "]{2,3}$");
        Matcher matcher = pattern.matcher(email);

        while(!matcher.matches())
        {
            System.out.println("Enter valid email id ");
            email = scanner.next();
            matcher = pattern.matcher(email);
        }

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
