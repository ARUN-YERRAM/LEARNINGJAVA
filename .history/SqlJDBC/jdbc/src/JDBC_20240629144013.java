import java.io.*;
import java.sql.*;

public class jDBC {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/arun";
        String username = "root";
        String password = "SRBAA1994";

        String csvFilePath = "smartphones.csv";

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, username, password);

            /* Creation */
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS Smartphones (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "Smartphone VARCHAR(255), " +
                    "Brand VARCHAR(255), " +
                    "Model VARCHAR(255), " +
                    "RAM INT, " +
                    "Storage INT, " +
                    "Color VARCHAR(50), " +
                    "Free BOOLEAN, " +
                    "Final_Price DECIMAL(10, 2)" +
                    ");");

            /* Insertion */
            String sql = "INSERT INTO Smartphones (Smartphone, Brand, Model, RAM, Storage, Color, Free, Final_Price) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
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

                preparedStatement.setString(1, smartphone);
                preparedStatement.setString(2, brand);
                preparedStatement.setString(3, model);
                preparedStatement.setInt(4, ram);
                preparedStatement.setInt(5, storage);
                preparedStatement.setString(6, color);
                preparedStatement.setBoolean(7, free);
                preparedStatement.setDouble(8, finalPrice);
                preparedStatement.executeUpdate();
                System.out.println("Added!");
            }

            lineReader.close();

            /* Queries */
            // a. Total number of iPhones
            ResultSet rs1 = statement.executeQuery("SELECT COUNT(*) AS total_iphones FROM Smartphones WHERE Brand = 'Apple'");
            
            if (rs1.next()) {
                
                System.out.println("Total number of iPhones: " + rs1.getInt("total_iphones"));
            }
            System.out.println("A");

            // b. Phone names of all phones within 500 along with model number
            ResultSet rs2 = statement.executeQuery("SELECT Smartphone, Model FROM Smartphones WHERE Final_Price <= 500");
            System.out.println("Phones within 500 along with model number:");
           
            while (rs2.next()) {
                
                System.out.println("Phone: " + rs2.getString("Smartphone") + ", Model: " + rs2.getString("Model"));
            }
            System.out.println("B");

            // c. All models belonging to the brand Samsung
            ResultSet rs3 = statement.executeQuery("SELECT Model FROM Smartphones WHERE Brand = 'Samsung'");
            System.out.println("All models belonging to brand Samsung:");
            
            while (rs3.next()) {
                
                System.out.println("Model: " + rs3.getString("Model"));
            }
            System.out.println("C");

            // d. The cheapest phone in Nothing brand
            ResultSet rs4 = statement.executeQuery("SELECT Smartphone, Final_Price FROM Smartphones WHERE Brand = 'Nothing' ORDER BY Final_Price ASC LIMIT 1");
            
            if (rs4.next()) {
                
                System.out.println("The cheapest phone in Nothing brand: " + rs4.getString("Smartphone") + " at price " + rs4.getDouble("Final_Price"));
            }
            System.out.println("D");

            // e. Sorted phones in the order of price range
            ResultSet rs5 = statement.executeQuery("SELECT Smartphone, Final_Price FROM Smartphones ORDER BY Final_Price");
            System.out.println("Sorted phones in the order of price range:");
           
            while (rs5.next()) {
                System.out.println("Phone: " + rs5.getString("Smartphone") + ", Price: " + rs5.getDouble("Final_Price"));
            }
            System.out.println("E");

            connection.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}