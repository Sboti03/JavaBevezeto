package hu.petrik.javabevezeto;

import javax.swing.*;
import java.util.Scanner;

public class Feladat10 {
    public static void main(String[] args) {
        int count = 0;
        int paros = 0;
        int paratlan = 0;
        Scanner scn = new Scanner(System.in);
        while (count <= 100) {
            System.out.print("Kérek egy számot: ");
            int szam = scn.nextInt();
            count += szam;
            if (szam % 2 == 0) {
                paros++;
            } else {
                paratlan++;
            }
        }

        System.out.println("Páros számok összege: " + paros);
        System.out.println("Páratlan számok összege: " + paratlan);

    }
}
