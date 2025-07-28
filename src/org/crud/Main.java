package org.crud;

public class Main {
	public static void main(String[] args) {
		Creation creation=new Creation();
		Read read=new Read();
		Insertion insertion=new Insertion();
		Updation updation=new Updation();
		Deletion deletion=new Deletion();
		
		try {
			creation.createTable();
			insertion.insertion();
			updation.updateTable();
			deletion.deleteOperation();
			read.readTable();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
