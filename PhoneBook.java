package org.example;

import java.util.*;

public class PhoneBook {
    private static Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void addNumber(String name, Integer phoneNum) {
        ArrayList<Integer> phone = new ArrayList<>();
        if (!phoneBook.containsKey(name)) {
            phone.add(phoneNum);
            phoneBook.put(name, phone);
        } else {
            phone = phoneBook.get(name);
            phone.add(phoneNum);
            phoneBook.put(name, phone);
        }
    }

    public void delNumber(String name, Integer phoneNum) {
        ArrayList<Integer> phone = new ArrayList<>();
        if (phoneBook.containsKey(name)) {
            phone = phoneBook.get(name);
            if (phone.contains(phoneNum)) {
                phone.remove(phoneNum);
                phoneBook.put(name, phone);
            } else {
                System.out.println("Телефона " + phoneNum + " нет у контакта " + name);
            }
        } else {
            System.out.println("Контакта " + name + " нет в телефонной книге");
        }
    }

    public void delContact(String name) {
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
        } else {
            System.out.println("Контакта " + name + " нет в телефонной книге");
        }
    }

    public void printAll() {
        Map<String, ArrayList<Integer>> tempPhoneBook = new HashMap<>(phoneBook);
        ArrayList<Integer> sortBook = new ArrayList<>();
        for (Map.Entry<String, ArrayList<Integer>> s : tempPhoneBook.entrySet()) {
            String maxName = s.getKey();
            for (Map.Entry<String, ArrayList<Integer>> entry : tempPhoneBook.entrySet()) {
                if (entry.getValue().size() > s.getValue().size()) {
                    maxName = entry.getKey();
                }
            }
            System.out.println(maxName + ": " + tempPhoneBook.get(maxName));
            tempPhoneBook.put(maxName, sortBook);
        }
    }
}