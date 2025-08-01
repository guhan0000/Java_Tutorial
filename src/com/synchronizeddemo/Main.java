package com.synchronizeddemo;
class Table
{
	void printTable(int num) throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"X"+num+"="+i*num);
			Thread.sleep(2000);
		}
	}
	
}
public class Main {

		public static void main(String[] args) throws InterruptedException {
			Table table=new Table();
			table.printTable(2);
			Thread.yield();
			Thread t1=new Thread()
			{
				public void run()
				{
					try {
						table.printTable(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			};
			t1.start();
		}
}
