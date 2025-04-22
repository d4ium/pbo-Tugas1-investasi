package menu;

import java.util.Scanner;
import model.Admin;
import model.Customer;
import data.Database;

public class AuthManager {
    public static void login(Scanner scanner) {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        Admin admin = Database.admin;
        Customer customer = Database.customer;

        if (username.equals(admin.getUsername()) && admin.checkPassword(password)) {
            MenuAdmin.tampilkan(scanner);
        } else if (username.equals(customer.getUsername()) && customer.checkPassword(password)) {
            MenuCustomer.tampilkan(scanner);
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }
    }
}
