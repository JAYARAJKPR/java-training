package com.training.basic50;

import java.util.Scanner;

public class _04_IsPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean result=isprimeNum(n);
		System.out.println(result);
	}

private static boolean isprimeNum(int n) {
	if(n==0 || n==1) {
		return false;
	}
	else if(n==2) {
		return true; 
	}
	else {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
	}
	
	return true;
}
}
