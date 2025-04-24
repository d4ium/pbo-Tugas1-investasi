package menu.customer;

import model.SBN;
import model.Customer;
import data.Database;

import java.util.Scanner;

public class BeliSBNHandler {
    public static void jalankan(Scanner scanner) {
        if (Database.daftarSBN.isEmpty()) {
            System.out.println("Tidak ada SBN tersedia.");
            return;
        }

        System.out.println("\n=== Daftar SBN Tersedia ===");
        for (int i = 0; i < Database.daftarSBN.size(); i++) {
            SBN sbn = Database.daftarSBN.get(i);
            System.out.printf("%d. %s - Kuota: Rp %.2f\n", i + 1, sbn.getNama(), sbn.getKuotaNasional());
        }

        System.out.print("Pilih nomor SBN: ");
        int pilihan = scanner.nextInt() - 1;
        scanner.nextLine();

        if (pilihan < 0 || pilihan >= Database.daftarSBN.size()) {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        SBN sbn = Database.daftarSBN.get(pilihan);
        System.out.print("Masukkan nominal pembelian: ");
        double nominal = scanner.nextDouble();
        scanner.nextLine();

        if (nominal > sbn.getKuotaNasional()) {
            System.out.println("Kuota tidak mencukupi.");
            return;
        }

        Customer customer = Database.customer;
        double sebelumnya = customer.sbnDimiliki.getOrDefault(sbn, 0.0);
        customer.sbnDimiliki.put(sbn, sebelumnya + nominal);
        sbn.setKuotaNasional(sbn.getKuotaNasional() - nominal);

        System.out.println("Pembelian SBN berhasil!");
    }
}