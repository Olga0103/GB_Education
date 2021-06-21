package ru.gb.simle_actions_with_arrays;

import java.util.ArrayList;
import java.util.Arrays;


public class SimpleActionsWithArrays {

    public static void main(String[] args) {

        swapElementsOfArray();
        convertsArrayToArrayList();



    }


    private static void swapElementsOfArray() {
        System.out.println("№1");

        Integer[] arr = {5, 8, 6, 2, 4, 0, 6};

        System.out.println("Дан массив:       " + Arrays.toString(arr));
        swapElements(arr, 0, 4);
        System.out.println("Массив на выходе: " + Arrays.toString(arr));
        System.out.println();

    }
    private static <T> void swapElements(T[] array, int i1, int i2) {
        T temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

    private static void convertsArrayToArrayList() {

        String[] arr1 = {"One", "Two", "Three", "For", "Five"};

        changeToArrayList(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println();

    }

    private static <T> ArrayList changeToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }


}
