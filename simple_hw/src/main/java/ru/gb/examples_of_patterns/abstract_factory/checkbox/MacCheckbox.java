package ru.gb.examples_of_patterns.abstract_factory.checkbox;

import ru.gb.examples_of_patterns.abstract_factory.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Mac checkbox created !!");
    }
}