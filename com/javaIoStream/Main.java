package com.javaIoStream;

public class Main {
    public static void main(String[] args) {

        PersonDetails person = new PersonDetails();
        person.firstName("Sharad");
        person.lastName("Bhosale");
        person.Address("At post nashik");
        person.City("Nashik");
        person.State("Maharashtra");
        person.ZipCode(420000);
        person.PhoneNumber("7300000000");
        person.Email("sgb@gmail.com");
        System.out.println(person.toString());
    }
}