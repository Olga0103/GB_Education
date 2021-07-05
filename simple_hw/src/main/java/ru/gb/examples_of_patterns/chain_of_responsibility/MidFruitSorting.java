package ru.gb.examples_of_patterns.chain_of_responsibility;

public class MidFruitSorting extends AbstractFruitSort{
    public MidFruitSorting(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("Pot："+fruit);
    }
}