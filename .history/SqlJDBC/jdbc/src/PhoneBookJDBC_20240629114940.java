import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PhoneBookJDBC {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/ARUN"; // Update with your database name
        String username = "root"; // Correct your username
        String password = "SRBAA1994";

        Connection connection = null;
        Statement statement = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            statement = connection.createStatement();

            // Create the ProductPhone table
            String createTableSQL = "CREATE TABLE customers ("
                    // + "product_id INT PRIMARY KEY, "
                +  "id INT PRIMARY KEY AUTO_INCREMENT",
                + "name VARCHAR(100) NOT NULL",
                + "email VARCHAR(100) NOT NULL",
                + "phone VARCHAR(20) NOT NULL);";
                    // + "product_name VARCHAR(40), "
                    // + "brand VARCHAR(40), "
                    // + "model VARCHAR(40), "
                    // + "price INT NOT NULL);";
            statement.executeUpdate(createTableSQL);
            System.out.println("Product Phone table created!");

            // Insert values into the ProductPhone table
            String insertValuesSQL = "INSERT INTO customers VALUES "
                    // + "(1, 'VICTUS Gaming Laptop', 'HP', 'AMD RYZEN 5 with GEFORCE RTX', 60000), "
                    // + "(2, 'Samsung M21', 'Samsung', 'Android', 15000);";

                    + "('Alice Smith', 'alice.smith@example.com', '555-1234'),"
                    +"('Bob Johnson', 'bob.johnson@example.com', '555-5678'),"
                    +"('Charlie Brown', 'charlie.brown@example.com', '555-8765'),"
                    + "('Diana Prince', 'diana.prince@example.com', '555-4321'),"
                    + +('Edward Norton', 'edward.norton@example.com', '555-9876');"
                    "
            statement.execute(insertValuesSQL);
            System.out.println("Values inserted into ProductPhone table!");

        } catch (Exception e) {
            e.printStackTrace(); // Print the actual exception for debugging
        } finally {
            try {
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}