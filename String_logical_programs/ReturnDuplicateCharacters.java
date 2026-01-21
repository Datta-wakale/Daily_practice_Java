package com.java.String_logical_programs;

import java.util.Scanner;

public class ReturnDuplicateCharacters {
      
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = sc.next();
         char ch[] = str.toCharArray();
         int n = ch.length;
         for(int i=0; i<n; i++) {
        	 boolean visited = false;
             for (int k = 0; k < i; k++) {
                 if (ch[i] == ch[k]) {
                     visited = true;
                     break;
                 }
             }
             if (visited) continue;
        	   int count = 1;
        	 for(int j=i+1; j<n; j++) {
        		 
        		 if(ch[i] == ch[j]) {
                count++;
        		 }
        		
        	 }
        	 if(count>1) {
        		 for(int x = 0; x<count; x++) {
        	 System.out.print(ch[i]+" ");
        		 }
        	 }
         }
         
	}

}

