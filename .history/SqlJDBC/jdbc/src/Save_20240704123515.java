import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class Save {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/arundb";
        String username = "root";
        String password = "SRBAA1994";

        Connection connection = null;

        try {
            // Establishing a connection
            connection = DriverManager.getConnection(jdbcURL, username, password);
            // Set auto-commit to false
            connection.setAutoCommit(false);

            // Create a statement
            PreparedStatement pstmt1 = connection.prepareStatement("INSERT INTO employees (name, position) VALUES (?, ?)");
            pstmt1.setString(1, "John Doe");
            pstmt1.setString(2, "Manager");
            pstmt1.executeUpdate();

            // Set a savepoint
            Savepoint savepoint1 = connection.setSavepoint("Savepoint1");

            // Another statement
            PreparedStatement pstmt2 = connection.prepareStatement("INSERT INTO employees (name, position) VALUES (?, ?)");
            pstmt2.setString(1, "Jane Doe");
            pstmt2.setString(2, "Developer");
            pstmt2.executeUpdate();

            // Rollback to the savepoint if needed
            // connection.rollback(savepoint1);

            // Commit the transaction
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (connection != null) {
                    // Rollback the transaction if any error occurs
                    connection.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
