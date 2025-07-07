package com.training.basic50;

import java.util.Arrays;
import java.util.Scanner;

public class _02_Swap {
	//Swapping values without creating a new Variable
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int[] res=swapValue(a,b);
			System.out.println(Arrays.toString(res));
			
		}
		public static int[] swapValue(int a,int b) {
			 if(a==0 && b==0) return new int[] {};

			 a = a + b;
			 b = a - b;
			 a = a - b;
			 
			return new int[] {a,b};
		}
		

}
