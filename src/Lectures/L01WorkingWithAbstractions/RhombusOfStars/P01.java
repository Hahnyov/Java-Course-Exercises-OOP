package Lectures.L01WorkingWithAbstractions.RhombusOfStars;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        //принтираме горната част на ромба
        printTopPart(size);
        //принтиране на долната част на ромба
        printBottomPart(size);
    }

    private static void printBottomPart(int size) {
        for (int row = size; row >= 1; row--) {
            printRepeatingString(" ",size-row);
            printRepeatingString("* ",row);
            System.out.println();
        }
    }

    private static void printTopPart(int size) {
        for (int row = 1; row <= size-1; row++) {
            printRepeatingString(" ", size-row);
            printRepeatingString("* ", row);
            System.out.println();
        }
    }
    private static void printRepeatingString(String string, int times) {
        for (int row = 1; row <= times; row++) {
            System.out.print(string);
        }
    }
}
