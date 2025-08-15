package Exercises.Ex2_Encapsulation.ClassBoxDataValidation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        Box box = new Box(length, width, height);
        double surfaceArea=box.calculateSurfaceArea();
        double volume=box.calculateVolume();
        double leteralSurfacearea= box.calculateLateralSurfaceArea();
        System.out.println("Surface Area: "+surfaceArea);
        System.out.println("Letheral Surface Area: "+leteralSurfacearea);
        System.out.println("Volume: "+volume);
    }

}
