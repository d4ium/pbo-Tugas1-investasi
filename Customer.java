import java.util.HashMap;
import java.util.Map;

public class Customer extends User {
    // Portofolio Saham dan SBN
    public Map<Saham, Integer> sahamDimiliki = new HashMap<>();
    public Map<SBN, Double> sbnDimiliki = new HashMap<>();

    public Customer(String username, String password) {
        super(username, password);
    }

    // rember tambah beli/jual saham, beli/simulasi SBN, lihat portofolio
}
