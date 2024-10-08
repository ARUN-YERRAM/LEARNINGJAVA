import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        // URL for the MySQL database (adjust as needed)
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "SRBAA";


        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            if (connection != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}




// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
// import java.sql.Statement;
// public class PhoneBookJDBC {
//     public static void main(String[] args) {
//         String jdbcUrl="";
//         String username="use";
//         String password="Hello@123";

//         Connection connection=null;
//         Statement statement=null;


//         try {
//             Class.forName("com.mysql..jdbc.Driver");

//             connection = DriverManager.getConnection(jdbcUrl,username,password);
//             statement = connection.createStatement();
//             String createTableSQL = "CREATE TABLE ProductPhone ("
//                     + "product_id INT PRIMARY KEY, "
//                     + "product_name VARCHAR(40), "
//                     + "brand VARCHAR(40), "
//                     + "model VARCHAR(40), "
//                     + "price INT NOT NULL);";

//             statement.executeUpdate(createTableSQL);
//             System.out.println("Product Phone table created !");

//             String insertValuesSQL = "INSERT INTO ProductPhone VALUES "
//                     + "(1, 'VICTUS Gaming Laptop', 'HP', 'AMD RYZEN 5 with GEFORCE RTX', 60000), "
//                     + "(2, 'Samsung M21', 'Samsung', 'Android', 15000);";statement.execute(insertValuesSQL);

//         } catch (Exception e) {
//             System.out.println("Some Error!");
//         } finally {
//             try {
//                 if (statement != null) statement.close();
//                 if (connection != null) connection.close();
//             } catch (SQLException se) {
//                 System.out.println("SQL Exception");
//             }
//         }
//     }

    
// }







import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
// mysqld --defaults-file="C:\\ProgramData\\MySQL\\MySQL Server X.Y\\my.ini" --init-file=C:\\mysql-init.txt --console

public class CSVToDatabase {
    public static void main(String[] args) {
        String csvFile = "path/to/your/smartphones.csv"; // Update the path to your CSV file
        String jdbcURL = "jdbc:sqlite:smartphones.db";

        try (Connection connection = DriverManager.getConnection(jdbcURL)) {
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();

            String line;
            BufferedReader br = new BufferedReader(new FileReader(csvFile));

            // Skip the header row
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String sql = "INSERT INTO smartphones (brand, model, price, launch_year) VALUES ('"
                        + data[0] + "', '" + data[1] + "', " + data[2] + ", " + data[3] + ")";
                statement.executeUpdate(sql);
            }

            connection.commit();
            statement.close();
            br.close();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}
