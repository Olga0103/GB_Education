package ru.gb.simle_actions_with_arrays.phonebook;

public class Main {

    public static void main(String[] args) {

        PhonebookApp pb = new PhonebookApp();

        pb.add("6666666", "Vader");
        pb.add("5555555", "Skywalker");
        pb.add("4444444", "Skywalker");
        pb.add("3333333", "Chewbacca");
        pb.add("2222222", "Solo");
        pb.add("1111111", "Organa");


        pb.get("Skywalker");
        pb.get("Vader");
    }
}
