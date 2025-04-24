package menu.customer;

import model.SBN;
import model.Customer;
import data.Database;

public class SimulasiSBNHandler {
    public static void jalankan(java.util.Scanner scanner) {
        Customer customer = Database.customer;

        if (customer.sbnDimiliki.isEmpty()) {
            System.out.println("Anda belum memiliki SBN.");
            return;
        }

        System.out.println("\n=== Simulasi Kupon SBN ===");
        for (SBN sbn : customer.sbnDimiliki.keySet()) {
            double nominal = customer.sbnDimiliki.get(sbn);
            double bungaBulanan = (sbn.getBunga() / 12) * 0.9 * nominal;

            System.out.printf("%s - Nominal: Rp %.2f → Bunga / bulan: Rp %.2f\n",
                    sbn.getNama(), nominal, bungaBulanan);
        }
    }
}