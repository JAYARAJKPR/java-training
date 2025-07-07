package com.training.basic50;

import java.util.Scanner;

public class _10_Factorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int res=factorial(n);
	System.out.println(res);
}

private static int factorial(int n) {
	if(n==1) {
		return  n;
	}
	return n*factorial(n-1);
}
}
 