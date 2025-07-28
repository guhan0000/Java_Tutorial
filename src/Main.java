 import java.sql.*;
public class Main {

	
	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.
					getConnection("jdbc:mysql://localhost:3306/company","root","guhan69");
			Statement st= con.createStatement();
			ResultSet rs=st.executeQuery
					("select * from movies");
			System.out.println(rs.getFetchSize());
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
