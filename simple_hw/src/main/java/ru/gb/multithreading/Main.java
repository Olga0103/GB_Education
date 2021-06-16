package ru.gb.multithreading;

import java.util.Arrays;

public class Main {

    private static final int size = 10000000;
    private static final int h = size / 2;

    public static void main(String[] args) {
        Main main = new Main();
        main.doOne();
        main.doTwo();
    }

    private void doOne(){
        System.out.println("1. Целый массив");
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        long start = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long end = System.currentTimeMillis();
        System.out.println(String.format("Время выполнения - %s", (end - start)));
        System.out.println();
    }



    private void doTwo(){
        System.out.println("2. Разделение массивов");
        float[] arr = new float[size];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        Arrays.fill(arr, 1.0f);
        long start = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);


        Thread thread1 = new Thread(() ->this.methodTwoInternal(arr1, 1));
        Thread thread2 = new Thread(() ->this.methodTwoInternal(arr2, 2));

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e){
        }


        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        long end = System.currentTimeMillis();
        System.out.println(String.format("Завершение разделения, время - %s", (end - start)));
    }

    private void methodTwoInternal(float[] arr, int number){
        long start = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long end = System.currentTimeMillis();
        System.out.println(String.format("Время выполнния части %d - %s", number, (end - start)));
    }
}
