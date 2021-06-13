package ru.gb.first_lessions;

public class FirstHW {
    public static void main(String[] args) {
        type();
        System.out.println(calculate(13f, 1.55f, 3f, 15f));
        System.out.println(numberFor(6, 5));
        numberFive(-5);
        System.out.println(numberSix(10));
        numberSeven("Илья!");
    }

    // 2 Задание
    public static void type() {
        System.out.println("Задание 2.");
        byte aa = 100;
        short ab = -27999;
        int ac = 99900;
        long ad = 9999999L;
        float ae = 27.12f;
        double af = 1.1001;
        char ag = '\u2525';
        char ah = 18000;
        boolean ai = true;
        boolean aj = false;
        System.out.println("byte = " + aa);
        System.out.println("short = " + ab);
        System.out.println("int = " + ac);
        System.out.println("long = " + ad);
        System.out.println("float = " + ae);
        System.out.println("double = " + af);
        System.out.println("char = " + ag);
        System.out.println("char = " + ah);
        System.out.println("boolean = " + ai);
        System.out.println("boolean = " + aj);
    }

    // 3 Задание
    public static float calculate(float a, float b, float c, float d) {
        System.out.println("Задание 3.");
        float score = a * (b + (c / d));
        System.out.println("Результат вычислений = " + score);
        return score * 2.5f;
    }

    // 4 Задание
    public static boolean numberFor(int a, int b) {
        System.out.println("Задание 4.");
        return a + b >= 10 && a + b <= 20;
    }

    // 5 Задание
    public static void numberFive(int a){
        System.out.println("Задание 5.");
        if (a < 0){
            System.out.println("Число отрицательное");
        }
        else {
            System.out.println("Число положительное");
        }
    }

    // 6 Задание
    public static boolean numberSix(int a){
        System.out.println("Задание 6.");
        return a < 0;
    }
    // 7 Задание
    public static void numberSeven(String name){
        System.out.println("Задание 7.");
        System.out.println("Привет, " + name );
    }

}
