package ru.gb.examples_of_patterns.chain_of_responsibility;

public class BigFruitSorting extends AbstractFruitSort{
    public BigFruitSorting(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("Shop："+fruit);
    }
}