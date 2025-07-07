package com.training.basic50;

import java.util.Scanner;

public class _06_ToCheckListofIntegersContainsOnlyOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
	boolean result=isListOdd(nums); 
	System.out.println(result);
	}

	private static boolean isListOdd(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				return false;
			}
		}
		
		return true;
	}
}
