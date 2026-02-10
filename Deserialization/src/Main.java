import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		User user=null;
		FileInputStream fileInputStream=new FileInputStream("//home//guhan//eclipse-workspace//Serialization//UserInfo.ser");
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		user= (User)objectInputStream.readObject();
		System.out.println(user.getUserName()
				);
		System.out.println(user.getPassword());
		
	}
}
