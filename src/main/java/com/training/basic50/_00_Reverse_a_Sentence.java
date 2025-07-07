package com.training.basic50;

import java.util.Scanner;

public class _00_Reverse_a_Sentence {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        if (sc.hasNextLine()) { 
	            String s = sc.nextLine();//Reads entire line
	            System.out.println(reverseString(s));
	        } else {
	            System.out.println("No input provided.");
	        }
	        sc.close(); 
	    }

	    public static String reverseString(String s) {
	        String[] ch = s.trim().split("\\s+");
	        StringBuilder sb = new StringBuilder();
	        for (int i = ch.length - 1; i >= 0; i--) {
	            sb.append(ch[i]);
	            if (i != 0) sb.append(" ");
	        }
	        return sb.toString();
	    }
}
