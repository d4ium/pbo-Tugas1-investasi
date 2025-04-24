package menu.customer;

import model.Saham;
import model.Customer;
import data.Database;

import java.util.*;

public class JualSahamHandler {
    public static void jalankan(Scanner scanner) {
        Customer customer = Database.customer;

        if (customer.sahamDimiliki.isEmpty()) {
            System.out.println("Anda tidak memiliki saham.");
            return;
        }

        List<Saham> daftar = new ArrayList<>(customer.sahamDimiliki.keySet());

        System.out.println("\n=== Saham yang Anda Miliki ===");
        for (int i = 0; i < daftar.size(); i++) {
            Saham s = daftar.get(i);
            int lembar = customer.sahamDimiliki.get(s);
            System.out.printf("%d. %s (%s) - %d lembar\n", i + 1, s.getNamaPerusahaan(), s.getKode(), lembar);
        }

        System.out.print("Pilih nomor saham untuk dijual: ");
        int pilihan = scanner.nextInt() - 1;
        scanner.nextLine();

        if (pilihan < 0 || pilihan >= daftar.size()) {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        Saham saham = daftar.get(pilihan);
        int lembarDimiliki = customer.sahamDimiliki.get(saham);

        System.out.print("Jumlah lembar yang ingin dijual: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        if (jumlah > lembarDimiliki) {
            System.out.println("Gagal: Anda tidak punya cukup lembar saham.");
            return;
        }

        if (jumlah == lembarDimiliki) {
            customer.sahamDimiliki.remove(saham);
        } else {
            customer.sahamDimiliki.put(saham, lembarDimiliki - jumlah);
        }

        System.out.println("Penjualan berhasil!");
    }
}