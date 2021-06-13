package ru.gb.tic_tac_toe;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static char [] [] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args){
        createMap();
        showMap();
        turnFirstPlayer();
        showMap();
        turnSecondPlayer ();
        showMap();
        doWhile();
    }

    public static void createMap (){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map [i][j] = DOT_EMPTY;
            }
        }
    }

    public static void showMap () {
        for (int i = 0; i <=map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print( (i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map [i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void turnFirstPlayer () {
        Scanner scanner = new Scanner(System.in);
        int x,y;
        do {
            System.out.println("Введите ячейку в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while(!isCellValid(x,y));
        map [y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if(x < 0 || y < 0 || x > 2 || y > 2){
            return false;
        }
        if(map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }


    public static void turnSecondPlayer() {
        Random random = new Random ();
        int x,y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        }while (!isCellValid(x,y));
        map[y][x] = DOT_O;
        System.out.println("Компьютер сделал ход в точку " + (x + 1) + " " + (y + 1));
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void doWhile () {
        while (true) {
            turnFirstPlayer();
            showMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            turnSecondPlayer();
            showMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symb) {
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }

}
