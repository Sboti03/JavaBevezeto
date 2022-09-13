package hu.petrik.javabevezeto;

public class Main {
    public static void main(String[] args) {
        Feladat1 fl = new Feladat1();
        System.out.printf("A medence térfogata %.3f köbméter", fl.waterVolume());
    }
}