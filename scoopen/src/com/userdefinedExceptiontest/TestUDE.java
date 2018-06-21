package com.userdefinedExceptiontest;


class NegativeValueException extends Exception
{

	public NegativeValueException(String msg){
		super(msg);
		// TODO Auto-generated constructor stub
	}
	
	
	
}


public class TestUDE {
	
	
	void method1 ( int var) throws NegativeValueException
	{
		
		
		int value=var;
		if(value<0) 
		{
			 
			throw new NegativeValueException("value is not positive value");
			
			
		}
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		TestUDE test =new TestUDE();
		
		
		try {
		test.method1(-1);
		}
		catch(NegativeValueException nve)
		{
			nve.printStackTrace();
			//nve.getLocalizedMessage();
		
		}
		
		
		
	}
	
	

}
