package com.training.basic50;

import java.util.Scanner;

public class _03_ContainsVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean result=ifVowel(s);
		System.out.println(result);
		sc.close();
	}

private static boolean ifVowel(String s) {
	if(s ==null) return false;
	 
	if(s.matches(".*[aeiouAEIOU].*")) {
		return true;
	}
	
	return false;
	
}
}
