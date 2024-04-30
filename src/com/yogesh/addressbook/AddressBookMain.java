package com.yogesh.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    ContactsModel contactsModel = new ContactsModel();
    Scanner scanner = new Scanner(System.in);

    public void createContact(){

        System.out.println("Enter First Name :");
        contactsModel.setFirstName(scanner.next());

        System.out.println("Enter Last Name :");
        contactsModel.setLastName(scanner.next());

        System.out.println("Enter Address :");
        contactsModel.setAddress(scanner.next());

        System.out.println("Enter City :");
        contactsModel.setCity(scanner.next());

        System.out.println("Enter State :");
        contactsModel.setState(scanner.next());

        System.out.println("Enter Zip code :");
        contactsModel.setZipCode(scanner.next());

        System.out.println("Enter Phone no. :");
        contactsModel.setPhoneNumber(scanner.next());

        System.out.println("Enter Email :");
        contactsModel.setEmail(scanner.next());

    }

    public void displayContact(){
        System.out.println(" " + contactsModel.toString());
    }

    public void editContact()
    {
        String fname;
        System.out.println("Enter first name to Edit :");
        fname = scanner.next();

        if(fname.equals(contactsModel.getFirstName()))
        {
            System.out.println("Contact Found.");

            System.out.println("Enter Last Name :");
            contactsModel.setLastName(scanner.next());

            System.out.println("Enter Address :");
            contactsModel.setAddress(scanner.next());

            System.out.println("Enter City :");
            contactsModel.setCity(scanner.next());

            System.out.println("Enter State :");
            contactsModel.setState(scanner.next());

            System.out.println("Enter Zip code :");
            contactsModel.setZipCode(scanner.next());

            System.out.println("Enter Phone no. :");
            contactsModel.setPhoneNumber(scanner.next());

            System.out.println("Enter Email :");
            contactsModel.setEmail(scanner.next());

        }
        else
        {
            System.out.println("Contact Not Found.");
        }
    }

    public void deleteContacts()
    {
        System.out.println("Contact is Delete.\n");
        contactsModel.setFirstName(null);
        contactsModel.setLastName(null);
        contactsModel.setAddress(null);
        contactsModel.setCity(null);
        contactsModel.setState(null);
        contactsModel.setZipCode(null);
        contactsModel.setPhoneNumber(null);
        contactsModel.setEmail(null);
    }




    public static void main(String[] args){

        System.out.println("Welcome To Address Book");

        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.createContact();
        addressBookMain.displayContact();
        addressBookMain.editContact();
        addressBookMain.deleteContacts();
        addressBookMain.displayContact();

    }
}
