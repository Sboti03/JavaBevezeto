package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] elemek = new int[5];

        for (int i = 0; i < elemek.length; i++) {
            System.out.print("Kérem adjon meg egy egész számot: ");
            elemek[i] = sc.nextInt();
        }

        System.out.println("A tömb elemei:");
        for (int i = 0; i < elemek.length; i++) {
            System.out.print(elemek[i] + " ");
        }

        System.out.println("Fordított sorrendben:");
        for (int i = elemek.length - 1; i != -1; i--) {
            System.out.print(elemek[i] + " ");
        }

        System.out.println("Minden második eleme:");
        for (int i = 0; i < elemek.length; i++) {
            if (i % 2 == 0) {
                System.out.print(elemek[i] + " ");
            }
        }

        System.out.print("Adjon meg egy számot 1-5 között: ");
        int index = sc.nextInt();
        System.out.println("A kért elem: " + elemek[index - 1]);

    }
}
