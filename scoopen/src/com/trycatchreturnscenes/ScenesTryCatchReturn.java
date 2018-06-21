package com.trycatchreturnscenes;

public class ScenesTryCatchReturn {
	
	
	
	void method1(){
		System.out.println("Inside method1");
		
		method2();
		
		
		
		
		
	System.out.println("method1 completed");
	}
	
	void method2(){
		System.out.println("Inside method2");
		
		method3();
		
		System.out.println("method2 completed");
	}
	
	void method3(){
		
		System.out.println("Inside method3");
		
		
		
		try {
			int variable=0;
			int total=10/variable;
		
			return;
			}
			catch (Exception e) {
				
				System.out.println(e.getMessage());
				return;
				
			}
			
			
			finally {
				System.out.println("Inside finally");
				
				return;
				
			}
			return;
		
		
		//System.out.println("method3 completed");
	}
	
		
	
	
	public static void main(String[] args) {
		
		ScenesTryCatchReturn stc = new ScenesTryCatchReturn();
		stc.method1();
		
		System.out.println("main completed");
		
		
		
		
	}
	
	
	
	

}
