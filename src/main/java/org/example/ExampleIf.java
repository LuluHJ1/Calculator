package org.example;

import java.util.Scanner;

public class ExampleIf {

    public static void main(String[] args) {
        //if statements!
        //Pseudo code first
        //Ask somebody how old they are (Scanner)
        //If the person is over 50 we'll say they're old
        //If the person is between 19-49 years old we'll say not too old
        //If the person is 18 or below, we'll say they're not an adult
        //What symbols do we use to compare numbers? >, <, ==,!=, >=, <=,
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");

        int age = scanner.nextInt();

        if (age > 50) {
            System.out.println("You're old.");
        }
        else if (age >= 19 && age <= 50) {
            System.out.println("You're not that old.");
        }
        else {
            System.out.println("You're are not an adult yet.");
        }
    }
}