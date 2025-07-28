package org.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Updation {
	
	void updateTable() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		 String url="jdbc:mysql://localhost:3306/company";
		 String user="root";
		 String pwd="guhan69";
		 String sql="ALTER TABLE movies ADD COLUMN language VARCHAR(10)";
		 String updateQuery="UPDATE movies SET language="+"'tamil'"+" WHERE language IS NULL";
		 Connection connection=DriverManager.getConnection(url,user,pwd);
		 PreparedStatement statement=connection.prepareStatement(updateQuery);
		 int result=statement.executeUpdate();
		 System.out.println("Updated Successfully");
	}

}
