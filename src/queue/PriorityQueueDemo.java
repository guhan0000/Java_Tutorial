package queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer>queue=new PriorityQueue<Integer>();
		for(int i=2;i<=10;i+=2) {
			queue.add(i);
		}
		System.out.println(queue);
		queue.remove(2);
		Integer poll = queue.poll();
		System.out.println(poll);
		Iterator<Integer> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
	}

}
