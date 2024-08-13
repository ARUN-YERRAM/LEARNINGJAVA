package JAVALAB;
import java.util.*;
import java.sql.*;

public class Example10b {
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test10b","student","student");
			Statement stmt=con.createStatement();
			String location = "Dallas";
	String sql = "select ename from emp e, dept d  where  e.deptno=d.deptno and location = 'Dallas'";
			ResultSet rs=stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("");
  
      			int numberOfColumns = rsmd.getColumnCount();
  
      			for (int i = 1; i <= numberOfColumns; i++) 
			{
        			if (i > 1) System.out.print("	");
        			String columnName = rsmd.getColumnName(i);
        			System.out.print(columnName);
      			}
      			System.out.println("");
			while (rs.next()) 
			{
				for (int i = 1; i <= numberOfColumns; i++) 
				{
					if (i > 1) 
						System.out.print(",  ");
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
	}
}

}
