import java.io.*;
import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/product";
        String username = "root";
        String password = "Swetha12~*";

        String csvFilePath = "smartphones.csv";

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, username, password);
            /* Creation */
            // Statement statement = connection.createStatement();
            // statement.executeUpdate("CREATE TABLE Smartphones (id INT AUTO_INCREMENT
            // PRIMARY KEY,Smartphone VARCHAR(255),Brand VARCHAR(255),Model VARCHAR(255),RAM
            // INT,Storage INT,Color VARCHAR(50),Free BOOLEAN,Final_Price DECIMAL(10,
            // 2));");

            /* Insertion */
            // String sql = "INSERT INTO Smartphones (Smartphone, Brand, Model, RAM,
            // Storage, Color, Free, Final_Price) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            // PreparedStatement statement = connection.prepareStatement(sql);
            // BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
            // String lineText = null;

            // lineReader.readLine();

            // while ((lineText = lineReader.readLine()) != null) {
            // String[] data = lineText.split(",");

            // String smartphone = data[0];
            // String brand = data[1];
            // String model = data[2];
            // int ram;
            // if(!data[3].equals(""))
            // ram = Integer.parseInt(data[3]);
            // else
            // ram = 8;
            // int storage;
            // if(!data[4].equals(""))
            // storage = Integer.parseInt(data[4]);
            // else
            // storage = 128;
            // String color = data[5];
            // boolean free = data[6].equalsIgnoreCase("Yes");
            // double finalPrice = Double.parseDouble(data[7]);

            // statement.setString(1, smartphone);
            // statement.setString(2, brand);
            // statement.setString(3, model);
            // statement.setInt(4, ram);
            // statement.setInt(5, storage);
            // statement.setString(6, color);
            // statement.setBoolean(7, free);
            // statement.setDouble(8, finalPrice);
            // statement.executeUpdate();
            // System.out.println("Added!");
            // }

            // lineReader.close();

            /* Queries */
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Smartphones;");
            while (rs.next()) {
                System.out.println("Smartphone: " + rs.getString(1) + "\nBrand: " + rs.getString(2) + "\nModel: "
                        + rs.getString(3) + "\nRAM: " + rs.getInt(4) + "\nStorage: " + rs.getInt(5) + "\nColor: "
                        + rs.getString(6) + "\nFree: " + rs.getBoolean(7) + "\nFinal Price: " + rs.getDouble(8)
                        + "\n\n");
            }
            connection.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
















// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
// import java.sql.Statement;

// public class PhoneBookJDBC {
//     public static void main(String[] args) {
//         String jdbcUrl = "jdbc:mysql://localhost:3306/product"; // Update with your database name
//         String username = "root"; // Correct your username
//         String password = "Swetha12~";

//         Connection connection = null;
//         Statement statement = null;

//         try {
//             // Load the MySQL JDBC driver
//             Class.forName("com.mysql.cj.jdbc.Driver");

//             // Establish a connection
//             connection = DriverManager.getConnection(jdbcUrl, username, password);
//             statement = connection.createStatement();

//             // Create the ProductPhone table
//             String createTableSQL = "CREATE TABLE ProductPhone ("
//                     + "product_id INT PRIMARY KEY, "
//                     + "product_name VARCHAR(40), "
//                     + "brand VARCHAR(40), "
//                     + "model VARCHAR(40), "
//                     + "price INT NOT NULL);";
//             statement.executeUpdate(createTableSQL);
//             System.out.println("Product Phone table created!");

//             // Insert values into the ProductPhone table
//             String insertValuesSQL = "INSERT INTO ProductPhone VALUES "
//                     + "(1, 'VICTUS Gaming Laptop', 'HP', 'AMD RYZEN 5 with GEFORCE RTX', 60000), "
//                     + "(2, 'Samsung M21', 'Samsung', 'Android', 15000);";
//             statement.execute(insertValuesSQL);
//             System.out.println("Values inserted into ProductPhone table!");

//         } catch (Exception e) {
//             e.printStackTrace(); // Print the actual exception for debugging
//         } finally {
//             try {
//                 if (statement != null)
//                     statement.close();
//                 if (connection != null)
//                     connection.close();
//             } catch (SQLException se) {
//                 se.printStackTrace();
//             }
//         }
//     }
// }