package ru.gb.datas_for_tests;

public class Main {

    public static void main(String[] args, String number2, String number1) {

        System.out.printf(number1);;
        System.out.printf(number2);
    }

    public static int[] numberOne(int[] arr) {
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] == 4) {
                int[] outArray = new int[arr.length -1 - i];
                int k=0;
                for (int j = i+1; j < arr.length; j++) {
                    outArray[k] = arr[j];
                    System.out.println(outArray[k] + ", ");
                    k++;
                }
                return outArray;
            }
        }
        throw new RuntimeException("Массив не содержит 4");
    }

    public static boolean numberTwo(int[] arr2){
        boolean one = false;
        boolean four = false;
        for (int a : arr2) {
            if (a != 1 && a !=4)
                return false;
            if (a == 1)
                one = true;
            if (a == 4)
                four = true;
        }
        return (one && four);
    }

}
