package ru.gb.examples_of_patterns.abstract_factory;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}