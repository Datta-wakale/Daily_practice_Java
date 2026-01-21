package com.java.String_logical_programs;

import java.util.Scanner;
public class replaceCharactersByString {


		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	        String [] str1 = str.split("");
	        char rep = sc.next().charAt(0);
	       String reply = "NareshIt";
	        for(int i=0; i<str.length(); i++) {
	        		if(str.charAt(i) == rep)
	        		{
	        			str1[i] = reply ;
	        		}
	     
	        }
	        String result = String.join("", str1);
	        System.out.println(result);
		}

	}


