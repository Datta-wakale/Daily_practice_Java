package com.chetan.functinal_interface;

import java.util.function.Predicate;

public class CalculationLogic {

	public static void main(String[] args) {
		int num = ;
     Predicate<Integer> isEven = (n) -> n%2==0;
     Predicate<Integer> isGreaterThanTen = (n) -> n>10;
     Predicate<Integer> isPrime = (n) -> {
    	 int count =1;
    	 for(int i=2; i<n; i++) {
    		 if(n%i==0) {
    			 count++;
    		 }
    	 }
    	    if(count>1) {
    	    	return false;
    	    }else 
    	    	return true;
     };
     CalculationLogic.testPredicate(n)
	}

	public static boolean testPredicate(int num , ) {
		
	}
}
