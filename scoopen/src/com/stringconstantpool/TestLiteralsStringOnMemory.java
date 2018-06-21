package com.stringconstantpool;

public class TestLiteralsStringOnMemory {
	
	
	
	 String str1 = new String("one");// on heap plus maintain copy in scp
	 String str2 = new String("one");
	 String str3="one";
	 String str4="one";
	 
	 
 void show()
 {
	
	 
	 System.out.println(str1==str2);			//false
	 System.out.println(str1.equals(str2));		//true
	
	 System.out.println(str3==str4);			//true
	 System.out.println(str3.equals(str4));		//true
	 
	 
	 System.out.println(str1.hashCode());
	 System.out.println(str2.hashCode());
	 
	 System.out.println(str3.hashCode());
	 System.out.println(str4.hashCode());
	 
 }
 public static void main(String[] args) {
	
	TestLiteralsStringOnMemory t= new TestLiteralsStringOnMemory();
	t.show();	 
	 
}
	
	
	

}
