package menu.admin;

import model.SBN;
import data.Database;

import java.util.Scanner;

public class TambahSBNHandler {
    public static void jalankan(Scanner scanner) {
        System.out.print("Nama SBN: ");
        String nama = scanner.nextLine();
        System.out.print("Bunga (% per tahun): ");
        double bunga = scanner.nextDouble();
        System.out.print("Jangka waktu (bulan): ");
        int jangkaWaktu = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tanggal jatuh tempo (DD/MM/YYYY): ");
        String jatuhTempo = scanner.nextLine();
        System.out.print("Kuota Nasional: ");
        double kuota = scanner.nextDouble();
        scanner.nextLine();

        SBN sbn = new SBN(nama, bunga, jangkaWaktu, jatuhTempo, kuota);
        Database.daftarSBN.add(sbn);
        System.out.println("SBN berhasil ditambahkan!");
    }
}