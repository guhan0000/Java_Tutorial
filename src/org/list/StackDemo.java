package org.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println(stack);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack);
		System.out.println(stack.search(10));
		stack.push(40);
		stack.push(50);
		stack.push(60);
		System.out.println(stack);
		System.out.println(stack.get(0));
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		int search = stack.search(10);
		System.out.println(search);
		
		for(int num:stack) {
			System.out.print(num+ " ");
		}
		
	}
}
