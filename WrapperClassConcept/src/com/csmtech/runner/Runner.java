package com.csmtech.runner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
/*class Test{
	private int a;
	public int getA() {
		return a;
	}
}*/

public class Runner {

	public static void main(String[] args) {
      /*//int a=3;
		try {
     Integer a=new Integer("503xyz");
		}catch(NumberFormatException n){//not a primitive rather in wrapper
      Byte b=new Byte((byte) 12);//String convert to the integer..
      Long l=new Long(36576);
      Float f=new Float(12.6);
      Character c=new Character('A');
      //Integer a=new Integer('A');
      System.out.println(n);*/
		/*
		 * Integer[] A= {new Integer(6),new Integer(12),new Integer(9)};
		 * System.out.println(Arrays.toString(A)); Arrays.sort(A,(n1,n2)->n2-n1);
		 * System.out.println(Arrays.toString(A));
		 */
		//Integer a=Integer.valueOf(50);
		//Integer a=Integer.valueOf("982",10);
		//Character c=Character.valueOf('Z');
		//System.out.println(c);
		/*
		 * Integer a= Integer.valueOf(50); byte x=a.byteValue(); System.out.println(x);
		 * Long l=Long.valueOf(1000); int b=l.intValue(); System.out.println(b); Float
		 * f=Float.valueOf(123.345f); int y=f.intValue(); double d=f.doubleValue();
		 * System.out.println(d); System.out.println(y); Character
		 * c=Character.valueOf('z'); // byte j=c.byteValue(); System.out.println(c);
		 * 
		 * String s="123"; int g=Integer.parseInt(s);//primitive Integer
		 * yh=Integer.valueOf(g);//convereted primitive to wrapper
		 * System.out.println(yh.getClass().getName()); Character
		 * ch=Character.valueOf('z');
		 */
		/*
		 * Integer a=Integer.valueOf(128); Integer b=Integer.valueOf(128);
		 * //System.out.println(a.compareTo(b)); if(a==b) { System.out.println("same");
		 * } else { System.out.println("Different"); }
		 */
	    Integer a=12;//auto Boxing(value of())
	    int z=a;//auto unboxing(value)
	    System.out.println(z);
	    Integer c=12;
	    Integer d=c;//all wrapers are immutable..
	    c++;
	    System.out.println(c==d);
	    Date da=new Date();
	    //System.out.println(da);//ist -indian standard time);
	    //our own date represent..
	    SimpleDateFormat fm=new SimpleDateFormat("DD-mm-yyyy hh:mm");
	    //format you want you dispaly that format  by using fmt.format(dat)
	    SimpleDateFormat fmt=new SimpleDateFormat("yyyy/mm/dd hh:mm");
	    Date dat=null;
	    try{
	    	dat=fm.parse("5-06-2022 09:12");
	    }catch(ParseException pe) {
	    	System.out.println("Check your date");
	    }
	    System.out.println(dat);
	    System.out.println(fmt.format(dat));
	    }
	}

	

	
