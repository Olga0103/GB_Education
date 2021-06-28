package ru.gb.examples_of_patterns.abstract_factory.buttons;

import ru.gb.examples_of_patterns.abstract_factory.Button;

public class MacButton implements Button {
    @Override
    public void pain() {
        System.out.println("Mac Button created!!");
    }
}