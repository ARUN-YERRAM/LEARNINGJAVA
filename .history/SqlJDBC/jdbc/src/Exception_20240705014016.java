public class Exception {
    public static void main(String [] args){

        try{

            // Load the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Create a connection
            String url = "jdbc:mysql://localhost:3306/learningjdbc";
            String username = "root";
            String password = "SRBAA1994";
            Connection con = DriverManager.getConnection(url,username,password);

            
    }
}
