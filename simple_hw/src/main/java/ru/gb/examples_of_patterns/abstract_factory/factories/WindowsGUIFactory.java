package ru.gb.examples_of_patterns.abstract_factory.factories;

import ru.gb.examples_of_patterns.abstract_factory.Button;
import ru.gb.examples_of_patterns.abstract_factory.Checkbox;
import ru.gb.examples_of_patterns.abstract_factory.GUIFactory;
import ru.gb.examples_of_patterns.abstract_factory.buttons.WindowsButton;
import ru.gb.examples_of_patterns.abstract_factory.checkbox.WindowsCheckbox;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}