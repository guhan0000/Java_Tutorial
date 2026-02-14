package com.multithreadingpractices;

class Database implements Runnable{
	public void run() {
		for(int i=0;i<4;i++) {
			System.out.println("Updating DB");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class WebRequest extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Accepting Request "+i);
			try {
				sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class MultiThreadDemo {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Multi Thread Demo");
		Runnable database=new Database();
		WebRequest webRequest=new WebRequest();
		Thread t1=new Thread(database);
		webRequest.run();
		webRequest.getName();
		t1.start();
		t1.setPriority(Thread.MIN_PRIORITY);
		webRequest.setPriority(Thread.MAX_PRIORITY);
		webRequest.start();
		t1.join();
		System.out.println("----end------");
		System.out.println(webRequest.getName());
		System.out.println(t1.getName());
	}

}
