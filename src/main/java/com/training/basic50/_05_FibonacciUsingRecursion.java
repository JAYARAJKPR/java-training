package com.training.basic50;
/**
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_FibonacciUsingRecursion { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		for(int i=0;i<count;i++) {
		System.out.print(fibonacci(i)+" ");
	}
	}

	private static int fibonacci(int num) {
		// TODO Auto-generated method stub
		if(num<=1) {
			return num; 
		}
		return fibonacci(num-1)+fibonacci(num-2);
		
	}

}
 **/
public class _05_FibonacciUsingRecursion{
	public static void main(String[] args) {
		int n=3;
	    for (int i = 1; i<n; i--) {
	    	for(int space=0;space<n-i;space++) {
	    		System.out.println(" ");
	    	}
	        for (int j = 1; j <= i; j++) {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}

 }