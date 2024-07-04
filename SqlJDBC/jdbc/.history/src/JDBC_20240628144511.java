;
*;
C {
c void main(String[] args) {
dbcURL = "jdbc:mysql://localhost:3306/product";
sername = "root";
assword = "Swetha12~*";
svFilePath = "smartphones.csv";
on connection = null;

s.forName("com.mysql.cj.jdbc.Driver");
ection = DriverManager.getConnection(jdbcURL, username, password);
reation */
tatement statement = connection.createStatement();
tatement.executeUpdate("CREATE TABLE Smartphones (id INT AUTO_INCREMENT
RIMARY KEY,Smartphone VARCHAR(255),Brand VARCHAR(255),Model VARCHAR(255),RAM
NT,Storage INT,Color VARCHAR(50),Free BOOLEAN,Final_Price DECIMAL(10,
));");
nsertion */
tring sql = "INSERT INTO Smartphones (Smartphone, Brand, Model, RAM,
torage, Color, Free, Final_Price) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
reparedStatement statement = connection.prepareStatement(sql);
ufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
tring lineText = null;
ineReader.readLine();
hile ((lineText = lineReader.readLine()) != null) {
tring[] data = lineText.split(",");
tring smartphone = data[0];
tring brand = data[1];
tring model = data[2];
nt ram;
f(!data[3].equals(""))
am = Integer.parseInt(data[3]);
lse
am = 8;
nt storage;
f(!data[4].equals(""))
torage = Integer.parseInt(data[4]);
lse
torage = 128;
tring color = data[5];
oolean free = data[6].equalsIgnoreCase("Yes");
ouble finalPrice = Double.parseDouble(data[7]);
tatement.setString(1, smartphone);
tatement.setString(2, brand);
tatement.setString(3, model);
tatement.setInt(4, ram);
tatement.setInt(5, storage);
tatement.setString(6, color);
tatement.setBoolean(7, free);
tatement.setDouble(8, finalPrice);
tatement.executeUpdate();
ystem.out.println("Added!");

ineReader.close();
ueries */
ement statement = connection.createStatement();
ltSet rs = statement.executeQuery("SELECT * FROM Smartphones;");
e (rs.next()) {
System.out.println("Smartphone: " + rs.getString(1) + "\nBrand: " + rs.getString(2) + "\nModel: "
        + rs.getString(3) + "\nRAM: " + rs.getInt(4) + "\nStorage: " + rs.getInt(5) + "\nColor: "
        + rs.getString(6) + "\nFree: " + rs.getBoolean(7) + "\nFinal Price: " + rs.getDouble(8)
        + "\n\n");

ection.close();
(Exception ex) {
rintStackTrace();

















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