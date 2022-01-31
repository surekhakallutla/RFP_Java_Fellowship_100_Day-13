package com.bridgelabz.generics;

import java.util.Scanner;

public class GenericsMain {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter first String Value");
		String a = scn.next();
		System.out.println("Enter second String Value");
		String b = scn.next();
		System.out.println("Enter third String Value");
		String c = scn.next();
		
		MaxVariable maxVariable = new MaxVariable();
		display(maxVariable.maximum(a, b, c));
			
	}
	
	public static void display(String max) {
		System.out.println("The Maximum Integer is " + max);
	}
}
