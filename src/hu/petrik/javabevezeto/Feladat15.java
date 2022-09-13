package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] elemek = new double[25];

        for (int i = 0; i < elemek.length; i++) {
            System.out.print("Adjon meg az " + (i + 1) + ". valós számot: ");
            elemek[i] = sc.nextDouble();
        }

        System.out.println("Páratlan indexű számok indexe");


        for (int i = 0; i < elemek.length; i++) {
            if (i % 2 != 0) {
                System.out.print(elemek[i] * elemek[i] + " ");
            }
        }
    }
}
