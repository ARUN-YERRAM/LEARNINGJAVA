import java.sql.*;

public class Main {
    private static final String jdbcURL = "jdbc:mysql://localhost:3306/jdbctest";
    private static final String username = "root";
    private static final String password = "Srikar123*";
    
    private static void createUsersTable(Statement statement) throws Exception{
        statement.executeUpdate("CREATE TABLE Users ("+
        "user_id INT PRIMARY KEY,"+
        "username VARCHAR(50) NOT NULL,"+
        "email VARCHAR(100) NOT NULL);");
        System.out.println("Users table created successfully!");
    }
    private static void createProductsTable(Statement statement) throws Exception{
        statement.executeUpdate("CREATE TABLE Products ("+
        "product_id INT PRIMARY KEY,"+
        "product_name VARCHAR(100) NOT NULL,"+
        "price DECIMAL(10, 2) NOT NULL,"+
        "stock INT NOT NULL);");
        System.out.println("Products table created successfully!");
    }
    private static void createOrdersTable(Statement statement) throws Exception{
        statement.executeUpdate("CREATE TABLE Orders ("+
            "order_id INT PRIMARY KEY AUTO_INCREMENT,"+
            "user_id INT NOT NULL,"+
            "product_id INT NOT NULL,"+
            "quantity INT NOT NULL,"+
            "order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,"+
            "FOREIGN KEY (user_id) REFERENCES Users(user_id),"+
            "FOREIGN KEY (product_id) REFERENCES Products(product_id)"+
        ");");
        System.out.println("Orders table created successfully!");
    }
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, username, password);

            statement = connection.createStatement();
            createUsersTable(statement);
            createProductsTable(statement);
            createOrdersTable(statement);
            
            statement.executeUpdate("INSERT INTO Users (user_id, username, email) VALUES (1, 'Alice', 'alice@example.com'),(2, 'Bob', 'bob@example.com');");

            statement.executeUpdate("INSERT INTO Products (product_id, product_name, price, stock) VALUES (1, 'Laptop', 1000.00, 10), (2, 'Smartphone', 500.00, 20);");

            System.out.println("Values inserted successfully!");
        } catch (Exception e) {
            System.out.println("Some error occured! "+ e);
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (Exception e) {
                System.out.println("Some error occured! " + e);
            }
        }
    }
}
