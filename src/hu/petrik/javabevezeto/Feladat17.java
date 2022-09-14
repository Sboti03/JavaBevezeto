package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tomb1 = new int[5];

        System.out.println("Első tomb elemei:");

        for (int i = 0; i < tomb1.length; i++) {
            System.out.print("Kérem adjon meg egy egész számot: ");
            tomb1[i] = sc.nextInt();
        }

        int[] tomb2 = new int[5];

        System.out.println("\nMásodik tömb elemei:");

        for (int i = 0; i < tomb2.length; i++) {
            System.out.print("Kérem adjon meg egy egész számot: ");
            tomb2[i] = sc.nextInt();
        }

        int[] tomb3 = new int[5];

        for (int i = 0; i < tomb3.length; i++) {
            tomb3[i] = tomb1[i] + tomb2[i];
        }
        System.out.println("A két tömb elemei össze adva: ");
        for (int i = 0; i < tomb3.length; i++) {
            System.out.print(tomb3[i] + " ");
        }
    }

}
