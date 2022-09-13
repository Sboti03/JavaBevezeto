package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Kérem adja meg a pontszámot: ");
        int pontszam = scn.nextInt();

        boolean egyes = (pontszam <= 42);
        boolean kettes = (pontszam >= 43 && pontszam <= 57);
        boolean harmas = (pontszam >= 58 && pontszam <= 72);
        boolean negyes = (pontszam >= 73 && pontszam <= 87);
        boolean otos = (pontszam >= 88 && pontszam <= 100);

        boolean[] jegyek = {egyes, kettes, harmas, negyes, otos};

        for (int i = 0; i < jegyek.length; i++) {
            if (jegyek[i]){
                System.out.println("A jegy: " + (i +1));
                break;
            }
        }


    }
}
