import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

// Drug class representing a drug in the pharmacy
class Drug {
    private String name;
    private String code;
    private List<Supplier> suppliers;
    private List<PurchaseHistory> purchaseHistory;

    public Drug(String name, String code) {
        this.name = name;
        this.code = code;
        this.suppliers = new ArrayList<>();
        this.purchaseHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public List<PurchaseHistory> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void addSupplier(Supplier supplier) {
        suppliers.add(supplier);
    }

    public void addPurchaseHistory(PurchaseHistory history) {
        purchaseHistory.add(history);
    }
}

// Supplier class representing a supplier of drugs
class Supplier {
    private String name;
    private String location;

    public Supplier(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}

// PurchaseHistory class representing a purchase history entry
class PurchaseHistory {
    private Date purchaseDate;
    private String buyer;
    private double amount;

    public PurchaseHistory(Date purchaseDate, String buyer, double amount) {
        this.purchaseDate = purchaseDate;
        this.buyer = buyer;
        this.amount = amount;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public String getBuyer() {
        return buyer;
    }

    public double getAmount() {
        return amount;
    }
}

// DatabaseHandler class for managing database connections and operations
class DatabaseHandler {
    private static final String DATABASE_URL = "jdbc:sqlite:pharmacy.db";

    static {
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("SQLite JDBC driver loaded successfully.");
        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC driver not found.");
            e.printStackTrace();
        }
    }

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DATABASE_URL);
        } catch (SQLException e) {
            System.out.println("Connection to SQLite database failed.");
            e.printStackTrace();
        }
        return conn;
    }

    public static void createNewDatabase() {
        try (Connection conn = DriverManager.getConnection(DATABASE_URL)) {
            if (conn != null) {
                System.out.println("A new database has been created.");
            }
        } catch (SQLException e) {
            System.out.println("Failed to create new database.");
            e.printStackTrace();
        }
    }

    public static void createTables() {
        String sqlDrugs = "CREATE TABLE IF NOT EXISTS drugs (id INTEGER PRIMARY KEY, name TEXT NOT NULL, code TEXT NOT NULL)";
        String sqlSuppliers = "CREATE TABLE IF NOT EXISTS suppliers (id INTEGER PRIMARY KEY, name TEXT NOT NULL, location TEXT NOT NULL)";
        String sqlPurchases = "CREATE TABLE IF NOT EXISTS purchases (id INTEGER PRIMARY KEY, drug_id INTEGER, purchase_date TEXT, buyer TEXT, amount REAL, FOREIGN KEY(drug_id) REFERENCES drugs(id))";

        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            stmt.execute(sqlDrugs);
            stmt.execute(sqlSuppliers);
            stmt.execute(sqlPurchases);
            System.out.println("Tables created successfully.");
        } catch (SQLException e) {
            System.out.println("Failed to create tables.");
            e.printStackTrace();
        }
    }
}

// Main class for managing the pharmacy system
public class PharmacyManagementSystem {
    private List<Drug> drugs;

    public PharmacyManagementSystem() {
        drugs = new ArrayList<>();
    }

    public void addDrug(Drug drug) {
        drugs.add(drug);
    }

    public Drug searchDrug(String name) {
        for (Drug drug : drugs) {
            if (drug.getName().equalsIgnoreCase(name)) {
                return drug;
            }
        }
        return null;
    }

    public List<Drug> viewAllDrugs() {
        return drugs;
    }

    public void viewPurchaseHistory(String drugName) {
        Drug drug = searchDrug(drugName);
        if (drug != null) {
            for (PurchaseHistory history : drug.getPurchaseHistory()) {
                System.out.println("Date: " + history.getPurchaseDate() + ", Buyer: " + history.getBuyer() + ", Amount: " + history.getAmount());
            }
        } else {
            System.out.println("Drug not found!");
        }
    }

    public static void main(String[] args) {
        // Initialize the pharmacy management system
        PharmacyManagementSystem system = new PharmacyManagementSystem();

        // Create sample drugs and suppliers
        Drug drug1 = new Drug("Paracetamol", "P001");
        Drug drug2 = new Drug("Aspirin", "A001");

        Supplier supplier1 = new Supplier("ABC Pharma", "New York");
        Supplier supplier2 = new Supplier("XYZ Pharma", "Los Angeles");

        // Add suppliers to drugs
        drug1.addSupplier(supplier1);
        drug2.addSupplier(supplier2);

        // Add drugs to the system
        system.addDrug(drug1);
        system.addDrug(drug2);

        // View all drugs and their suppliers
        system.viewAllDrugs().forEach(drug -> {
            System.out.println("Drug: " + drug.getName() + ", Code: " + drug.getCode());
            drug.getSuppliers().forEach(supplier -> {
                System.out.println("  Supplier: " + supplier.getName() + ", Location: " + supplier.getLocation());
            });
        });

        // View purchase history of a specific drug
        system.viewPurchaseHistory("Paracetamol");

        // Database operations
        DatabaseHandler.createNewDatabase();
        DatabaseHandler.createTables();
    }
}
