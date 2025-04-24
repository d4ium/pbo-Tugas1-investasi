package menu;

import java.util.Scanner;

import menu.customer.*;
import data.Database;

public class MenuCustomer {

    public static void tampilkan(Scanner scanner) {
        int pilihan;
        do {
            System.out.println("\n===== MENU CUSTOMER =====");
            System.out.println("[  1. Beli Saham        ]");
            System.out.println("[  2. Jual Saham        ]");
            System.out.println("[  3. Beli SBN          ]");
            System.out.println("[  4. Simulasi SBN      ]");
            System.out.println("[  5. Lihat Portofolio  ]");
            System.out.println("[  6. Logout            ]");
            System.out.println("[=======================]");
            System.out.println(" ");
            System.out.print("Pilih menu: ");
            System.out.println(" ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

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