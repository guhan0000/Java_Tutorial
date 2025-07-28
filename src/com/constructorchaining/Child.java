package com.constructorchaining;

public class Child extends Parent{
	public Child() {
		super("mad");
		System.out.println("Child's default constructor");
	}
	public Child(boolean b)
	{	super('c');
		System.out.println(b);
	}

	void print()
	{
		System.out.println("Child's regular method");
	}
	
	public static void main(String[] args) {
		//Child c1=new Child();
		new Child(true);
		
		
	}

}
