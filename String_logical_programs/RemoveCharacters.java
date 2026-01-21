package com.java.String_logical_programs;

import java.util.Scanner;

public class RemoveCharacters {
       public String removeCharacters(String str, String str1) {
    	     char [] st = str.toCharArray();
    	     char [] st1 = str1.toCharArray();
    	     StringBuilder result = new StringBuilder();
    	        for(int i=0; i<st.length;i++) {
    	             	boolean isRemove = false;
    	        	    for(int j=0; j<st1.length; j++) {
    	        	    	if(st[i]== st1[j]) {
    	        	    		isRemove = true;
    	        	    		break;
    	        	    	}
    	        	    }
    	        	    if(!isRemove) {
    	        	    	result.append(st[i]);
    	        	    }
    	        }
    	   return result.toString();
       }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.next();
        RemoveCharacters re = new RemoveCharacters();
       String ans = re.removeCharacters(str, str1);
        System.out.println(ans);
	}

}
