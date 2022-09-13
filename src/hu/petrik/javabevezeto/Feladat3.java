package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy pozitív valós számot: ");
        double number = scn.nextDouble();

        double downNumber = Math.floor(number);
        double upNumber = Math.ceil(number);
        double fraction = number - downNumber;
        System.out.printf("A megadott szám a %.0f és a %.0f egész számok között van," +
                " és ezek közül a %.0f számhoz van közelebb.\n", downNumber, upNumber, number);
        System.out.println("A szám egész része : " + downNumber);
        System.out.printf("A szám tört része : %.2f",fraction);

    }

}
