package com.multithreadingpractices;

class Printer{
	int num=1;
	int max;
	public Printer(int max) {
		this.max=max;
	}
	public synchronized void printEven() throws InterruptedException {
		while(num<=max) {
			if(num%2!=0) {
				wait();
			}
			else {
				System.out.println(num+"t even");
				notify();
				num++;
			}
			
		}
	}
	public synchronized void printOdd() throws InterruptedException {
		while(num<=max) {
			if(num%2==0) {
				wait();
			}
			else {
				System.out.println(num+" t odd");
				
				notify();
				num++;
			}
			
			
		}
	}
}
public class OddEvenPrint {
	
	public static void main(String[] args) {
		Printer printer=new Printer(10);
		Thread t1=new Thread(()->{
			try {
				printer.printEven();
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t2= new Thread(()->{
			try {
				printer.printOdd();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t1.start();
		t2.start();
	}

}
