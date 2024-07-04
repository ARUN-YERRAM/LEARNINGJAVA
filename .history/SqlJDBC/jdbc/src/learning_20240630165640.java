import java.sql.*;



public class learning {
    public static void main(String [] args){
        System.out.println("JAVA JDBC");

        try{
            // load the driver

            Class.forName("com.mysql.cj.jdbc.Driver");

            


        } catch(Exception e){
            p.printStackTrace();
        }


    }
}
