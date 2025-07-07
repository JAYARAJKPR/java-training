package com.training.basic50;

import java.util.Scanner;

public class _07_ToRemoveSpace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String mod=removeSpace(s);
		System.out.println(mod.toString());
	} 

	private static String removeSpace(String s) {
		StringBuilder sb=new StringBuilder();
		 char[] charArray = s.toCharArray();
		 
		 for (char c : charArray) {
		  if (!Character.isWhitespace(c)) {//Character.isWhitespace();
		   sb.append(c);
		 }
		  
		 }
		return sb.toString();
	}
}
