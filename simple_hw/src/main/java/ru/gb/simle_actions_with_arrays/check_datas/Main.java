package ru.gb.simle_actions_with_arrays.check_datas;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyArrayDataException {
        checkArrSize();
        conversionToNumber();
        checkWords();
    }

    public static void checkArrSize() {
        int size;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите размер двумерного массива");
        size = scanner.nextInt();

        int[][] arr = new int[size][size];

        try {
            if (arr.length != 4)
                throw new MyArraySizeException("Ошибка! Возможен массив только 4х4.");
        } catch (MyArraySizeException myArraySizeException) {
            myArraySizeException.printStackTrace();
        }
        System.out.println();
    }

    public static int conversionToNumber() throws MyArrayDataException {

        String[][] table = {
                {"o", "5", "3", "7"},
                {"6", "l", "0", "1"},
                {"1", "9", "0", "1"},
                {"0", "1", "k", "1"}
        };

        int sum = 0;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {

                try {
                    sum += Integer.parseInt(table[i][j]);

                } catch (NumberFormatException e) {
                    System.out.println("Некорректный тип данных в ячейке [" + i + "][" + j + "]");
                    throw new MyArrayDataException("Некорректный тип данных [" + i + "][" + j + "]");
                }
                finally {
                    continue;
                }
            }
        }
        System.out.println("Сумма значений массива " + sum);
        return sum;
    }

    private static void checkWords() {

        System.out.println();
        System.out.println("Проверка повторяющихся слов.");

        String[] list = {"Apple","Banana", "Pineapple", "Apple", "Cherry", "Peach", "Strawberry",
                "Orange", "Banana", "Kiwi", "Mango", "Lime", "Lemon", "Pineapple", "Lychee",
                "Papaya", "Melon", "Apple", "Mango"};

        HashSet<String> fruits = new HashSet<>(Arrays.asList(list));

        System.out.println("Единичные фрукты:");
        System.out.println(fruits.toString());
        System.out.println("Количество каждого вида");
        for (String key : fruits) {
            System.out.println(key + ": " + Collections.frequency(Arrays.asList(list), key));
        }
        System.out.println();
    }
}


