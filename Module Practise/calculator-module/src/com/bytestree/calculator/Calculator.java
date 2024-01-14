package com.bytestree.calculator;

import com.bytestree.maths.Addition;

public class Calculator {
	
	public static void main(String args[]) {	
		Addition add = new Addition();
		int z = add.add(2, 3);
		System.out.print(z);
	}
	
}
