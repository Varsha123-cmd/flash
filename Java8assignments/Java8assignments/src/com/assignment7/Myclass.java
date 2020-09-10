package com.assignment7;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
public class Myclass {
public static void main(String args[]) {
	//count empty strings
	List<String> strings=Arrays.asList("java","Python","jdbc","","Servlet","");
	long count1=strings.stream().filter(string->string.isEmpty()).count();
	System.out.println("List has empty string"+count1);
//count string with length more than5
	long num=strings.stream().filter(string->string.length()>5).count();
	System.out.println("List has string of length greater than 5 is "+num);
	List<String> filtered=strings.stream().filter(string->string.isEmpty()).collect(Collectors.toList());
	System.out.println("list with empty strings"+filtered);
}
}
