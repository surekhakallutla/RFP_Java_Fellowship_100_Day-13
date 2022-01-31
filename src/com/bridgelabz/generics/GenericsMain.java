package com.bridgelabz.generics;

public class GenericsMain {
	
	public static void main(String[] args) {
				
		MaxVariable maxVariable = new MaxVariable();
		
		display(maxVariable.maximum(10,20,30));
		display(maxVariable.maximum(76.5732,20.8743,3.141));
		display(maxVariable.maximum("Apple","Peach","Banana"));
			
	}
	
	public static <Generic>void display(Generic max) {
		System.out.println("The Maximum Variable is " + max);
	}
}
