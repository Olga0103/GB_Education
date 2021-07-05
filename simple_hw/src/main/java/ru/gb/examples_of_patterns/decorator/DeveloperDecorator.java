package ru.gb.examples_of_patterns.decorator;


public class DeveloperDecorator implements Main{

    Main main;

    public DeveloperDecorator(Main main) {
        this.main = main;
    }

    @Override
    public String makeJob() {
        return main.makeJob();

    }
}