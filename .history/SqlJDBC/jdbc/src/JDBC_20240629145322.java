import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.io.*;

public class App {
    static final String DB_URL = "jdbc:mysql://localhost:3306/kl"; // Use existing database 'kl'
    static final String USER = "root";
    static final String PASSS = "12345678";

    public static void main(String[] args) {
        // Step 1: Connect to the existing database and ensure the table exists
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSS);
             Statement stmt = conn.createStatement()) {
            String checkTableSQL = "SHOW TABLES LIKE 'smartphones'";
            var resultSet = stmt.executeQuery(checkTableSQL);
            if (!resultSet.next()) {
                // Table does not exist, create it
                String createTableSQL = "CREATE TABLE smartphones (" +
                        "id INT AUTO_INCREMENT PRIMARY KEY," +
                        "smartphone VARCHAR(2000050)," +
                        "brand VARCHAR(250)," +
                        "model VARCHAR(250)," +
                        "ram VARCHAR(220)," +
                        "storage VARCHAR(220)," +
                        "color VARCHAR(220)," +
                        "free VARCHAR(210)," +
                       // "final_price DECIMAL(10, 2)" +
                        ")";
                stmt.executeUpdate(createTableSQL);
                System.out.println("Table created successfully...");
            } else {
                System.out.println("Table already exists...");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Step 2: Read the CSV file and insert data into the table
        String file = "D://sql1//jdbc//src//smartphones.csv";
        BufferedReader reader = null;
        String line = "";
        String insertSQL = "INSERT INTO smartphones (smartphone, brand, model, ram, storage, color, free) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSS);
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            reader = new BufferedReader(new FileReader(file));
            // Skip the header
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                if (row.length == 7) { // Ensure there are exactly 8 columns in each row
                    pstmt.setString(1, row[0]);
                    pstmt.setString(2, row[1]);
                    pstmt.setString(3, row[2]);
                    pstmt.setString(4, row[3]);
                    pstmt.setString(5, row[4]);
                    pstmt.setString(6, row[5]);
                    pstmt.setString(7, row[6]);
                    pstmt.setString(8, row[7]);
                    pstmt.addBatch();
                }
            }
            pstmt.executeBatch();
            System.out.println("Data inserted successfully...");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}