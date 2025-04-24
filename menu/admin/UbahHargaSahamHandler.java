package menu.admin;

import model.Saham;
import data.Database;

import java.util.Scanner;

public class UbahHargaSahamHandler {
    public static void jalankan(Scanner scanner) {
        if (Database.daftarSaham.isEmpty()) {
            System.out.println("Tidak ada saham yang tersedia.");
            return;
        }

        System.out.println("Daftar Saham:");
        for (int i = 0; i < Database.daftarSaham.size(); i++) {
            Saham s = Database.daftarSaham.get(i);
            System.out.printf("%d. %s (%s) - Rp %.2f\n", i + 1, s.getNamaPerusahaan(), s.getKode(), s.getHarga());
        }

        System.out.print("Pilih nomor saham untuk ubah harga: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index < 0 || index >= Database.daftarSaham.size()) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        System.out.print("Harga baru: ");
        double hargaBaru = scanner.nextDouble();
        scanner.nextLine();

        Database.daftarSaham.get(index).setHarga(hargaBaru);
        System.out.println("Harga saham berhasil diubah!");
    }
}