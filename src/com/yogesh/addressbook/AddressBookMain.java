package com.yogesh.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    Scanner scanner = new Scanner(System.in);

    ArrayList<ContactsModel> contactsList = new ArrayList<>();
    public void contactOperation()
    {
        int choice ;

        System.out.println("******ADDRESS BOOK******");
        System.out.println("1.CREATE CONTACT 2.DISPLAY CONTACT 3.EXIT ");
         do{
             System.out.println("Enter Your Choice");
             choice = scanner.nextInt();

             switch(choice)
             {
                 case 1:
                     createContact();
                     break;

                 case 2:
                     displayContact();
                     break;

             }



         }while(choice < 3);
    }

    public void createContact(){

        ContactsModel contactsModel = new ContactsModel();

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

        contactsList.add(contactsModel);

    }

    public void displayContact()
    {

         for(int i=0 ; i<contactsList.size() ; i++)
         {
             ContactsModel contactsModel = contactsList.get(i);

             System.out.println(contactsModel.toString());

         }


    }

   /* public void editContact()
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


    */

    public static void main(String[] args){

        System.out.println("Welcome To Address Book");

        AddressBookMain addressBookMain = new AddressBookMain();

        addressBookMain.contactOperation();

    }
}
