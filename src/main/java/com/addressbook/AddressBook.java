package com.addressbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contacts> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public AddressBook(List<Contacts> contactsList) {
        list.addAll(contactsList);
    }


    public void add() {
        Contacts contact = new Contacts();
        System.out.println("Enter the First name:");
        String firstName = scan.next();
        contact.setFirstName(firstName);

        System.out.println("Enter the Last name:");
        String lastName = scan.next();
        contact.setLastName(lastName);

        System.out.println("Enter the address:");
        String address = scan.next();
        contact.setAddress(address);

        System.out.println("Enter the City:");
        String city = scan.next();
        contact.setCity(city);

        System.out.println("Enter the State:");
        String state = scan.next();
        contact.setState(state);

        System.out.println("Enter the Zip:");
        Long zip = scan.nextLong();
        contact.setZip(zip);

        System.out.println("Enter the Phone Number:");
        String phoneNumber = scan.next();
        contact.setPhoneNumber(phoneNumber);


        print();
    }

        public void print() {
            Iterator<Contacts> it = list.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());

        }
    }
}
