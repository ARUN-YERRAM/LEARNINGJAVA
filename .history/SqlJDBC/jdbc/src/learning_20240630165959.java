import java.sql.*;



public class learning {
    public static void main(String [] args){
        System.out.println("JAVA JDBC");

        try{
            // load the driver

            Class.forName("com.mysql.cj.jdbc.Driver");

            // create a connection
            String url = "jdbc:mysql://localhost:3306/learningjdbc";
            String username = "root";
            
            Connection con = DriverManager.getConnection();



        } catch(Exception e){
            p.printStackTrace();
        }


    }
}
