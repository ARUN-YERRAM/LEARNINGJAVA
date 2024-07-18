import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class JDBC {

    private static final String jdbcURL = "jdbc:mysql://localhost:3306/jdbctest";
    private static final String username = "root";
    private static final String password = "Srikar123*";
    private static final String csvFilePath = "smartphones.csv";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = getConnection();
            createTable(connection);
            insertData(connection, csvFilePath);
            displayMenu(connection);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(jdbcURL, username, password);
    }

    private static void createTable(Connection connection) throws SQLException {
        /*
        Statement statement = connection.createStatement();
        statement.executeUpdate("CREATE TABLE Smartphones (id INT AUTO_INCREMENT PRIMARY KEY, Smartphone VARCHAR(255), Brand VARCHAR(255), Model VARCHAR(255), RAM INT, Storage INT, Color VARCHAR(50), Free BOOLEAN, Final_Price DECIMAL(10, 2));");
        */
    }

    private static void insertData(Connection connection, String csvFilePath) throws SQLException, IOException {
        /*
        String sql = "INSERT INTO Smartphones (Smartphone, Brand, Model, RAM, Storage, Color, Free, Final_Price) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
        String lineText = null;

        lineReader.readLine(); // Skip header line

        while ((lineText = lineReader.readLine()) != null) {
            String[] data = lineText.split(",");

            String smartphone = data[0];
            String brand = data[1];
            String model = data[2];
            int ram = data[3].isEmpty() ? 8 : Integer.parseInt(data[3]);
            int storage = data[4].isEmpty() ? 128 : Integer.parseInt(data[4]);
            String color = data[5];
            boolean free = data[6].equalsIgnoreCase("Yes");
            double finalPrice = Double.parseDouble(data[7]);

            statement.setString(1, smartphone);
            statement.setString(2, brand);
            statement.setString(3, model);
            statement.setInt(4, ram);
            statement.setInt(5, storage);
            statement.setString(6, color);
            statement.setBoolean(7, free);
            statement.setDouble(8, finalPrice);
            statement.executeUpdate();
            System.out.println("Added!");
        }

        lineReader.close();
        */
    }

    private static void displayMenu(Connection connection) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a query to execute:");
        System.out.println("1. Total number of iPhones");
        System.out.println("2. Phone names and model numbers of all phones within 500");
        System.out.println("3. All models belonging to brand Samsung");
        System.out.println("4. The cheapest phone in Nothing brand");
        System.out.println("5. Sorted phones in the order of price range");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                queryTotalNumberOfIPhones(connection);
                break;
            case 2:
                queryPhonesWithinPriceRange(connection);
                break;
            case 3:
                querySamsungModels(connection);
                break;
            case 4:
                queryCheapestNothingPhone(connection);
                break;
            case 5:
                querySortedPhonesByPrice(connection);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }

        scanner.close();
    }

    private static void queryTotalNumberOfIPhones(Connection connection) throws SQLException {
        String sql = "SELECT COUNT(*) AS total FROM Smartphones WHERE Brand = 'Apple'";
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {

            if (rs.next()) {
                System.out.println("Total number of iPhones: " + rs.getInt("total"));
            }
        }
    }

    private static void queryPhonesWithinPriceRange(Connection connection) throws SQLException {
        String sql = "SELECT Smartphone, Model FROM Smartphones WHERE Final_Price <= 500";
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("Smartphone: " + rs.getString("Smartphone") + 
                                   ", Model: " + rs.getString("Model"));
            }
        }
    }

    private static void querySamsungModels(Connection connection) throws SQLException {
        String sql = "SELECT DISTINCT Model FROM Smartphones WHERE Brand = 'Samsung'";
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("Model: " + rs.getString("Model"));
            }
        }
    }

    private static void queryCheapestNothingPhone(Connection connection) throws SQLException {
        String sql = "SELECT Smartphone, Model, Final_Price FROM Smartphones WHERE Brand = 'Nothing' ORDER BY Final_Price ASC LIMIT 1";
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {

            if (rs.next()) {
                System.out.println("Cheapest Nothing Phone:");
                System.out.println("Smartphone: " + rs.getString("Smartphone") +
                                   ", Model: " + rs.getString("Model") +
                                   ", Price: " + rs.getBigDecimal("Final_Price"));
            }
        }
    }

    private static void querySortedPhonesByPrice(Connection connection) throws SQLException {
        String sql = "SELECT Smartphone, Model, Final_Price FROM Smartphones ORDER BY Final_Price";
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("Smartphone: " + rs.getString("Smartphone") +
                                   ", Model: " + rs.getString("Model") +
                                   ", Price: " + rs.getBigDecimal("Final_Price"));
            }
        }
    }
}
