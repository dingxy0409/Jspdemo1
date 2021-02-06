package com.dev;

public class Sum {
	
	
	//need add static, then in sumtest.java can directly call this method
	public static int add(int a,int b) {
		System.out.println("sum is "+(a+b));
		//one way to check if it's correct
		return a+b;
	}
}
