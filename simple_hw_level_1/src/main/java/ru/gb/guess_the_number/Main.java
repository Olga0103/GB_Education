package ru.gb.guess_the_number;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        guessTheNumber();
        repeatGame();
    }

        public static void guessTheNumber () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ваша задача угадать число.");
            int range = 1;
            int number = (int) (Math.random() * range);
            while (true) {
                System.out.println("Угадайте число от 0 до " + range);
                int input_number = scanner.nextInt();
                if (input_number == number) {
                    System.out.println("Вы угадали!");
                    break;

                } else if (input_number > number) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }
            }
        }

        public static void repeatGame(){

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Повторить игру еще раз?");
        System.out.println();
        System.out.println("Нажмите '1' для продолжения , '0' для завершения игры");
        int input_number = scanner.nextInt();

        if (input_number == 0){
            scanner.close();
            System.out.println("Игра завершена");
        }
        else if (input_number == 1){
            guessTheNumber();
            repeatGame();
        }
        else{
            System.out.println("Ошибка ввода");
            repeatGame();
        }
    }

}

