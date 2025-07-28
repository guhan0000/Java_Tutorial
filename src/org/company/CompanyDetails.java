package org.company;

public class CompanyDetails {
	private void companyName(String name) {
		System.out.println("method1");
		System.out.println(name);
	}
	private void companyName(String name, String name2) {
		System.out.println("method2");
		System.out.println(name+"\t"+name2);
	}
	public static void main(String[] args) {
		CompanyDetails cd=new CompanyDetails();
		cd.companyName("Zoho","Google");
		cd.companyName("Infosys");
	}

}
