package com.yogesh.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map   ;
import java.util.Scanner;

public class MultipleAddressBookMain {

    Scanner scanner = new Scanner(System.in);
    Map<String,AddressBook> multipleAddressBook = new HashMap<>();

    public void addressBookOperation()
    {
        int choice;
        System.out.println("**** ADDRESS BOOK ****");

        do{
            System.out.println("\n1.Add AddressBook \n2.Display AddressBook \n3.Select Address Book \n4.Delete Address Book \n5.Contact find By City Name");

            System.out.println("\nEnter Choice :");
            choice = scanner.nextInt();

            switch(choice)
            {
                case 1:
                    addAddressBook();
                    break;

                case 2 :
                    displayAddressBook();
                    break;

                case 3:
                    selectAddressBook();
                    break;

                case 4 :
                    deleteAddressBook();
                break;

                case 5 :
                    findContactByCity();
                    break;


            }

        }while(choice < 6 );
    }

    public void addAddressBook()
    {

        System.out.println("Enter Address Book Name :");
        String addressBookName = scanner.next();

        if(multipleAddressBook.containsKey(addressBookName))
        {
            System.out.println("Address Book Already Exist.");
        }
        else
        {
            multipleAddressBook.put(addressBookName , new AddressBook());
        }

    }
   // public void displayAddressBook()

     public void displayAddressBook()
     {
        System.out.println(multipleAddressBook.keySet());
        }

    public void selectAddressBook()
    {
        System.out.print("Available Address Book :");
        System.out.println(multipleAddressBook.keySet());

        System.out.println("Enter the Name of Address Book :");
        String addressBookName = scanner.next();

        if(multipleAddressBook.containsKey(addressBookName))
        {
            AddressBook addressBook = multipleAddressBook.get(addressBookName);
            addressBook.contactOperation();

        }else {
            System.out.println("Address Book Not Found.");
        }
    }

    public void deleteAddressBook()
    {
        System.out.print("Enter Address Book to Delete :");
        String addressBookName = scanner.next();

        if(multipleAddressBook.containsKey(addressBookName))
        {
            multipleAddressBook.remove(addressBookName);
        }
        else {
            System.out.println("Address Book Not Found ");
        }
    }

    void findContactByCity() {

        System.out.println("Enter city Name :");
        String city = scanner.next();

        boolean flag = false ;

        for (String addressBookName : multipleAddressBook.keySet()) {

            System.out.println("Address Book Name :" + addressBookName);
            AddressBook addressBook = multipleAddressBook.get(addressBookName);

           for(int i=0; i<addressBook.contactsList.size(); i++)
            {
                ContactsModel contactsModel = addressBook.contactsList.get(i);
                if(city.equalsIgnoreCase(contactsModel.getCity())) {
                    System.out.println(contactsModel.toString());
                    flag = true ;
                }
            }
            if(!flag)
            {
                System.out.println("Enter Valid City Name ");
            }

        }
    }

    public static void main(String[] args) {

        MultipleAddressBookMain multipleAddressBookMain = new MultipleAddressBookMain();
        multipleAddressBookMain.addressBookOperation();
    }
}
