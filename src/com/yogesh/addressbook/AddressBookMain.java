package com.yogesh.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    ContactsModule contactsModule = new ContactsModule();
    Scanner scanner = new Scanner(System.in);

    public void createContact(){

        System.out.println("Enter First Name :");
        contactsModule.setfName(scanner.next());

        System.out.println("Enter Last Name :");
        contactsModule.setlName(scanner.next());

        System.out.println("Enter Address :");
        contactsModule.setAddress(scanner.next());

        System.out.println("Enter City :");
        contactsModule.setCity(scanner.next());

        System.out.println("Enter State :");
        contactsModule.setState(scanner.next());

        System.out.println("Enter Zip code :");
        contactsModule.setZipCode(scanner.next());

        System.out.println("Enter Phone no. :");
        contactsModule.setPhoneNo(scanner.next());

        System.out.println("Enter Email :");
        contactsModule.setEmail(scanner.next());

    }

    void displayContact(){
        System.out.println(" " + contactsModule.toString());
    }

    public static void main(String[] args){

        System.out.println("Welcome To Address Book");

        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.createContact();
        addressBookMain.displayContact();

    }
}
