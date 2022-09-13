package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Kérem adja meg a tipjét (0-fej || 1-  írás): ");
        int tipp = scn.nextInt();
        int feldobas = (int)(Math.random() * 2);
        System.out.printf("A dobás eredméyne %s ", (feldobas==0 ? "Fej" : "Írás"));
        if (tipp == feldobas){
            System.out.println("\nGratulátok ön nyert");
        } else {
            System.out.println("\nSajnos most nem nyert, játszon újra!");
        }


    }
}
