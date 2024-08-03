package JAVALAB;
import java.sql.*;
import java.util.*;

public class Example10c {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Department No. : ");
		int dno = input.nextInt();
		System.out.print("Enter the Department Name : ");
		String dname = input.next();
		System.out.print("Enter the Department Location : ");
		String dloc = input.next();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test10b","root","SRBAA1994");
			PreparedStatement pstmt = null;
			String query = "INSERT INTO Department(deptno, dname, location)" + "VALUES (?, ?, ?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, dno);
			pstmt.setString(2, dname);
			pstmt.setString(3, dloc);
			int status = pstmt.executeUpdate();
			if(status > 0) 
			{
				System.out.println("Record is inserted successfully !!!");
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

