package com.demo.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQueue_1 {

	public static void main(String[] args) {
		
		
		
		Queue<Integer> q1 = new LinkedList<Integer>();
		q1.add(10);
		q1.offer(20);
		q1.add(30);
		q1.add(99);
		q1.add(587);
		System.out.println(q1);
		q1.remove();
		q1.poll();
		System.out.println(q1);
		
		
		Queue<Integer> q2 = new PriorityQueue<Integer>();
		q2.offer(10);
		q2.offer(10);
		q2.offer(50);
		q2.offer(50);
		q2.offer(99);
		System.out.println(q2);

	}

}
