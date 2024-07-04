
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/arun";
    private static final String USER = "root";
    private static final String PASS = "SRBAA1994";

    private Connection conn;
    private Statement stmt;
    private ResultSet rs;

    public JDBC() {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery("SELECT * FROM customers");
            if (rs.next()) {
                displayRecord();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void displayRecord() throws SQLException {
        System.out.println("id: " + rs.getInt("id"));
        System.out.println("Name: " + rs.getString("name"));
        System.out.println("Email: " + rs.getString("email"));
        System.out.println("Phone: " + rs.getString("phone"));
    }

    private void navigate(String command) {
        try {
            switch (command.toUpperCase()) {
                case "N":
                    if (rs.next()) {
                        displayRecord();
                    } else {
                        System.out.println("No more records.");
                    }
                    break;
                case "P":
                    if (rs.previous()) {
                        displayRecord();
                    } else {
                        System.out.println("This is the first record.");
                    }
                    break;
                case "F":
                    if (rs.first()) {
                        displayRecord();
                    }
                    break;
                case "L":
                    if (rs.last()) {
                        displayRecord();
                    }
                    break;
                case "I":
                    insertRecord();
                    break;
                case "D":
                    deleteRecord();
                    break;
                case "E":
                    close();
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void insertRecord() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Email:");
            String email = scanner.nextLine();

            System.out.println("Enter Phone Number:");
            
            String phone = scanner.nextLine();

            rs.moveToInsertRow();
            rs.updateString("Name", name);
            rs.updateString("Email", email);
            rs.updateString("Phone", phone);
            rs.insertRow();
            rs.moveToCurrentRow();
            System.out.println("Record inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void deleteRecord() {
        try {
            rs.deleteRow();
            System.out.println("Record deleted.");
            if (!rs.next()) {
                if (!rs.previous()) {
                    System.out.println("No more records.");
                } else {
                    displayRecord();
                }
            } else {
                displayRecord();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void close() {
        try {
            rs.close();
            stmt.close();
            conn.close();
            System.out.println("Application closed.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JDBC app = new JDBC();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Enter command (N: Next, P: Previous, F: First, L: Last, I: Insert, D: Delete, E: Exit):");
            command = scanner.nextLine();
            if (command.equalsIgnoreCase("E")) {
                app.navigate(command);
                break;
            }
            app.navigate(command);
        }

        scanner.close();
    }
}