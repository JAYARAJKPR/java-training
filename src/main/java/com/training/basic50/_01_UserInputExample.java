package com.training.basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class _01_UserInputExample {
    public static void main(String[] args) throws IOException {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read the entire line of input

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read an integer

        // Print the collected information
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

       
        
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);
        System.out.print("Please Enter Your First Number:");
        String str = stdin.readLine();
        System.out.println(str);
        
        System.out.print("Enter No of elements:");
        int n = scanner.nextInt();
        ArrayList<Integer> elements = new ArrayList<>();
        for (int i = 0; i < n; i++) {
        	 elements.add(scanner.nextInt()) ; 
        }
        System.out.println(elements);
     // Close the scanner to release resources
        scanner.close();
    }
}