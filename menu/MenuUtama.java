package menu;

import java.util.Scanner;

public class MenuUtama {
    public static void tampilkan() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== MENU UTAMA =====");
            System.out.println("1. Login");
            System.out.println("2. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    AuthManager.login(scanner);
                    break;
                case 2:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}