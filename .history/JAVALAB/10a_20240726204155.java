
package JAVALAB;
import java.sql.*;
import java.util.*;


public class 10a {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Department Number : ");
		int deptNum = input.nextInt();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/test","root","SRBAA1994");
			Statement stmt=con.createStatement();
			String sql = "select ename from emp where deptno = "+deptNum+" order by ename asc";
			ResultSet rs=stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
      			System.out.println("");
        			int numberOfColumns = rsmd.getColumnCount();
        			for (int i = 1; i <= numberOfColumns; i++) 
			{
        			if (i > 1) 
System.out.print(" , ");
        			String columnName = rsmd.getColumnName(i);
        			System.out.print(columnName);
      			}
      			System.out.println("");

			while (rs.next()) 
			{
				for (int i = 1; i <= numberOfColumns; i++) 
				{
					if (i > 1) 
						System.out.print(", ");
					String columnValue = rs.getString(i);
					System.out.print(columnValue);
				}
				System.out.println("");
			}
				
			con.close();
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}
		input.close();
	}
}
