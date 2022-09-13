package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Kérem adjon meg 5 és 1000 között egy számot: ");
        int number = scn.nextInt();
        int eredeti = number;

        Erme[] ermek = {new Erme(Erme.Ertek.EGYFORINT, 0),
                new Erme(Erme.Ertek.OTFORINT, 0),
                new Erme(Erme.Ertek.TIZFORINT, 0),
                new Erme(Erme.Ertek.HUSZFORINT, 0),
                new Erme(Erme.Ertek.OTVENFORINT, 0),
                new Erme(Erme.Ertek.SZAZFORINT, 0),
                new Erme(Erme.Ertek.KETSZAZFORINT, 0)
        };

        for (int i = ermek.length -1 ; i >= 0; i--) {
            double oszto = number / ermek[i].PenzErtek.value;
            oszto = Math.floor(oszto);
            number -= (oszto * ermek[i].PenzErtek.value);
            ermek[i].Darab = (int)oszto;
        }

        System.out.printf("%dFt fel lett váltva: \n", eredeti);
        for (int i = 0; i < ermek.length; i++) {
            if (ermek[i].Darab > 0){
                System.out.printf("%ddb %s-osra \n", ermek[i].Darab, ermek[i].PenzErtek.name);
            }
        }

    }
}

class Erme {
    public enum Ertek {
        EGYFORINT("Egy forint", 1),
        OTFORINT("Öt forint", 5),
        TIZFORINT("Tíz forint", 10),
        HUSZFORINT("Húsz forint", 20),
        OTVENFORINT("Ötven forint", 50),
        SZAZFORINT("Száz forint", 100),
        KETSZAZFORINT("Kétszáz forint", 200);


        public String name;
        public int value;

        Ertek(String name, int value) {
            this.name = name;
            this.value = value;
        }
    }

    public Ertek PenzErtek;
    public int Darab;

    public Erme(Ertek ertek, int darab) {
        PenzErtek = ertek;
        Darab = darab;
    }
}
