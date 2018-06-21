package com.trycatchreturnscenes;


public class WithReturnValue {
	
		
	
	
		
	
	
	public static void main(String[] args) {
		WithReturnValue s1 =new WithReturnValue();
		
	System.out.println(s1.method1(10));	
		
	}
		
public int method1(int i){

			System.out.println("Inside method1");
			int k=0;
			try
			{
				k=i/0;
				//return 20;
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
				return 30;
			}finally
			{
				System.out.println("inside finally");
				//return 40;
			}
					//System.out.println("method1 completed");
		
						//return 0;
		
		
		
		}
	
		
		 
		
		
		
	}
	
	



