package menu;

import menu.admin.TambahSahamHandler;
import menu.admin.UbahHargaSahamHandler;
import menu.admin.TambahSBNHandler;

import java.util.Scanner;

public class MenuAdmin {

    public static void tampilkan(Scanner scanner) {
        int pilihan;
        do {
            System.out.println("\n======= MENU ADMIN ======");
            System.out.println("[   1. Tambah Saham     ]");
            System.out.println("[   2. Ubah Harga Saham ]");
            System.out.println("[   3. Tambah SBN       ]");
            System.out.println("[   4. Logout           ]");
            System.out.println("[=======================]");
            System.out.println(" ");
            System.out.print("Pilih menu: ");
            System.out.println(" ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

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