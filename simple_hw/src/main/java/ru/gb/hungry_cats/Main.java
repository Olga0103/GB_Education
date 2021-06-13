package ru.gb.hungry_cats;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int moreFood;
        Scanner scanner = new Scanner(System.in);

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Хомяк", 27, false);
        cats[1] = new Cat("Обжорка", 30, false);
        cats[2] = new Cat("Колобок", 21, false);

        Plate plate = new Plate(75);

        plate.info();

        for (int i = 0; i < cats.length; i++) {
            if (cats[i].satiety == false && cats[i].satietyLimit < plate.food) {
                cats[i].eat(plate);
                cats[i].satiety = true;
                System.out.println(cats[i].name + " от души покушал!");
            } else {
                System.out.println(cats[i].name + " остался голодным!");
            }
        }

        plate.info();
        System.out.println("Сколько корма добавить?");
        moreFood = scanner.nextInt();
        plate.increaseFood(moreFood);
        plate.info();

    }
}

