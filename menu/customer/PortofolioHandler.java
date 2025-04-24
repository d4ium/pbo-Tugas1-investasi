package menu.customer;

import model.Saham;
import model.SBN;
import model.Customer;
import data.Database;

public class PortofolioHandler {
    public static void jalankan() {
        Customer customer = Database.customer;

        System.out.println("\n=== PORTOFOLIO SAHAM ===");
        for (Saham s : customer.sahamDimiliki.keySet()) {
            int lembar = customer.sahamDimiliki.get(s);
            double beli = lembar * s.getHarga();
            System.out.printf("%s (%s) - %d lembar - Total: Rp %.2f\n", s.getNamaPerusahaan(), s.getKode(), lembar, beli);
        }

        System.out.println("\n=== PORTOFOLIO SBN ===");
        for (SBN sbn : customer.sbnDimiliki.keySet()) {
            double nominal = customer.sbnDimiliki.get(sbn);
            double bunga = (sbn.getBunga() / 12) * 0.9 * nominal;

            System.out.printf("%s - Rp %.2f - Bunga/bulan: Rp %.2f\n", sbn.getNama(), nominal, bunga);
        }
    }
}