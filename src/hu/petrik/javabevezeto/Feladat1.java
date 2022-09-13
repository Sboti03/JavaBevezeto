package hu.petrik.javabevezeto;
import java.util.Scanner;
public class Feladat1 {

    public double waterVolume(){

        System.out.print("Medence átmérője: ");
        double radius =  getInt() / 2;

        System.out.print("Medence mélysége: ");
        double depth = getInt();


        Double result = Math.PI * Math.pow(radius, 2) * depth;
        return result;
    }

    private int getInt(){
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

}
