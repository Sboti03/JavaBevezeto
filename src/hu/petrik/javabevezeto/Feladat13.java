package hu.petrik.javabevezeto;

import java.util.Random;
import java.util.Scanner;

public class Feladat13 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int randomNumber = (int) Math.floor((Math.random() * 100) + 1);

        System.out.print("Adjon meg egy számot 1-100között: ");
        int inputNumber = sc.nextInt();
        System.out.println();

        while (inputNumber != randomNumber) {
            if (inputNumber < randomNumber) {
                System.out.println("A gondolt szám nagyobb");
            } else {
                System.out.println("A gondolt szám kisebb");
            }
            System.out.print("Adjon meg egy számot 1-100között: ");
            inputNumber = sc.nextInt();
            System.out.println();
        }
        System.out.println("Gratulálok, kitaláltad a számot!");

    }
}
