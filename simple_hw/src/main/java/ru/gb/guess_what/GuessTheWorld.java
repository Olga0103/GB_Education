package ru.gb.guess_what;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheWorld {

    public static void main(String[] args){
        guessTheGiftsOfNature();
    }

    public static void guessTheGiftsOfNature()
    {
        System.out.println("Guess, which fruit or vegetable is hidden");
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words));
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String input_word = scanner.nextLine();
        String hidden_word = new String();

        if (input_word == hidden_word){
            System.out.println("You guessed");
        }
        else{
            System.out.println("You didn't guess! Prompt:");
        }
    }

}
