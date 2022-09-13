package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Kérem adja meg a téglalap 'a' oldalát: ");
        double a = scn.nextDouble();

        System.out.print("Kérem adja meg a téglalap 'b' oldalát: ");
        double b = scn.nextDouble();

        System.out.print("Kérem adja meg, hogy mit szeretne kiszámítani (K: kerület, T: terület) : ");
        String muvelet = scn.next();

        if (muvelet.equals("K")) {
            double kerulet = 2 * a + b;
            System.out.println("Téglalap kerülete: " + kerulet);
        } else if (muvelet.equals("T")) {
            double terulet = a * b;
            System.out.println("Téglalap területe: " + terulet);
        } else {
            System.out.println("Hibás műveletet adott meg!");
        }

        if ( a == b){
            System.out.println("Ez egy négyzet");
        }


    }
}
