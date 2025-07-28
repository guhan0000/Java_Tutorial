package corp.gts.clients;

import corp.gts.*;

public class Client extends Employees{
						
	static int clientId=28543;
	static String clientName="SBI";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(clientId);
		System.out.println(clientName);
		Client c1=new Client();
		c1.companyId();
		c1.companyName();
		System.out.println(c1.comp_city);
		
	}

}
