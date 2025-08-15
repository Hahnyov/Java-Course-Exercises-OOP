package Exercises.Ex1_WorkingWIthAbstractions.P04TrafficLight;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lights[] lights = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Lights::valueOf)
                .toArray(Lights[]::new);
        int numberOfUpdates = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numberOfUpdates; i++) {
            //update lights
            updateLights(lights);
            printLights(lights);
        }

    }

    private static void updateLights(Lights[] lights) {
        //red->green->yellow->red
        //Light light ->
        for(int index = 0; index < lights.length; index++) {
            switch (lights[index]) {
                case RED -> lights[index] =Lights.GREEN;
                case GREEN -> lights[index] =Lights.YELLOW;
                case YELLOW -> lights[index] =Lights.RED;

            }
        }

    }

    private static void printLights(Lights[] lights) {
        Arrays.stream(lights).forEach(light -> System.out.print(light + " "));
        System.out.println();
    }
}
