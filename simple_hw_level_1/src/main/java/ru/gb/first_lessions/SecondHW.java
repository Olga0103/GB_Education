package ru.gb.first_lessions;

public class SecondHW {
    public static void main(String[] args)
    {
        doOne();
        doTwo();
        doThree();
        doFor();
    }

    // Задание 1
    public static void doOne () {
        int[] firstArr = {0, 0, 1, 0, 1, 1, 0};
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] == 0) {
                firstArr[i] = 1;
            } else {
                firstArr[i] = 0;
            }
        }
    }

    // Задание 2
    public static void doTwo () {
        int[] secondArr = new int[8];
        for (int i = 1, j = 0; i < secondArr.length; i++)
            secondArr[i] = j += 3;
    }

    // Задание 3
    public static void doThree () {
        int[] thirdArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < thirdArr.length; i++) {
            if (thirdArr[i] < 6) {
                thirdArr[i] = thirdArr[i] * 2;
            }
        }
    }

    // Задание 4
    public static void doFor () {
        int[][] fourthArr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                fourthArr[i][i] = 1;
                fourthArr[i][5 - i - 1] = 1;
            }
        }
    }

}
