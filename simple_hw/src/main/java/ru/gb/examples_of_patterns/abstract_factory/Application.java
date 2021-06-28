package ru.gb.examples_of_patterns.abstract_factory;

public class Application {
    private final GUIFactory guiFactory;

    public Application(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }

    public void runApplication() {
        this.guiFactory.createButton().pain();
        this.guiFactory.createCheckbox().paint();
    }
}