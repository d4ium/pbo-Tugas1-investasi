package menu;

import menu.customer.*;
import utility.InputValidation;
import java.util.Scanner;

public class MenuCustomer {

    public static void tampilkan(Scanner scanner) {
        InputValidation inputValidation = new InputValidation(scanner);
        int pilihan;
        do {
            System.out.println("\n[==== MENU CUSTOMER ====]");
            System.out.println("[  1. Beli Saham        ]");
            System.out.println("[  2. Jual Saham        ]");
            System.out.println("[  3. Beli SBN          ]");
            System.out.println("[  4. Simulasi SBN      ]");
            System.out.println("[  5. Lihat Portofolio  ]");
            System.out.println("[  6. Logout            ]");
            System.out.println("[=======================]");
            System.out.println(" ");
            pilihan = inputValidation.getValidIntInput("Pilih menu: ");
            System.out.println(" ");

            switch (pilihan) {
                case 1:
                    BeliSahamHandler.jalankan(scanner);
                    break;
                case 2:
                    JualSahamHandler.jalankan(scanner);
                    break;
                case 3:
                    BeliSBNHandler.jalankan(scanner);
                    break;
                case 4:
                    SimulasiSBNHandler.jalankan(scanner);
                    break;
                case 5:
                    PortofolioHandler.jalankan();
                    break;
                case 6:
                    System.out.println("Logout...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 6);
    }
}