package ru.gb.examples_of_patterns.chain_of_responsibility;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        AbstractFruitSort Bfs,Mfs,Sfs;
        Bfs=new BigFruitSorting(6);
        Mfs=new MidFruitSorting(5);
        Sfs=new SmallFruitSorting(2);

        Bfs.setNextFruitSort(Mfs);
        Mfs.setNextFruitSort(Sfs);

        Random rm =new Random();
        for (int i =0; i<1000;i++){
            int weight=rm.nextInt(10);
            Bfs.sendFruit(weight,"Orange");
        }
        Bfs.getFruitBox();
        Mfs.getFruitBox();
        Sfs.getFruitBox();
    }
}