package com.yogesh.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);

    ArrayList<ContactsModel> contactsList = new ArrayList<>();
    public void contactOperation()
    {
        int choice ;
        System.out.println("\nContact Maintain in Address Book");
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
        if(contactsModel.setFirstName(scanner.next()))
        {
            System.out.println("Enter Last Name :");
            if(contactsModel.setLastName(scanner.next()))
            {
                System.out.println("Enter Address :");
                if(contactsModel.setAddress(scanner.next()))
                {
                    System.out.println("Enter City :");
                    if(contactsModel.setCity(scanner.next()))
                    {
                        System.out.println("Enter State :");
                        if(contactsModel.setState(scanner.next()))
                        {
                            System.out.println("Enter Zip code :");
                            if(contactsModel.setZipCode(scanner.next()))
                            {
                                System.out.println("Enter Phone no. :");
                                if(contactsModel.setPhoneNumber(scanner.next()))
                                {
                                    System.out.println("Enter Email :");
                                    contactsModel.setEmail(scanner.next());

                                    contactsList.add(contactsModel);

                                }
                            }



                        }


                    }


                }

            }


        }



    }


    /**
     * this function is create to display a contacts of AddressBokk
     */
    public void displayContact()
    {
            if(!contactsList.isEmpty()) {
                for (int i = 0; i < contactsList.size(); i++) {

                    ContactsModel contactsModel = contactsList.get(i);

                    System.out.println("\n" + contactsModel.toString());

                }
            }
            else {
                System.out.println("Contact not found on Address Book");
            }


    }

    /**
     * this function create for code optimization, it is use in deleteConatacts() & editContactss()
     *
     * @return - this statement return objects field value, if condition true it return values otherwise it give null
     */
    public ContactsModel checkContactExist()
    {
         if(!contactsList.isEmpty()) {
             System.out.println("Enter First Name :");
             String fname = scanner.next();

             boolean flag = false;

             ContactsModel contactsModel = null;
             for (int i = 0; i < contactsList.size(); i++) {
                 contactsModel = contactsList.get(i);

                 if (fname.equals(contactsModel.getFirstName())) {
                     flag = true;
                     break ;
                 }

             }
             if(!flag){
                 System.out.println("Contact Not Found in Address Book");
                 return null ;
             }

             return contactsModel;
         }

        else {
             System.out.println("Contact List is Empty");
             return null;
         }
    }



   public void editContact()
    {
        ContactsModel contactsModel = checkContactExist() ;

        if(contactsModel != null)
        {
//            System.out.println("Given name Found in AddressBook");

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


    /**
     * this function is create for delete a contact from AddressBookMain Class
     *
     */
   public void deleteContacts( )
   {
        ContactsModel contactsModel = checkContactExist();

        if(contactsModel != null) {

            contactsList.remove(contactsModel);
            System.out.println("Contact is Delete SuccessFully");
        }

   }
}
