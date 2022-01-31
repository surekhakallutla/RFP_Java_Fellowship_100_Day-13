package com.bridgelabz.generics;

public class MaxVariable {

	public <Generic extends Comparable<Generic>> Generic maximum(Generic x, Generic y, Generic z) {
		Generic max = x;
		
		if(y.compareTo(max) > 0)
			max = y;
		
		if(z.compareTo(max) > 0)
			max = z;
		
		return max;	
	}

}
