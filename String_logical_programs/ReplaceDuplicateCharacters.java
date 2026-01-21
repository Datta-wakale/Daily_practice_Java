package com.java.String_logical_programs;

import java.util.Scanner;

public class ReplaceDuplicateCharacters {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char rep = sc.next().charAt(0);
        char repBy = sc.next().charAt(0);
        char ch[] = str.toCharArray();
        for(int i=0; i<str.length(); i++) {
        		if(ch[i]== rep)
        		{
        			ch[i] = repBy ;
        		}
     
        }
        System.out.println(ch);
	}

}
