package com.bridgelabz.generics;

import java.util.ArrayList;
import java.util.List;

public class MaxVariable {
	
	public static <Generic> List<Generic> toList(Generic... array) {
		List<Generic> list = new ArrayList<Generic>();
		
		for(Generic element : array) {
			list.add(element);			
		}
		return list;
	}

	public static <Generic extends Comparable<Generic>> Generic maxVariable(Generic... array) {
		
		Generic max = array[0];
		
		if(array[1].compareTo((Generic) max) > 0)
			max = array[1];
		
		if(array[2].compareTo((Generic) max) > 0)
			max = array[2];
			
		return max;
	}
	

}
