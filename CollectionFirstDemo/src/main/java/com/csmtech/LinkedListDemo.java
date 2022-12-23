package com.csmtech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LinkedListDemo {
//linked list is serial access means 1,2.3...
	//duplicate value and null allowed.
	public static void main(String[] args) {
		List<Integer> linkedList=new LinkedList<Integer>();
		List<Integer> arrayList=new ArrayList<Integer>();
		Random rm=new Random();
		//intializing array list with 150000
		for(int i=0;i<15000;i++) {
			arrayList.add(rm.nextInt(20000));
		
			
		}
		for(int i=0;i<15000;i++) {
			linkedList.add(rm.nextInt(20000));
			}
		System.out.println(linkedList);
		//System.out.println("****************************");
		System.out.println(arrayList);
		
		Long startTime=0l,endTime=0l;
		startTime=new Date().getTime();
		arrayList.add(0,99);
		arrayList.get(9999);
		endTime=new Date().getTime();
		System.out.println("arrays takes "+(endTime-startTime));
		
		startTime=new Date().getTime();
		linkedList.add(0,99);
		linkedList.get(9999);
		endTime=new Date().getTime();
		System.out.println("Linked takes "+(endTime-startTime));
		
		//data store
		/*
		 * intList.add(12); intList.add(29); intList.add(90); intList.add(29);
		 * intList.add(null); //change data same as array List..
		 * 
		 * System.out.println(intList);
		 */
		//stack operation
		LinkedList<Integer> stack=new LinkedList<Integer>();
		stack.push(12);
		stack.push(14);
		stack.push(16);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());//peek is used to check the top of position data..
		System.out.println(stack);
		System.out.println("=================================================");
		System.out.println("QUEUE OPERATION:-");
		//queue operation:-
		LinkedList<Integer> queue=new LinkedList<Integer>();
		queue.offer(12);
		queue.offer(4);
		queue.offer(5);
		queue.offer(8);
		System.out.println(queue);
		queue.poll();//poll means delete one data 
		System.out.println(queue);
		
		System.out.println("HASH SET:-");
		//set:-hash set(c),Linked hashset(c),sorted set(i)-tree set(c)..
		List<Integer> aList=new ArrayList<Integer>(Arrays.asList(12,32,45,65,76,12,12,32));
		System.out.println(aList);
		aList=new ArrayList(new HashSet<Integer>(aList));
		System.out.println(aList);
		//HashSet<Integer> set=new HashSet<Integer>();
		//set.add(12);
		//set.add(5);
		//set.add(7);
		//set.add(89);
		//set.add(7);//duplicate value is not store..
		//set.add(null);
		//System.out.println(set.contains(89));//check true or false..
		
		//System.out.println(set);
		
		
		Set<Integer> set=new HashSet<Integer>();
		System.out.println(set.add(12));
		System.out.println(set.add(19));
		System.out.println(set.add(12));//if duplicate value is there then false
		System.out.println(set);
	}

}
