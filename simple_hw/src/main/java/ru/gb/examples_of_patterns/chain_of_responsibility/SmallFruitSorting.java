package ru.gb.examples_of_patterns.chain_of_responsibility;

public class SmallFruitSorting extends AbstractFruitSort{
    public SmallFruitSorting(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("Juice："+fruit);
    }
}