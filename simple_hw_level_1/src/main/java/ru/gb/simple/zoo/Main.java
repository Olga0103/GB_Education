package ru.gb.simple.zoo;

public class Main{

    public static void main(String[] args){

        Cat cat = new Cat(" Вася ", "Коричневая", 200, 2, 0);
        Sphinx sphinx = new Sphinx(" Муся ", "Серая", 300, 2.5f, 0);
        Dog dog = new Dog(" Снупи ", "Белый", 600, 0.5f, 10f);
        Chihuahua chihuahua = new Chihuahua(" Чичи ", "Оранжевый", 100, 0.2f, 5f);

        Animals[] zoo = {cat, sphinx, dog, chihuahua};

        doNow(zoo);
    }

    static void doNow (Animals[] zoo){
         for (int i = 0; i < zoo.length; i++){
            zoo[i].swim();
            zoo[i].jump();
            zoo[i].run();
        }
    }

}