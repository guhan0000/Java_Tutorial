import java.util.*;
import java.sql.*;
public class UpdateDemo {
public static void main(String[] args) {
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String pwd="guhan69";
        String sql = "UPDATE customers SET customername='guhan' WHERE customerid=2";
		Connection con=DriverManager.getConnection(url,user,pwd);
		Statement st=con.createStatement();
		int rs=st.executeUpdate(sql);
		System.out.println(rs);
		
		con.close();
		
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}
}
