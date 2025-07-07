package com.training.basic50;

import java.util.Scanner;

public class _08_RemoveLeadTrailSpace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=removeTrAndLeSpace(s);
		System.out.println(s1);
	}

	private static String removeTrAndLeSpace(String s) {
		String s1=s.strip();// or trim();
		return s1;
	}
}
