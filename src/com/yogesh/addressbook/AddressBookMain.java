package com.yogesh.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    Scanner scanner = new Scanner(System.in);

    ArrayList<ContactsModel> contactsList = new ArrayList<>();
    public void contactOperation()
    {
        int choice ;

        System.out.println("\n******ADDRESS BOOK******");
        System.out.println("1.CREATE CONTACT \n2.DISPLAY CONTACT \n3.EDIT CONTACT \n4.DELETE CONTACT");
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

                 /*case 3:
                     editContact();
                     break ;

                 case 4  :
                     deleteContacts();
                     break ;*/
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
            if(checkContact()) {
                for (int i = 0; i < contactsList.size(); i++) {

                    ContactsModel contactsModel = contactsList.get(i);

                    System.out.println("\n" + contactsModel.toString());

                }
            }


    }

    public boolean checkContact()
    {
         if(!contactsList.isEmpty())
         {
             System.out.println("Contacts Available");
             System.out.println("Enter First Name To Delete :");
             String fname = scanner.next();

             boolean flag = false ;

             for(int i=0 ; i<contactsList.size() ; i++)
             {
                 ContactsModel contactsModel = contactsList.get(i);

                 if(fname.equals(contactsModel.getFirstName()))
                 {
                     flag = true ;
                 }

             }

             return true ;
         }
         else
         {
             System.out.println("Contacts are not available in Address Book");
             contactOperation();
             return false ;
         }
    }



  /*  public void editContact()
    {

        if(!contactsList.isEmpty())
        {

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
        else
        {
            System.out.println("Contacts are not available In AddressBook");
        }



    }
*/

   public void deleteContacts(ContactsModel contactsModel)
   {
        contactsList.remove(contactsModel);
   }



    public static void main(String[] args){

        System.out.println("Welcome To Address Book");

        AddressBookMain addressBookMain = new AddressBookMain();

        addressBookMain.contactOperation();

    }
}
