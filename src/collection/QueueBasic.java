package collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueBasic {

	public static void main(String[] args) {
		Queue<String> queueString = new PriorityQueue<>();
		Queue<String> queueString1 = new LinkedList<>();
		
		queueString.add("vaibhav");
		queueString.add("rahul");
		queueString.add("piyush");
		queueString.add("harshit");
		queueString.add("yogesh");
		
		System.out.println(queueString);
		
		queueString.poll();
		queueString.poll();
		queueString.poll();
		queueString.poll();
		queueString.poll();
		queueString.poll();
		queueString.poll();
		queueString.remove();
		
		System.out.println(queueString);
		
		
		
		/*
		 * queueString1.add("vaibhav"); queueString1.add("rahul");
		 * queueString1.add("piyush"); queueString1.add("harshit");
		 * queueString1.add("yogesh");
		 * 
		 * System.out.println(queueString1);
		 */
		
	}

}
