package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy számot: ");
        int szam = scn.nextInt();
        int count = 0;
        for (int i = 1; i < szam; i++) {
            if (i % 2 != 0){
                count += i;
            }
        }
        System.out.println("A pozitív páratlan számok összege: " + count);
    }
}
