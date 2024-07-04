import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class customers{
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/exam"; // Update with your database name
        String username = "root"; // Correct your username
        String password = "SRBAA1994"; // Correct your password

        Connection connection = null;
        Statement statement = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            statement = connection.createStatement();

            // Create the customers table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS customers ("
                + "id INT PRIMARY KEY AUTO_INCREMENT, "
                + "name VARCHAR(100) NOT NULL, "
                + "email VARCHAR(100) NOT NULL, "
                + "phone VARCHAR(20) NOT NULL"
                + ");";
            statement.executeUpdate(createTableSQL);
            System.out.println("Customers table created!");

            // Insert sample data into the customers table
            String insertValuesSQL = "INSERT INTO customers (name, email, phone) VALUES "
                + "('Alice Smith', 'alice.smith@example.com', '555-1234'), "
                + "('Bob Johnson', 'bob.johnson@example.com', '555-5678'), "
                + "('Charlie Brown', 'charlie.brown@example.com', '555-8765'), "
                + "('Diana Prince', 'diana.prince@example.com', '555-4321'), "
                + "('Edward Norton', 'edward.norton@example.com', '555-9876'), "
                + "('Fiona Gallagher', 'fiona.gallagher@example.com', '555-1111'), "
                + "('George Michael', 'george.michael@example.com', '555-2222'), "
                + "('Hannah Baker', 'hannah.baker@example.com', '555-3333'), "
                + "('Isaac Newton', 'isaac.newton@example.com', '555-4444'), "
                + "('Jessica Jones', 'jessica.jones@example.com', '555-5555'), "
                + "('Kevin Bacon', 'kevin.bacon@example.com', '555-6666'), "
                + "('Lara Croft', 'lara.croft@example.com', '555-7777'), "
                + "('Michael Scott', 'michael.scott@example.com', '555-8888'), "
                + "('Nancy Drew', 'nancy.drew@example.com', '555-9999'), "
                + "('Oscar Wilde', 'oscar.wilde@example.com', '555-0000'), "
                + "('Pam Beesly', 'pam.beesly@example.com', '555-1010'), "
                + "('Quentin Tarantino', 'quentin.tarantino@example.com', '555-2020'), "
                + "('Rachel Green', 'rachel.green@example.com', '555-3030'), "
                + "('Steve Rogers', 'steve.rogers@example.com', '555-4040'), "
                + "('Tony Stark', 'tony.stark@example.com', '555-5050');";
            statement.executeUpdate(insertValuesSQL);
            System.out.println("Values inserted into customers table!");

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
