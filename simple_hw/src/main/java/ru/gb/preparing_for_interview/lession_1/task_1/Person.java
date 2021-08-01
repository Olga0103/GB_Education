package ru.gb.preparing_for_interview.lession_1.task_1;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private Gender gender;

    public Person(String firstName, String lastName, String middleName, String country,
                  String address, String phone, int age, Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getResult() {
        return "Person {" +
                "\nfirstName='" + firstName +
                "\nlastName='" + lastName + '\'' +
                "\nmiddleName='" + middleName + '\'' +
                "\ncountry='" + country + '\'' +
                "\nphone='" + phone + '\'' +
                "\nage=" + age +
                "\ngender='" + gender + '\'' +
                "\n" +
                '}';
    }
}
