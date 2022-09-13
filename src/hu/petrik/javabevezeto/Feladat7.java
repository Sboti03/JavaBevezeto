package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        System.out.print("Kérem adjon meg egy hónapot: ");
        int honap = scn.nextInt();

        boolean tel = (honap == 12 || honap == 1 || honap == 2);
        boolean tavasz = (honap > 2 && honap < 6);
        boolean nyar = (honap > 5 && honap < 9);
        boolean osz = (honap > 8 && honap < 12);

        if (tel){
            System.out.println("Tél van");
        } else if (tavasz) {
            System.out.println("Tavasz van");
        } else if (nyar) {
            System.out.println("Nyár van");
        } else if (osz) {
            System.out.println("Ősz van");
        } else {
            System.out.println("Nincs ilyen évszak");
        }

    }
}
