package menu.admin;

import model.Saham;
import data.Database;

import java.util.Scanner;

public class TambahSahamHandler {
    public static void jalankan(Scanner scanner) {
        System.out.print("Kode Saham: ");
        String kode = scanner.nextLine();
        System.out.print("Nama Perusahaan: ");
        String nama = scanner.nextLine();
        System.out.print("Harga Saham: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();

        Saham saham = new Saham(kode, nama, harga);
        Database.daftarSaham.add(saham);
        System.out.println("Saham berhasil ditambahkan!");
    }
}