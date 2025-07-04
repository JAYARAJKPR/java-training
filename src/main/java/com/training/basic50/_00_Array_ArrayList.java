package com.training.basic50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _00_Array_ArrayList {
	public static void main(String[] args) {
		String[] array = {"Apple", "Banana", "Cherry"};
		ArrayList<String> arrayList1 = new ArrayList<>();
		for (String element : array) {
			arrayList1.add(element);
		}
		System.out.println(arrayList1);
		
		ArrayList<String> arrayList = new ArrayList<>();
		Collections.addAll(arrayList, array);
		System.out.println(arrayList);
		
		ArrayList<String> al2 = new ArrayList<>(Arrays.asList(array));
		System.out.println(al2);
		
	}
	
}