package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adjon meg egy szöveget:");

        String szoveg = sc.nextLine();

        boolean inLoop = true;

        while (inLoop){
            System.out.println("Mit szeretne tenni a szöveggel: ");
            System.out.println("a - Nagy betűssé alakítani\nb - Kisbetűssé alakítani\nc - Lekérdezni a hosszát\n" +
                    "d - Összehasonlítani egy másik szöveggel\ne - Egy részét kiiratni a szövegnek\n" +
                    "f - Kilépnni");

            String parancs = sc.nextLine();
            System.out.println();
            switch (parancs) {
                case "a":
                    System.out.println(upperCase(szoveg));
                    break;
                case "b":
                    System.out.println(lowerCase(szoveg));
                    break;
                case "c":
                    System.out.println(lenght(szoveg));
                    break;
                case "d":
                    System.out.println(comperTo2String(szoveg));
                    break;
                case "e":
                    System.out.println(specificString(szoveg));
                    break;
                case "f":
                    inLoop = false;
                    break;
                default:
                    System.out.println("Hiba");
                    break;
            }

        }
        System.out.println("\nKilépve\n");


    }

    static String upperCase(String szoveg) {
        return szoveg.toUpperCase();
    }

    static  String lowerCase(String szoveg) {
        return szoveg.toLowerCase();
    }

    static int lenght(String szoveg) {
        return szoveg.length();
    }

    static String specificString(String szoveg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg mettől: ");
        int a = sc.nextInt();
        System.out.print("Adja meg meddig: ");
        int b = sc.nextInt();
        return szoveg.substring(a, b);
    }

    static int comperTo2String(String szoveg) {
        System.out.println("Kérem adjon meg még egy szöveget: ");
        Scanner sc = new Scanner(System.in);
        String szoveg2 = sc.nextLine();
        return szoveg.compareTo(szoveg2);
    }

}
