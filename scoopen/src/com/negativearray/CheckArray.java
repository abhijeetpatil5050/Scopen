package com.negativearray;

public class CheckArray {
	
	int [] a = new int [0];
	
	//int [] a = new int [-1]; array negative exception
	
	public static void main(String[] args) {
		CheckArray ca = new CheckArray();
		ca.a[-1]	= 1;
		ca.a[1]	= 2;
		ca.a[2]	= 3;
		System.out.println(ca.a[-1]);
		
	}

}
