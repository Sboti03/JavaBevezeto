package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        double tileSize = 20*20;

        Scanner scn = new Scanner(System.in);

        System.out.print("Terület szélessége: ");
        double width = scn.nextDouble();

        System.out.print("Terület magassága: ");
        double height = scn.nextDouble();

        double area = width * height;
        area += area*0.1;
        double quantity = area / tileSize;
        System.out.printf("Összesen: %.0fdb csempe kell", quantity);
    }


}
