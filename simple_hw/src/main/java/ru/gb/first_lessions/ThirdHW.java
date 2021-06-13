package ru.gb.first_lessions;

public class ThirdHW {

    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Luke Skywalker", "jedi", "luke@starwars.com", "7355555", 10000, 35);
        empArray[1] = new Employee("Darth Vader", "Sith lord", "darth@starwars.com", "7351111", 50000, 45);
        empArray[2] = new Employee("Han Solo", "pilot", "han@starwars.com", "7352222", 20000, 46);
        empArray[3] = new Employee("Chewbacca Chewie", "mechanic", "chewbacca@starwars.com", "7353333", 13000, 38);
        empArray[4] = new Employee("Leia Organa", "Princess of Alderaan", "leia@starwars.com", "7354444", 50000, 32);

        for (int i = 0; i < empArray.length; i++) {
            if(empArray[i].age > 40){
                empArray[i].resume();
            }
        }
    }

    private static class Employee {

        String name;
        String function;
        String email;
        String phone;
        int salary;
        int age;

        Employee(String name, String function, String email, String phone, int salary, int age) {

            this.name = name;
            this.function = function;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }
        void resume ()
        {
            System.out.println("Имя сотрудника " + name + ", должность " + function + ", контактный email "
                    + email + ", номер телефона " + phone + ", заработная плата " + salary + ", возраст " + age);
        }
    }

}

