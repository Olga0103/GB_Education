package ru.gb.preparing_for_interview.lession_1.task_1;

public class PersonBuilder implements Builder{

    private String firstName;
    private String lastName;
    private String  middleName;
    private String  country;
    private String address;
    private String phone;
    private int age;
    private Gender gender;

    @Override
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    @Override
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    @Override
    public void setCountry(String country){
        this.country = country;
    }

    @Override
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public void setPhone(String phone){
        this.phone = phone;
    }

    @Override
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public void setGender(Gender gender){
        this.gender = gender;
    }

    public Person getResult(){
        return new Person(firstName, lastName, middleName, country, address, phone, age, gender);
    }
}



