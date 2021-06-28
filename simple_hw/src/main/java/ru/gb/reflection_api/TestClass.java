package ru.gb.reflection_api;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.lang.reflect.Method;

public class TestClass {

    public static void main(String[] args) throws TestException {
        start("test");
        start(Tester.class);
    }

    private static void start(String className) {
        try {
            Class class1 = Class.forName(className);
            start(class1);
        } catch (ClassNotFoundException | TestException e) {
            e.printStackTrace();
        }
    }

    private static void start(Class classObject) throws TestException {
        Method[] methods = classObject.getDeclaredMethods();
        try {
            int count1 = 0;
            for (Method o : methods) {

                if (o.getAnnotation(BeforeSuite.class) != null) {
                    if (count1 == 1) throw new TestException();
                    System.out.println(o);
                    count1++;
                }
            }
            for (int i = 1; i < 11; i++) {
                for (Method o : methods) {
                    if (o.getAnnotation(Test.class) != null) {
                        Test test =
                                o.getAnnotation(Test.class);
                        if (test.value() == i) {
                            System.out.println(o);
                            System.out.println("value: " + test.value());
                        }
                    }
                }
            }
            int count2 = 0;
            for (Method o : methods) {
                if (o.getAnnotation(AfterSuite.class) != null) {
                    if (count2 == 1) throw new TestException();
                    System.out.println(o);
                    count2++;
                }
            }
        } catch (TestException e) {
            e.printStackTrace();
        }
    }
}