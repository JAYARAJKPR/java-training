package com.training.basic50;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		boolean p=isPalindrome(s);
		System.out.print(p);
	}

	private static boolean isPalindrome(String s) {
		if(s ==null) return false;
		int left=0;
		int right=s.length()-1;
		
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			} 
			left++;
			right--;
		}
		return true;
	}
}
