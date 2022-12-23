package com.csmtech;

public class EmailValidationProblem {
	public static int count(String s, char ch) {
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch)
				c++;
		}
		return c;
	}
	public  String validation(String s) {
		if(!s.contains("@"))
		  return "it is not a valid email";
		else if(!(count(s,'@')==1))
		  return "it is not a valid email";
		else if(count(s,'&')>1|| count(s,'.')>1)
		  return "it is not a valid email";	
        else if(!( s.substring(s.indexOf('@')+1, s.indexOf('.')).length()>=4))
          return "it is not a valid email";
        else if(!(s.substring(0,s.indexOf('@')).length()>=3))
		  return "it is not avalid email";
        else if(!s.endsWith(".com"))
		  return "it is not a valid email";
        else
          return "Yes it is a valid mail";
        
	}


}