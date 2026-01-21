package com.java.String_logical_programs;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOccurance {
	public static String maxOccurance(String s) {
	    char[] arr = s.toCharArray();
	    int max = 0,index=0;
	    int [] ele = new int[s.length()];
	    String str = "";
	    Arrays.sort(arr);

	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == '#')
	            continue;
	        int c = 1;

	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] == arr[j]) {
	                arr[j] = '#';
	                c++;
	            }
	        }

	        if (c > max) {
	            max = c;
	            str = "" + arr[i];
	            index = 0;
	            ele[index] = max;
	        } else if (c == max) {
	          	index++;
	            str = str + arr[i];
	            ele[index] = max;
	        }

	        arr[i] = '#';
	    }
	    for(int i=0; i<str.length();i++) {
	    	     System.out.println(str.charAt(i)+" = "+ ele[i]);
	    }
	    return str;
	} 
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        maxOccurance(str);
       // System.out.println(maxOccurance(str));
	}

}
