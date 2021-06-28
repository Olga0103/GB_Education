package ru.gb.examples_of_patterns.abstract_factory.factories;

import ru.gb.examples_of_patterns.abstract_factory.Button;
import ru.gb.examples_of_patterns.abstract_factory.Checkbox;
import ru.gb.examples_of_patterns.abstract_factory.GUIFactory;
import ru.gb.examples_of_patterns.abstract_factory.buttons.MacButton;
import ru.gb.examples_of_patterns.abstract_factory.checkbox.MacCheckbox;

public class MacGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}