package com.armstrong_or_not;

import java.util.Scanner;

public class NewArmStrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, sum = 0, count = 0;
        n = sc.nextInt();
        
        int temp = n;

        // counting digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        temp = n;

        // calculate sum of digits^count
        while (temp != 0) {
            int last = temp % 10; // FIXED
            int power = 1;

            for (int i = 1; i <= count; i++) { // FIXED
                power *= last;
            }

            sum += power;
            temp /= 10;
        }

        if (sum == n) 
            System.out.println("The number is Armstrong: " + n);
        else 
            System.out.println("The number is NOT Armstrong: " + n);
    }
}
