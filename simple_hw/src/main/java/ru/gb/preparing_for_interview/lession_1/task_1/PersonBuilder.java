package ru.gb.preparing_for_interview.lession_1.task_1;

public class PersonBuilder implements Builder{

    private FirstName firstName;
    private LastName lastName;
    private MiddleName middleName;
    private Country country;
    private Address address;
    private Phone phone;
    private int age;
    private Gender gender;

    @Override
    public void setFirstName(FirstName firstName){
        this.firstName = firstName;
    }

    @Override
    public void setLastName(LastName lastName){
        this.lastName = lastName;
    }

    @Override
    public void setMiddleName(MiddleName middleName){
        this.middleName = middleName;
    }

    @Override
    public void setCountry(Country country){
        this.country = country;
    }

    @Override
    public void setAddress(Address address){
        this.address = address;
    }

    @Override
    public void setPhone(Pnone pnone){
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
}



