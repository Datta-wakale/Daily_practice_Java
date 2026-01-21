package com.java.String_logical_programs;

import java.util.Scanner;

public class RotationString {
      public boolean rotationString(String str,String str1) {
    	   char [] st = str.toCharArray();
    	  String result = new String();
    	  if(str.length() != str1.length()) {
    		  System.out.println("Invalid input");
    		  return false;
    	  }
    	  for(int i=0; i<st.length; i++) {
    		  char temp = st[i];
    		  st[i] = st[st.length-1];
    		  st[st.length-1] = temp;
    	  }
    	  result = String.valueOf(st);
    	  if(result.equals(str1)) {
    		 // System.out.println(result);
    		  return true;
    	  }
    	  return false;
      }
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String str1 = sc.next();
      RotationString rt = new RotationString();
      boolean ans = rt.rotationString(str, str1);
      System.out.println(ans);
      
	}

}
