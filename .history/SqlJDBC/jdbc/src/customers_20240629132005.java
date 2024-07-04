import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


// 1.create the customers table and populate it with some sample data.
// 2. -- Create the 'customers' table
// CREATE TABLE customers (
    // id INT PRIMARY KEY AUTO_INCREMENT,
    // name VARCHAR(100) NOT NULL,
    // email VARCHAR(100) NOT NULL,
    // phone VARCHAR(20) NOT NULL
// );
// 
// -- Insert sample data into the 'customers' table
// INSERT INTO customers (name, email, phone) VALUES
// ('Alice Smith', 'alice.smith@example.com', '555-1234'),
// ('Bob Johnson', 'bob.johnson@example.com', '555-5678'),
// ('Charlie Brown', 'charlie.brown@example.com', '555-8765'),
// ('Diana Prince', 'diana.prince@example.com', '555-4321'),
// ('Edward Norton', 'edward.norton@example.com', '555-9876'),
// ('Fiona Gallagher', 'fiona.gallagher@example.com', '555-1111'),
// ('George Michael', 'george.michael@example.com', '555-2222'),
// ('Hannah Baker', 'hannah.baker@example.com', '555-3333'),
// ('Isaac Newton', 'isaac.newton@example.com', '555-4444'),
// ('Jessica Jones', 'jessica.jones@example.com', '555-5555'),
// ('Kevin Bacon', 'kevin.bacon@example.com', '555-6666'),
// ('Lara Croft', 'lara.croft@example.com', '555-7777'),
// ('Michael Scott', 'michael.scott@example.com', '555-8888'),
// ('Nancy Drew', 'nancy.drew@example.com', '555-9999'),
// ('Oscar Wilde', 'oscar.wilde@example.com', '555-0000'),
// ('Pam Beesly', 'pam.beesly@example.com', '555-1010'),
// ('Quentin Tarantino', 'quentin.tarantino@example.com', '555-2020'),
// ('Rachel Green', 'rachel.green@example.com', '555-3030'),
// ('Steve Rogers', 'steve.rogers@example.com', '555-4040'),
// ('Tony Stark', 'tony.stark@example.com', '555-5050');
// You are tasked with developing a Customer Records Management System for a company. The system should allow customer service representatives to view and navigate through customer records stored in a MySQL database. The system must provide functionality to:
// 1.	Display the first customer record when the application starts.
// 2.	Allow navigation to the next, previous, first, or last customer record.
// 3.	Display appropriate messages when trying to navigate beyond the available records.
// 4.	Allow the user to exit the application.
// Requirements
// 1.	Display Customer Details: When navigating through the records, display the customer's ID, name, email, and phone number.
// 2.	Navigation Commands:
// o	[N]ext: Move to the next record.
// o	[P]revious: Move to the previous record.
// o	[F]irst: Move to the first record.
// o	[L]ast: Move to the last record.
// o	[E]xit: Exit the application.
// o	[I]nsert: Insert a new record
// o	[D]elete: Delete the record
// 3.	Error Handling: Display appropriate messages when attempting to navigate past the first or last record.
// 

// public class customers {
//     public static void main(String[] args) {
//         String jdbcUrl = "jdbc:mysql://localhost:3306/exam"; // Update with your database name
//         String username = "root"; // Correct your username
//         String password = "SRBAA1994";

//         Connection connection = null;
//         Statement statement = null;

//         try {
//             // Load the MySQL JDBC driver
//             Class.forName("com.mysql.cj.jdbc.Driver");

//             // Establish a connection
//             connection = DriverManager.getConnection(jdbcUrl, username, password);
//             statement = connection.createStatement();

//             // Create the ProductPhone table
//             String createTableSQL = "CREATE TABLE customers ("
//                     // + "product_id INT PRIMARY KEY, "
//                 +  "id INT PRIMARY KEY AUTO_INCREMENT,"
//                 + "name VARCHAR(100) NOT NULL,"
//                 + "email VARCHAR(100) NOT NULL,"
//                 + "phone VARCHAR(20) NOT NULL);";
//                     // + "product_name VARCHAR(40), "
//                     // + "brand VARCHAR(40), "
//                     // + "model VARCHAR(40), "
//                     // + "price INT NOT NULL);";
//             statement.executeUpdate(createTableSQL);
//             System.out.println("Product customers table created!");

//             // Insert values into the ProductPhone table
//             String insertValuesSQL = "INSERT INTO customers VALUES "
//                     // + "(1, 'VICTUS Gaming Laptop', 'HP', 'AMD RYZEN 5 with GEFORCE RTX', 60000), "
//                     // + "(2, 'Samsung M21', 'Samsung', 'Android', 15000);";

//                     + "('Alice Smith', 'alice.smith@example.com', '555-1234'),"
//                     +"('Bob Johnson', 'bob.johnson@example.com', '555-5678'),"
//                     +"('Charlie Brown', 'charlie.brown@example.com', '555-8765'),"
//                     + "('Diana Prince', 'diana.prince@example.com', '555-4321'),"
//                     + "('Edward Norton', 'edward.norton@example.com', '555-9876'),"
//                     + "('Fiona Gallagher', 'fiona.gallagher@example.com', '555-1111'),"
//                     + "('George Michael', 'george.michael@example.com', '555-2222'),"
//                     + "('Hannah Baker', 'hannah.baker@example.com', '555-3333'),"
//                     + "('Isaac Newton', 'isaac.newton@example.com', '555-4444'),"
//                     + "('Jessica Jones', 'jessica.jones@example.com', '555-5555'),"
//                     + "('Kevin Bacon', 'kevin.bacon@example.com', '555-6666'),"
//                     + "('Lara Croft', 'lara.croft@example.com', '555-7777'),"
//                     + "('Michael Scott', 'michael.scott@example.com', '555-8888'),"
//                     + "('Nancy Drew', 'nancy.drew@example.com', '555-9999'),"
//                     + "('Oscar Wilde', 'oscar.wilde@example.com', '555-0000'),"
//                     + "('Pam Beesly', 'pam.beesly@example.com', '555-1010'),"
//                     + "('Quentin Tarantino', 'quentin.tarantino@example.com', '555-2020'),"
//                     + "('Rachel Green', 'rachel.green@example.com', '555-3030'),"
//                     + "('Steve Rogers', 'steve.rogers@example.com', '555-4040'),"
//                     + "('Tony Stark', 'tony.stark@example.com', '555-5050');";
//             statement.execute(insertValuesSQL);
//             System.out.println("Values inserted into customers table!");

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




import java.io.*;
import java.sql.*;

public class customers {
    public static void main(String[] args) {
       String jdbcUrl = "jdbc:mysql://localhost:3306/exam"; // Update with your database namelocalhost:3306/";
        String username = "root"; // Correct your username
        String password = "SRBAA1994";

        String csvFilePath = "smartphones.csv";

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            /* Creation */
            Statement statement = connection.createStatement();
            System.out.println("Connected");
        }
        //     statement.executeUpdate("CREATE TABLE IF NOT EXISTS Smartphones (" +
        //             "id INT AUTO_INCREMENT PRIMARY KEY, " +
        //             "Smartphone VARCHAR(255), " +
        //             "Brand VARCHAR(255), " +
        //             "Model VARCHAR(255), " +
        //             "RAM INT, " +
        //             "Storage INT, " +
        //             "Color VARCHAR(50), " +
        //             "Free BOOLEAN, " +
        //             "Final_Price DECIMAL(10, 2)" +
        //             ");");

        //     /* Insertion */
        //     String sql = "INSERT INTO Smartphones (Smartphone, Brand, Model, RAM, Storage, Color, Free, Final_Price) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        //     PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //     BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
        //     String lineText = null;

        //     lineReader.readLine(); // Skip header line

        //     while ((lineText = lineReader.readLine()) != null) {
        //         String[] data = lineText.split(",");

        //         String smartphone = data[0];
        //         String brand = data[1];
        //         String model = data[2];
        //         int ram = data[3].isEmpty() ? 8 : Integer.parseInt(data[3]);
        //         int storage = data[4].isEmpty() ? 128 : Integer.parseInt(data[4]);
        //         String color = data[5];
        //         boolean free = data[6].equalsIgnoreCase("Yes");
        //         double finalPrice = Double.parseDouble(data[7]);

        //         preparedStatement.setString(1, smartphone);
        //         preparedStatement.setString(2, brand);
        //         preparedStatement.setString(3, model);
        //         preparedStatement.setInt(4, ram);
        //         preparedStatement.setInt(5, storage);
        //         preparedStatement.setString(6, color);
        //         preparedStatement.setBoolean(7, free);
        //         preparedStatement.setDouble(8, finalPrice);
        //         preparedStatement.executeUpdate();
        //         System.out.println("Added!");
        //     }

        //     lineReader.close();

        //     /* Queries */
        //     // a. Total number of iPhones
        //     ResultSet rs1 = statement.executeQuery("SELECT COUNT(*) AS total_iphones FROM Smartphones WHERE Brand = 'Apple'");
            
        //     if (rs1.next()) {
                
        //         System.out.println("Total number of iPhones: " + rs1.getInt("total_iphones"));
        //     }
        //     System.out.println("A");

        //     // b. Phone names of all phones within 500 along with model number
        //     ResultSet rs2 = statement.executeQuery("SELECT Smartphone, Model FROM Smartphones WHERE Final_Price <= 500");
        //     System.out.println("Phones within 500 along with model number:");
           
        //     while (rs2.next()) {
                
        //         System.out.println("Phone: " + rs2.getString("Smartphone") + ", Model: " + rs2.getString("Model"));
        //     }
        //     System.out.println("B");

        //     // c. All models belonging to the brand Samsung
        //     ResultSet rs3 = statement.executeQuery("SELECT Model FROM Smartphones WHERE Brand = 'Samsung'");
        //     System.out.println("All models belonging to brand Samsung:");
            
        //     while (rs3.next()) {
                
        //         System.out.println("Model: " + rs3.getString("Model"));
        //     }
        //     System.out.println("C");

        //     // d. The cheapest phone in Nothing brand
        //     ResultSet rs4 = statement.executeQuery("SELECT Smartphone, Final_Price FROM Smartphones WHERE Brand = 'Nothing' ORDER BY Final_Price ASC LIMIT 1");
            
        //     if (rs4.next()) {
                
        //         System.out.println("The cheapest phone in Nothing brand: " + rs4.getString("Smartphone") + " at price " + rs4.getDouble("Final_Price"));
        //     }
        //     System.out.println("D");

        //     // e. Sorted phones in the order of price range
        //     ResultSet rs5 = statement.executeQuery("SELECT Smartphone, Final_Price FROM Smartphones ORDER BY Final_Price");
        //     System.out.println("Sorted phones in the order of price range:");
           
        //     while (rs5.next()) {
        //         System.out.println("Phone: " + rs5.getString("Smartphone") + ", Price: " + rs5.getDouble("Final_Price"));
        //     }
        //     System.out.println("E");

        //     connection.close();

        // } catch (Exception ex) {
        //     ex.printStackTrace();
        // }
    }
}