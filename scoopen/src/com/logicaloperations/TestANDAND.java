package com.logicaloperations;

public class TestANDAND {
	
	
 boolean one() {
		
		int a=20;
		int b= 10;
		
		int c=30;
		int d=30;
		
		
		if (a==b && c==d)
		{
			return true;
		}
		return false;
		}//one method closes
		
	
	
	public static void main(String[] args) {
		TestANDAND tadad = new TestANDAND();
		
		System.out.println(tadad.one());
		
	}

}
