import java.sql.*;

class jdbcTest {
    public static void main(String[] args) { 
        Connection con = null;
        Statement statement = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "SRBAA1994";

            con = DriverManager.getConnection(url, username, password);

            if(con.isClosed()){
                System.out.println("Connection is closed");
            }
            else{
                System.out.println("Connected succesfully");
            }
            statement = con.createStatement();
            String myStatement = "SELECT * FROM employees;";
            ResultSet x = statement.executeQuery(myStatement);
            while(x.next()) {
                System.out.println(x.getInt("empno") + " " + x.getString("ename") + " " + x.getString("job")+" "+x.getInt("mgr"));
            }
        }catch(Exception E){
            System.out.println(E);
        } finally {
            try{
            statement.close();
            con.close();
            } catch (Exception e) {
                System.out.println("Some error occured!");
            }
        }
}
}