import java.sql.*;
public class JDBCDML {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String uname = "root";
            String pass = "SRBAA1994";

            connection = DriverManager.getConnection(url, uname, pass);

            if(connection.isClosed()) {
                System.out.println("Not connected.");
            } else {
                System.out.println("Connected to MySQL Successfully!");
            }

            statement = connection.createStatement();

            // statement.executeUpdate("CREATE TABLE Students (ID INT, NAME VARCHAR(20), SECTION CHAR(3));");

            // statement.executeUpdate("INSERT INTO Students VALUES (1, 'SRIKAR', 'IT'),(2, 'MEHER', 'CSE'), (3, 'PRATIEK','IT'),(4,'PHANI','IT');");

            ResultSet rs = statement.executeQuery("SELECT * FROM ;");
            while(rs.next()) {
                System.out.println(rs.getInt("ID")+" "+rs.getString("NAME")+ " " + rs.getString("SECTION"));
            }
            rs.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                connection.close();
                statement.close();
            } catch (Exception e) {
                System.out.println("Some error occured!");
            }
        }
    }
}
