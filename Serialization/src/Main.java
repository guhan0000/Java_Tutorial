import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {
	
	public static void main(String[] args) {
		
		
//		System.out.println(user.getUserName()+" "+user.getPassword()
//		);
		try {
			User user=new User();
			user.setUserName("maxPower123");
			user.setPassword("Qwerty~123");
			
			FileOutputStream fileOutputStream = new FileOutputStream("UserInfo.ser");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(user);
			objectOutputStream.close();
			fileOutputStream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Object Saved");
	}

}
