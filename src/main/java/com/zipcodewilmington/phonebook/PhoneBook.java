package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        Map<String, List<String>> map = new HashMap<>();
        this.phonebook = map;
    }

    public void add(String name, String phoneNumber) {
    List<String> number = new LinkedList<>();
    number.add(phoneNumber);
    phonebook.put(name, number);
    }

    public void addAll(String name, String... phoneNumbers) {
        List<String> number = new LinkedList<>(Arrays.asList(phoneNumbers));
        phonebook.put(name, number);
    }

    public void remove(String name) {
    }

    public Boolean hasEntry(String name) {
        return null;
    }

    public List<String> lookup(String name) {
        return null;
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}
