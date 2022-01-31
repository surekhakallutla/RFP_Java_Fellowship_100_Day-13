package com.bridgelabz.generics;

import java.util.Scanner;

public class GenericsMain {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter first Float Value");
		Float a = scn.nextFloat();
		System.out.println("Enter second Float Value");
		Float b = scn.nextFloat();
		System.out.println("Enter third Float Value");
		Float c = scn.nextFloat();
		
		MaxVariable maxVariable = new MaxVariable();
		display(maxVariable.maximum(a, b, c));
			
	}
	
	public static void display(Float max) {
		System.out.println("The Maximum Integer is " + max);
	}
}
