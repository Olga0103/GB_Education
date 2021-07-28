package ru.gb.preparing_for_interview.lession_1.task_1;

public class Main {

    public static void main(String[] args) {

        Actions actions = new Actions();

        PersonBuilder builder = new PersonBuilder();
        actions.addPerson(builder);

        Person person = builder.getResult();
        System.out.println(person.getResult());

//        System.out.println();
//        Person personBuilder = builder.getResult();
//        System.out.println("New person: \n" + personBuilder.getResult());
    }
}
