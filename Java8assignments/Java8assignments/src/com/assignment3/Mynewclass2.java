package com.assignment3;

public class Mynewclass2 {
public static void main(String args[]) {
	WordCount wc=(str)->{
		int c=0;
		char ch[]=new char[str.length()];

			 for(int i = 0; i < str.length(); i++){
		          ch[i] = str.charAt(i);
		          if(((i > 0) && (ch[i] != ' ') && (ch[i-1] == ' ')) || 
		          ((ch[0] != ' ') && (i == 0)))
		              c++;
		      }
		      return c;
		    };    
		    System.out.println("Words in the string " + wc.count("Lambda Expression in Java8"));    
		  
		
		
	}
}

