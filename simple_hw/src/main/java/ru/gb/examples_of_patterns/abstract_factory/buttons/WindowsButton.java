package ru.gb.examples_of_patterns.abstract_factory.buttons;

import ru.gb.examples_of_patterns.abstract_factory.Button;

public class WindowsButton implements Button {
    @Override
    public void pain() {
        System.out.println("Windows Button Created!!");
    }
}