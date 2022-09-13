package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adjon meg egy szöveget:");

        String szoveg = sc.nextLine();
        System.out.println("Mit szeretne tenni a szöveggel: ");
        System.out.println("a - Nagy betűssé alakítani\nb - Kisbetűssé alakítani\nc - Lekérdezni a hosszát\n" +
                "d - Összehasonlítani egy másik szöveggel\ne - Egy részét kiiratni a szövegnek\n" +
                "f - Kilépnni");
        System.out.println(szoveg);
    }
}
