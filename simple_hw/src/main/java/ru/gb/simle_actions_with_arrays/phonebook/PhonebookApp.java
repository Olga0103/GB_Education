package ru.gb.simle_actions_with_arrays.phonebook;

import java.util.HashMap;
import java.util.HashSet;

public class PhonebookApp {

    HashMap<String, HashSet<String>> pb;

    public PhonebookApp() {
        this.pb = new HashMap<>();
    }

    public void add(String phone, String surname) {
        HashSet<String> insert = pb.getOrDefault(surname, new HashSet<>());
        insert.add(phone);
        pb.put(surname, insert);
    }

    public void get(String name) {
        System.out.println(name + " - " + pb.getOrDefault(name, new HashSet<>()));
    }
}