package com.exceptionpractice;



public class TryCatchtest {

public static void main(String[] args) 
{
		

		try {
			
			
			
			System.out.println("Inside try Block");
			
		
		}
		
		
		catch(ArithmeticException ex)
		{
		
			System.out.println("Inside Child Exception");
			
		}
		catch(Exception E){
			
		System.out.println("Inside Catch Block");
	
			
		}
		
		
			
		
		finally {
			
			
			System.out.println("Inside Finally block");
			
		}
		
		
		
}
		
		
		
		
	
	}
	
	
	
	

