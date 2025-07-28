import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class Insertion2 {

	public void insertion() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String pwd="guhan69";
		String sql="INSERT INTO movies VALUES(?,?,?)";
		Connection connection=DriverManager.getConnection(url,user,pwd);
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setString(1,"Thug life");
		statement.setString(2, "2025");
		statement.setString(3, "action/drama");
		int result=statement.executeUpdate();
		
	}
}
