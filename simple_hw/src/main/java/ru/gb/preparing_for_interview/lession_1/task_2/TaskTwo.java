package ru.gb.preparing_for_interview.lession_1.task_2;

//interface Moveable {
//    void move();
//}
//
//interface Stopable {
//    void stop();
//}




//todo Engine лучше вынести в отдельный Enum класс
// логичней перенести implements Moveable, Stopable в класс Car, тк грузовик
// и легковая машина могут двигаться и останавливаться
//todo вариант оптимизации в solution


//abstract class Car {
//    public Engine engine;
//    private String color;
//    private String name;
//
//
//    protected void start() {
//        System.out.println("Car starting");
//    }
//
//    abstract void open();
//
//    public Engine getEngine() {
//        return engine;
//    }
//
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//
//class LightWeightCar extends Car implements Moveable{
//
//    @Override
//    void open() {
//        System.out.println("Car is open");
//    }
//
//    @Override
//    public void move() {
//        System.out.println("Car is moving");
//    }
//
//}
//
//
//class Lorry extends Car, Moveable, Stopable{
//
//    public void move(){
//        System.out.println("Car is moving");
//    }
//
//    public void stop(){
//        System.out.println("Car is stop");
//    }
//}
//
//
