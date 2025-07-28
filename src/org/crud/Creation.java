package org.crud;
import java.sql.*;
import java.util.*;
public class Creation {
	public void createTable() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String pwd="guhan69";
		String sql="CREATE TABLE movies(name VARCHAR(25), year INT, genre VARCHAR(15))";
		Connection connection=DriverManager.getConnection(url,user,pwd);
		PreparedStatement statement=connection.prepareStatement(sql);
		
		int result=statement.executeUpdate();
		System.out.println(result);
		
		
		connection.close();
		
	}
	

}
