package com.designpatterns;

public class MyTestReflectionSingleton {
	
	
	public static void main(String[] args) {
		
	
		Student Student_st1=Student.getInstanceMethod();
		Student Student_st2=Student.getInstanceMethod();
		
		System.out.println(Student_st1==Student_st2);//if returns true it is singleton as not created objects again
		

		Student1 Student1_st1=Student1.getInstanceMethod();
		Student1 Student1_st2=Student1.getInstanceMethod();
		
		System.out.println(Student1_st1==Student1_st2);//if returns true it is singleton as not created objects again

		Student2 Student2_st1=Student2.getInstanceMethod();
		Student2 Student2_st2=Student2.getInstanceMethod();
		
		System.out.println(Student2_st1==Student2_st2);//if returns true it is singleton as not created objects again
		
		Student4 Student4_st1=Student4.getInstanceMethod();
		Student4 Student4_st2=Student4.getInstanceMethod();
		
		System.out.println(Student4_st1==Student4_st2);//if returns true it is singleton as not created objects again
		
	}

}
class Student{
	
	
	/*this is EAGAR initialization mechanism starting */
	private static Student studObj= new Student();
	
	private Student(){
	
	}
	public static Student getInstanceMethod() {
		return studObj;
		
	}
	/*end of EAGAR initialization mechanism */
}
	
	/*this is EAGAR initialization mechanism with static block starting */
	
	class Student1{
		private static final Student1 studObj1;
		
		static {
		studObj1 = new Student1();
		}
		private Student1(){
		}
		public static Student1 getInstanceMethod(){
			return studObj1;
		}
	}
	/*end of EAGAR initialization mechanism with static block */
	
	
	/*this is Lazy initialization mechanism starting */
	class Student2{
	private static  Student2 studObj2;
	public static Student2 getInstanceMethod(){
			if(studObj2==null){
				studObj2= new Student2();
			}
			return studObj2;
		}
	
	}
	/*Lazy initialization mechanism ended here */
	
	
	
	/*this is Double checking mechanism starting */
	class Student4{
		private static  Student4 studObj4;
		private Student4(){
		}
		public static synchronized Student4 getInstanceMethod(){
		
		if(studObj4==null){
			
				if(studObj4==null)
					studObj4= new Student4();	
			}
		
		return studObj4;
		}
	}
	
	
	/*class D1{
		private static D1 bOb;
		private D1(){
		}
		public static synchronized D1 getInstance(){
			if(bOb==null){
				bOb=new D1();
			}
			return bOb;
		}
	}
	*/
	
	/*Double checking mechanism ended here */
	
	
	
	
	
	
