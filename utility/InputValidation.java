package utility;

import java.util.Scanner;

public class InputValidation {

    private Scanner scanner;

    // Konstruktor
    public InputValidation(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getValidIntInput(String prompt) {
        int input;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                scanner.nextLine();
                return input;
            } else {
                System.out.println("Input tidak valid, harap masukkan angka.");
                System.out.println(" ");
                scanner.nextLine();
            }
        }
    }
}