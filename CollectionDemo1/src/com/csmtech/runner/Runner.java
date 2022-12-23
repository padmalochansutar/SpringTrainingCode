package com.csmtech.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();// generics cocept use
		ArrayList<Integer> nal = new ArrayList<Integer>();
		// ArrayList al=new ArrayList();
		// insertation at end
		// Add()
		/*
		 * al.add(12);//12 is a wrapper type al.add(14); al.add(null); al.add(8);
		 * al.add(6); al.add(34);
		 */

		// al.add("Amit");
		// Generics using
		/*
		 * for(Integer x:al) if(x instanceof Integer)//handle null pointer Exception//or
		 * if(x!=null) System.out.println(x.intValue());
		 */
		// System.out.println(al);//to-string method is used to print the state of
		// object..al is the state of object..by using al we can print state of the
		// object of class..
		// Traverse order
		// why we using object because there are some int value and string value sothats
		// why we use object because acces of both value..
		/*
		 * for(Object x:al) { //it is used to avoid class and null pointer exception
		 * if(x instanceof Integer ) { Integer i=(Integer)x;
		 * System.out.println(i.intValue()); }
		 */
//}
		nal.add(200);
		nal.add(100);
		nal.add(300);        //lambda expression
		Collections.sort(nal,(o1,o2)->o2-o1);//comparator used for descending & comparable used for Ascending
		System.out.println(nal);
		
		
		
		
		al.add(12);// 12 is a wrapper type
		al.addAll(nal);
		al.add(14);
		//al.add(null);
		al.add(8);
		al.add(6);
		al.add(34);
		// specific poosition store value
		al.add(0,99);//0 is used to store 99 in first index
		al.add(1,78);
		System.out.println(al);
		al.set(3,66);
		System.out.println(al);
		
		//add nal array value inside al array
	System.out.println(al);
	al.remove(Integer.valueOf(8));//only particular value delete
	System.out.println(al);
	al.removeAll(nal);//only delete nal value..
	System.out.println(al);
	List<Integer>dal=Arrays.asList(12,14);
	//System.out.println(dal);
	}
}
