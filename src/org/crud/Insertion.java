package org.crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class Insertion {

	public void insertion() throws Exception
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter title");
		String movie_name=scanner.next();
		System.out.println("enter released year");
		String movie_year=scanner.next();
		System.out.println("enter genre");
		String movie_genre=scanner.next();
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String pwd="guhan69";
		String sql="INSERT INTO movies VALUES(?,?,?)";
		Connection connection=DriverManager.getConnection(url,user,pwd);
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setString(1,movie_name);
		statement.setString(2, movie_year);
		statement.setString(3, movie_genre);
		int result=statement.executeUpdate();
		System.out.println("inserted successfully");
		
	}
}
