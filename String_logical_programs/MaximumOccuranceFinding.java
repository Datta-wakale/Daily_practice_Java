package com.java.String_logical_programs;

import java.util.Scanner;

public class MaximumOccuranceFinding {

	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.length()<=0) {
        	System.out.println("Invalid String input");
        	System.exit(0);
        }
        char ch = '0';
        char ch1='0';
        int max =0,comm=0;
        for(int i=0; i<str.length(); i++) {
        	  int count = 1;
        	  
        	  for(int j=i+1; j<str.length(); j++) {
        		  if(str.charAt(i) == str.charAt(j)) {
        			  count++;
        		  }
        	  }
        	  if(count>max) {
        		  max = count;
        		  ch = str.charAt(i);
        	  }
        	  if(count==max) {
        		  comm = count;
        		  ch1 = str.charAt(i);
        	  }
        }
        if(comm == max) {
            System.out.println(ch+" = "+ max +" times");
            System.out.println(ch1+" = "+ comm +" times");

        }else
        System.out.println(ch+" = "+ max +" times");
	}

}
