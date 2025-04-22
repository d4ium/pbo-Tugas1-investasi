package data;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Saham> daftarSaham = new ArrayList<>();
    public static List<SBN> daftarSBN = new ArrayList<>();

    public static Admin admin = new Admin("admin", "admin123");
    public static Customer customer = new Customer("user", "user123");
}