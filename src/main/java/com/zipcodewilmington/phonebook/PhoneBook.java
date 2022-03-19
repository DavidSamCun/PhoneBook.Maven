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
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name, String number) {
        return phonebook.containsKey(name);
    }

    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }


    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        List<String> contact = new LinkedList<>();

        boolean match = false;
        String output = "";
        Iterator<Map.Entry<String, List<String>>> itr = phonebook.entrySet().iterator();
        while(itr.hasNext() && !match){
            Map.Entry<String, List<String>> entry = itr.next();
            if(entry.getValue().contains(phoneNumber)){
                output = entry.getKey();
                match = true;
            }
        }

        return output;
    }

    public List<String> getAllContactNames() {      //Works but out of order
        List<String> number = new LinkedList<>();
        for(String name : phonebook.keySet()){
            number.add(name);
        }
        return number;

//        List<String> number = new ArrayList<>();
//        for(String name : phonebook.keySet()){
//            number.add(name);
//        }
//        return number;

    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}
