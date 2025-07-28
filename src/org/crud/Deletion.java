package org.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Deletion {

	 void deleteOperation() throws Exception{
		 Class.forName("com.mysql.jdbc.Driver");
		 String url="jdbc:mysql://localhost:3306/company";
		 String user="root";
		 String pwd="guhan69";
		 String sql="DELETE FROM movies WHERE year='2024'";
		 
		 Connection connection=DriverManager.getConnection(url,user,pwd);
		 PreparedStatement statement=connection.prepareStatement(sql);
		 int result=statement.executeUpdate();
		 System.out.println("Updated Successfully"); 

	}
}
