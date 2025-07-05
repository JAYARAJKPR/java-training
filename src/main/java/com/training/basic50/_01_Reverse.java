package com.training.basic50;

import java.util.Scanner;

public class _01_Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();// reads a word
		System.out.println(reverseString(s));
	}
	public static String reverseString(String s) {
	if(s==null) return null;
		char[] ch= s.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=ch.length-1;i>=0;i--) {
			sb.append(ch[i]);
		}
		
		
		return sb.toString();
		
	}
	
}
