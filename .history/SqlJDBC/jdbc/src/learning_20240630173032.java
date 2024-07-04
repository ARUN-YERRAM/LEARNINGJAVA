public class learning {
    public static void main(String [] args){
        try{
            // load the driver

            Class.forName("com.mysql.cj.jdbc.Driver");

            // create a connection
            String url = "jdbc:mysql://localhost:3306/learningjdbc";
            String username = "root";
            String password = "SRBAA1994";
            Connection con = DriverManager.getConnection(url,username,password);

            String query = "create table t1(tID int(20) primary key auto_increment,
            tName varchar(200) not null , tCity varchar(4000))";

            



        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
