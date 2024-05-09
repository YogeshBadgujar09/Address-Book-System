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
        System.out.println("1.CREATE CONTACT 2.DISPLAY CONTACT 3.EDIT CONTACT 4.DELETE CONTACT");
         do{
             System.out.println("\nEnter Your Choice :");
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
                     break ;

                 case 4  :
                     deleteContacts();
                     break ;
             }



         }while(choice < 5);
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
        if(contactsList.isEmpty() == false){

            for(int i=0 ; i<contactsList.size() ; i++)
            {

                ContactsModel contactsModel = contactsList.get(i);

                System.out.println("\n" + contactsModel.toString());

            }
        }
        else {
            System.out.println("Contacts are not available In AddressBook");
        }

    }

    public void editContact()
    {
        String fname;
        System.out.println("Enter first name to Edit :");
        fname = scanner.next();

        ContactsModel contactsModel = null ;

        boolean flag = false ;

        for(int i=0 ; i<contactsList.size() ; i++){

            contactsModel = contactsList.get(i);

            if(fname.equals(contactsModel.getFirstName()))
            {
                flag = true;
                System.out.println("Given name is Found in Contact");

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
        }

        if(!flag)
        {
            System.out.println("Given name is Not Found in Contact");
        }
    }

   public void deleteContacts()
    {
        System.out.println("Enter First Name To Delete :");
        String fname = scanner.next();

        boolean flag = false ;

        for(int i=0 ; i<contactsList.size() ; i++)
        {
            ContactsModel contactsModel = contactsList.get(i);

            if(fname.equals(contactsModel.getFirstName()))
            {
                flag = true ;
                contactsList.remove(contactsModel);
                System.out.println("Contact is Delete");
            }

        }

        if(!flag){

            System.out.println("Contact Not found .");
        }
    }



    public static void main(String[] args){

        System.out.println("Welcome To Address Book");

        AddressBookMain addressBookMain = new AddressBookMain();

        addressBookMain.contactOperation();

    }
}
