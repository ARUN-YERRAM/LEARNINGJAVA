/*1.create the customers table and populate it with some sample data.
2. -- Create the 'customers' table
CREATE TABLE customers (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone VARCHAR(20) NOT NULL
);

-- Insert sample data into the 'customers' table
INSERT INTO customers (name, email, phone) VALUES
('Alice Smith', 'alice.smith@example.com', '555-1234'),
('Bob Johnson', 'bob.johnson@example.com', '555-5678'),
('Charlie Brown', 'charlie.brown@example.com', '555-8765'),
('Diana Prince', 'diana.prince@example.com', '555-4321'),
('Edward Norton', 'edward.norton@example.com', '555-9876'),
('Fiona Gallagher', 'fiona.gallagher@example.com', '555-1111'),
('George Michael', 'george.michael@example.com', '555-2222'),
('Hannah Baker', 'hannah.baker@example.com', '555-3333'),
('Isaac Newton', 'isaac.newton@example.com', '555-4444'),
('Jessica Jones', 'jessica.jones@example.com', '555-5555'),
('Kevin Bacon', 'kevin.bacon@example.com', '555-6666'),
('Lara Croft', 'lara.croft@example.com', '555-7777'),
('Michael Scott', 'michael.scott@example.com', '555-8888'),
('Nancy Drew', 'nancy.drew@example.com', '555-9999'),
('Oscar Wilde', 'oscar.wilde@example.com', '555-0000'),
('Pam Beesly', 'pam.beesly@example.com', '555-1010'),
('Quentin Tarantino', 'quentin.tarantino@example.com', '555-2020'),
('Rachel Green', 'rachel.green@example.com', '555-3030'),
('Steve Rogers', 'steve.rogers@example.com', '555-4040'),
('Tony Stark', 'tony.stark@example.com', '555-5050');
You are tasked with developing a Customer Records Management System for a company. The system should allow customer service representatives to view and navigate through customer records stored in a MySQL database. The system must provide functionality to:
1.	Display the first customer record when the application starts.
2.	Allow navigation to the next, previous, first, or last customer record.
3.	Display appropriate messages when trying to navigate beyond the available records.
4.	Allow the user to exit the application.
Requirements
1.	Display Customer Details: When navigating through the records, display the customer's ID, name, email, and phone number.
2.	Navigation Commands:
o	[N]ext: Move to the next record.
o	[P]revious: Move to the previous record.
o	[F]irst: Move to the first record.
o	[L]ast: Move to the last record.
o	[E]xit: Exit the application.
o	[I]nsert: Insert a new record
o	[D]elete: Delete the record
3.	Error Handling: Display appropriate messages when attempting to navigate past the first or last record.
*/


import java.sql.*;
import java.util.*;
class Customer {
    int id; 
    String name; 
    String email; 
    String phone;
    
    Customer(int id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void displayCustomer() {
        System.out.printf("ID: %d\nName: %s\nEmail: %s\nPhone: %s\n",this.id, this.name, this.email, this.phone);
    }
}
public class Test {
    private static void createTable(Statement statement) throws SQLException{
        statement.executeUpdate("CREATE TABLE customers (\r\n" + //
                                "    id INT PRIMARY KEY AUTO_INCREMENT,\r\n" + //
                                "    name VARCHAR(100) NOT NULL,\r\n" + //
                                "    email VARCHAR(100) NOT NULL,\r\n" + //
                                "    phone VARCHAR(20) NOT NULL\r\n" + //
                                ");");
    }
    private static void insertRecords(Statement statement) throws SQLException{
        statement.executeUpdate("INSERT INTO customers (name, email, phone) VALUES\r\n" + //
                                "('Alice Smith', 'alice.smith@example.com', '555-1234'),\r\n" + //
                                "('Bob Johnson', 'bob.johnson@example.com', '555-5678'),\r\n" + //
                                "('Charlie Brown', 'charlie.brown@example.com', '555-8765'),\r\n" + //
                                "('Diana Prince', 'diana.prince@example.com', '555-4321'),\r\n" + //
                                "('Edward Norton', 'edward.norton@example.com', '555-9876'),\r\n" + //
                                "('Fiona Gallagher', 'fiona.gallagher@example.com', '555-1111'),\r\n" + //
                                "('George Michael', 'george.michael@example.com', '555-2222'),\r\n" + //
                                "('Hannah Baker', 'hannah.baker@example.com', '555-3333'),\r\n" + //
                                "('Isaac Newton', 'isaac.newton@example.com', '555-4444'),\r\n" + //
                                "('Jessica Jones', 'jessica.jones@example.com', '555-5555'),\r\n" + //
                                "('Kevin Bacon', 'kevin.bacon@example.com', '555-6666'),\r\n" + //
                                "('Lara Croft', 'lara.croft@example.com', '555-7777'),\r\n" + //
                                "('Michael Scott', 'michael.scott@example.com', '555-8888'),\r\n" + //
                                "('Nancy Drew', 'nancy.drew@example.com', '555-9999'),\r\n" + //
                                "('Oscar Wilde', 'oscar.wilde@example.com', '555-0000'),\r\n" + //
                                "('Pam Beesly', 'pam.beesly@example.com', '555-1010'),\r\n" + //
                                "('Quentin Tarantino', 'quentin.tarantino@example.com', '555-2020'),\r\n" + //
                                "('Rachel Green', 'rachel.green@example.com', '555-3030'),\r\n" + //
                                "('Steve Rogers', 'steve.rogers@example.com', '555-4040'),\r\n" + //
                                "('Tony Stark', 'tony.stark@example.com', '555-5050');");

    }
    private static void displayRecord(ResultSet rs) throws SQLException {
        System.out.printf("\nID: %d\nName: %s\nEmail: %s\nPhone: %s\n\n", rs.getInt("id"),rs.getString("name"),rs.getString("email"),rs.getString("phone"));
    }
    private static void getRecords(Statement statement, String instruction, Scanner sc, ResultSet rs) throws SQLException{    
        switch (instruction) {
            case "N":
                displayRecord(rs);
                rs.next();
                break;
            case "P":
                rs.previous();
                displayRecord(rs);
                break;
            case "F":
                rs.first();
                displayRecord(rs);
                break;
            case "L":
                rs.last();
                displayRecord(rs);
                break;
            case "E":
                break;
            case "I":
                System.out.println("Enter the Name, EmailID, Phone number:");
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Phone: ");
                String phone = sc.nextLine();

                int y = statement.executeUpdate("INSERT INTO customers (Name, Email, Phone) VALUES ('"+name+"','"+email+"','"+phone+"');");
                System.out.println("Inserted into record successfully!" + y);
                break;
            case "D":
                System.out.println("Enter the name of the record you want to delete (Match Case):");
                String name2 = sc.nextLine();
                int x = statement.executeUpdate(String.format("DELETE FROM customers WHERE Name = '%s'", name2));
                System.out.println("Deleted from record successfully! " + x);
                break;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbctest";
            String uname = "root";
            String pass = "Srikar123*";

            connection = DriverManager.getConnection(url, uname, pass);

            if(connection.isClosed()) {
                System.out.println("Not connected.");
            } else {
                System.out.println("Connected to MySQL Successfully!");
            }

            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs = statement.executeQuery("SELECT * FROM customers;");
            rs.next();
            // createTable(statement);
            // insertRecords(statement);
            String Instruction = "";
            while(!Instruction.equals("E")) {
                System.out.print("Navigation Commands:\r\n" + //
                                        "o\t[N]ext: Move to the next record.\r\n" + //
                                        "o\t[P]revious: Move to the previous record.\r\n" + //
                                        "o\t[F]irst: Move to the first record.\r\n" + //
                                        "o\t[L]ast: Move to the last record.\r\n" + //
                                        "o\t[E]xit: Exit the application.\r\n" + //
                                        "o\t[I]nsert: Insert a new record\r\n" + //
                                        "o\t[D]elete: Delete the record\nEnter your Choice: ");
                Instruction = sc.nextLine();
                try {
                    getRecords(statement, Instruction, sc, rs);
                } catch (SQLException e) {
                    System.out.println("Error occured while printing the record: "+e);
                }
            } 
            System.out.println("Exitting...");
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                connection.close();
                statement.close();
                sc.close();
                rs.close();
            } catch (Exception e) {
                System.out.println("Some error occured!");
            }
        }
    }
}
