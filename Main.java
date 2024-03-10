package org.example;

public class Main {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.addNumber("Вася", 111111111);
        myPhoneBook.addNumber("Вася", 222222222);
        myPhoneBook.addNumber("Петя", 333333333);
        myPhoneBook.addNumber("Коля", 444444444);
        myPhoneBook.addNumber("Коля", 555555555);
        myPhoneBook.addNumber("Коля", 666666666);
        myPhoneBook.printAll();
        myPhoneBook.delNumber("Вася", 555555555);
        myPhoneBook.delContact("Вася");
        myPhoneBook.printAll();
        myPhoneBook.delContact("Вася");
        myPhoneBook.delNumber("Коля", 555555555);
        myPhoneBook.printAll();
        myPhoneBook.delNumber("Коля", 555555555);


    }
}