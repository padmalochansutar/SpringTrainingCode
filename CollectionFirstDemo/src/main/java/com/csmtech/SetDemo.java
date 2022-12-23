package com.csmtech;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
	    Set<Integer> lHashSet=new LinkedHashSet<Integer>();
	    lHashSet.add(12);
	    lHashSet.add(5);
	    lHashSet.add(8);
	    lHashSet.add(5);
	    System.out.println(lHashSet);
	    Set<Integer> lTreeSet=new TreeSet<Integer>((o1,o2)->o2-o1);
	    lTreeSet.add(5);
	    lTreeSet.add(8);
	    lTreeSet.add(2);
	    lTreeSet.add(6);
	    lTreeSet.add(9);
	    lTreeSet.add(20);
	    lTreeSet.add(11);
	    lTreeSet.add(15);
	    lTreeSet.add(7);
	    System.out.println(lTreeSet);
	   // lTreeSet.remove(Integer.valueOf(15));
	   // System.out.println(lTreeSet);
	    Queue<Integer> queue=new ArrayDeque<Integer>();
	    queue.offer(12);
	    queue.offer(14);
	    queue.offer(18);
	    queue.offer(7);
	    System.out.println(queue);
	    queue.poll();
	    System.out.println(queue);
	    Deque<Integer> dqueue=new LinkedList<Integer>();
	    dqueue.offer(12);
	    dqueue.offer(14);
	    dqueue.offer(18);
	    dqueue.offer(7);
	    System.out.println(dqueue);
	    dqueue.poll();
	    System.out.println(dqueue);
	    Queue<Integer> pqueue=new PriorityQueue<Integer>();
	    pqueue.add(5);
	    pqueue.add(8);
	    pqueue.add(2);
	    pqueue.add(6);
	    pqueue.add(9);
	    pqueue.add(20);
	    pqueue.add(11);
	    pqueue.add(15);
	    pqueue.add(7);
	    System.out.println(pqueue);
	    pqueue.poll();
	    System.out.println(pqueue);
	    
	    
	    
	}

}
