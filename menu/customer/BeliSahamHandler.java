package menu.customer;

import model.Saham;
import model.Customer;
import data.Database;

import java.util.Scanner;

public class BeliSahamHandler {
    public static void jalankan(Scanner scanner) {
        if (Database.daftarSaham.isEmpty()) {
            System.out.println("Tidak ada saham tersedia.");
            return;
        }

        System.out.println("\n=== Daftar Saham Tersedia ===");
        for (int i = 0; i < Database.daftarSaham.size(); i++) {
            Saham s = Database.daftarSaham.get(i);
            System.out.printf("%d. %s (%s) - Rp %.2f\n", i + 1, s.getNamaPerusahaan(), s.getKode(), s.getHarga());
        }

        System.out.print("Pilih nomor saham: ");
        int pilihan = scanner.nextInt() - 1;
        scanner.nextLine();

        if (pilihan < 0 || pilihan >= Database.daftarSaham.size()) {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        Saham sahamDipilih = Database.daftarSaham.get(pilihan);
        System.out.print("Jumlah lembar yang ingin dibeli: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        Customer customer = Database.customer;
        int lembarSebelumnya = customer.sahamDimiliki.getOrDefault(sahamDipilih, 0);
        customer.sahamDimiliki.put(sahamDipilih, lembarSebelumnya + jumlah);

        System.out.println("Pembelian saham berhasil!");
    }
}