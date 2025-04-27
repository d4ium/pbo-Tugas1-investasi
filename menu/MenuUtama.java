package menu;

import utility.InputValidation;
import java.util.Scanner;

public class MenuUtama {
    public static void tampilkan() {
        Scanner scanner = new Scanner(System.in);
        InputValidation inputValidation = new InputValidation(scanner);

        while (true) {
            System.out.println("[==== MENU UTAMA ====]");
            System.out.println("[     1. Login       ]");
            System.out.println("[     2. Keluar      ]");
            System.out.println("[====================]");
            System.out.println(" ");
            int pilihan = inputValidation.getValidIntInput("Pilih menu: ");
            System.out.println(" ");

            switch (pilihan) {
                case 1:
                    AuthManager.login(scanner);
                    break;
                case 2:
                    System.out.println("Terima kasih karena sudah menggunakan aplikasi!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
                    System.out.println(" ");
            }
        }
    }
}