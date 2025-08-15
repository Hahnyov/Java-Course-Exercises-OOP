package DEMO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose role: ADMIN, USER or SUPPORT!: ");
        User user = new User("Riza",23,Role.valueOf(scanner.nextLine()));
        System.out.println(user.toString());
    }
}
