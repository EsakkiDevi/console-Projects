package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class database
{
	private static final String URL="jdbc:mysql://localhost:3306/call_taxi";
	private static final String USER = "root";
	private static final String PASSWORD="mysql";

	public static Connection getConnection()
	{
		try
		{ 
			Class.forName("com.mysql.cj.jdbc.Driver"); 


			return DriverManager.getConnection(URL,USER,PASSWORD);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

}
