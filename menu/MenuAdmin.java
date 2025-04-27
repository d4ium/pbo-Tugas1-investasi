package menu;

import menu.admin.*;
import utility.InputValidation;
import java.util.Scanner;

public class MenuAdmin {

    public static void tampilkan(Scanner scanner) {
        InputValidation inputValidation = new InputValidation(scanner);
        int pilihan;
        do {
            System.out.println("\n[====== MENU ADMIN =====]");
            System.out.println("[   1. Tambah Saham     ]");
            System.out.println("[   2. Ubah Harga Saham ]");
            System.out.println("[   3. Tambah SBN       ]");
            System.out.println("[   4. Logout           ]");
            System.out.println("[=======================]");
            System.out.println(" ");
            pilihan = inputValidation.getValidIntInput("Pilih menu: ");
            System.out.println(" ");

            switch (pilihan) {
                case 1:
                    TambahSahamHandler.jalankan(scanner);
                    break;
                case 2:
                    UbahHargaSahamHandler.jalankan(scanner);
                    break;
                case 3:
                    TambahSBNHandler.jalankan(scanner);
                    break;
                case 4:
                    System.out.println("Kembali ke menu utama...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }
}