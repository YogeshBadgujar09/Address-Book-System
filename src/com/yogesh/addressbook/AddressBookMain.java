package com.yogesh.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    ContactsModel contactsModel = new ContactsModel();
    Scanner scanner = new Scanner(System.in);

    public void contactOperation()
    {
        while(true)
        {

            int choice ;

            System.out.println("\n1.Create Contact\n2.Display Contact\n3.Edit Contact\n4.Delete Contact\n5.EXIT");
            System.out.println("Enter Choice :");
            choice = scanner.nextInt();

            switch(choice)
            {
                case 1:
                    createContact();
                    break;

                case 2:
                    displayContact();
                    break;

                case 3:
                    editContact();
                    break;

                case 4:
                    deleteContacts();
                    break;
            }

            if(choice == 5)
            {
                System.out.println("EXIT");
                break;
            }

        }




    }

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
        System.out.println("Enter First Name To Delete :");
        String fname = scanner.next();

        if(fname.equals(contactsModel.getFirstName()))
        {
            contactsModel = null ;
            System.out.println("Contact is Delete");
        }
        else{
            System.out.println("Contact is not found .");
        }
    }




    public static void main(String[] args){

        System.out.println("Welcome To Address Book");

        AddressBookMain addressBookMain = new AddressBookMain();

        addressBookMain.contactOperation();

    }
}
