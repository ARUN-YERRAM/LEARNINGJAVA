import java.sql.DriverManager;

public class main {
    
    public static void main(String [] args){
        Class.forName(“oracle.jdbc.driver.OracleDriver”);
         DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());


    }
}
