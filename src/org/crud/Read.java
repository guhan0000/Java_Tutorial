package org.crud;

import java.sql.*;

public class Read {
	void readTable()
	{
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 String url="jdbc:mysql://localhost:3306/company";
			 String user="root";
			 String pwd="guhan69";
			 String sql="SELECT * FROM movies";
			 Connection connection=DriverManager.getConnection(url,user,pwd);
			 Statement statement=connection.createStatement();
			 
			 ResultSet resultSet=statement.executeQuery(sql);
			 
			 while (resultSet.next()) {
			
				System.out.println(resultSet.getString("name") +"\t"+ 				resultSet.getString("year")+"\t"+resultSet.getString(3)+"								\t"+resultSet.getString(4));
				
				
			}
			 connection.close();
			 
			 
		 }catch (Exception e) {
			// TODO: handle exception
			 System.out.println(e.getMessage());
		}
	}
	

}
