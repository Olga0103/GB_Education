package ru.gb.examples_of_patterns.abstract_factory;

import ru.gb.examples_of_patterns.abstract_factory.factories.MacGUIFactory;
import ru.gb.examples_of_patterns.abstract_factory.factories.WindowsGUIFactory;

public class Demo {
    static Application app;
    public static void main(String[] args) {
        app = configureApp();
        app.runApplication();
    }

    private static Application configureApp() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows")) {
            return new Application(new WindowsGUIFactory());
        } else {
            return new Application(new MacGUIFactory());
        }
    }
}