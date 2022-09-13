package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat4 {
    public static void main(String[] args) {

        System.out.print("Kérem adja meg a háromszög 'a' oldalát: ");
        double a = getDouble();

        System.out.print("Kérem adja meg a háromszög 'b' oldalát: ");
        double b = getDouble();

        System.out.print("Kérem adja meg a háromszög 'c' oldalát: ");
        double c = getDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            double k = a + b + c;
            System.out.println("A háromszög kerülete: " + k);
        } else {
            System.out.println("Hibás adatok");
        }


    }

    private static double getDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
