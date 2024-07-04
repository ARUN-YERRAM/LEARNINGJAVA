import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class learning {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection
            String url = "jdbc:mysql://localhost:3306/learningjdbc";
            String username = "root";
            String password = "SRBAA1994";
            Connection con = DriverManager.getConnection(url, username, password);

            // Define the SQL query to create a table
            String query = "CREATE TABLE t1 (
            " + "tID INT(20) PRIMARY KEY AUTO_INCREMENT, " + "tName VARCHAR(20) NOT NULL, " + "tCity VARCHAR(4000))" ";

            // Create a statement
            Statement stmt = con.createStatement();

            // Execute the SQL query to create the table
            stmt.executeUpdate(query);

            System.out.println("Table created in database.");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
