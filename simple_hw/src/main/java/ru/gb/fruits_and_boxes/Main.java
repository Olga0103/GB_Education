package ru.gb.fruits_and_boxes;

public class Main {

    public static void main(String[] args) {

        Apples a1 = new Apples();
        Apples a2 = new Apples();
        Apples a3 = new Apples();

        Oranges o1 = new Oranges();
        Oranges o2 = new Oranges();
        Oranges o3 = new Oranges();
        Oranges o4 = new Oranges();

        Box<Apples> box1 = new Box<>(a1, a2, a3);
        Box<Oranges> box2 = new Box<>(o1, o2, o3, o4);

        System.out.println("Одинаковый вес у коробок - " + box1.compare(box2));

        Box<Oranges> box3 = new Box<Oranges>();
        box2.transfer(box3);
        System.out.println("Апельсины пересыпаны в другую коробку.");

    }

}
