package com.java.String_logical_programs;

import java.util.Scanner;

public class RemoveAllDuplicates {
      
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = sc.next();
         char ch[] = str.toCharArray();
         int n = ch.length;
         for(int i=0; i<n; i++) {
        	   
        	 for(int j=i+1; j<n; j++) {
        		 
        		 if(ch[i] == ch[j]) {
               for(int k=j; k<n-1; k++ ) {
            	   ch[k] = ch[k+1];
               }
               n--;
               j--;
        		 }
        		
        	 }
         }
         String result = new String(ch,0,n);
         System.out.println(result);
         
	}

}
