package com.bridgelabz.generics;

import java.util.List;

public class GenericsMain {
	
	public static void main(String[] args) {
				
		Integer[] intArray = {10,20,30};
		Double[] doubleArray = {76.5732,20.8743,3.141};
		String[] stringArray = {"Apple","Peach","Banana"};
		
		MaxVariable max = new MaxVariable();
		List<Integer> ints = max.toList(intArray);
		List<Double> doubles = max.toList(doubleArray);
		List<String> strings = max.toList(stringArray);
		
		System.out.println("The maximum element of three integers is "+max.maxVariable(intArray));
		System.out.println("The maximum element of three Doubles is "+max.maxVariable(doubleArray));
		System.out.println("The maximum element of three Strings is "+max.maxVariable(stringArray));
				
	}
}
