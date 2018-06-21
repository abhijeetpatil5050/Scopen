package com.collectionT;

import java.util.ArrayList;
import java.util.List;

public class Shiftoperators {
	
	

	
	public static void main(String[] args) {
	
		
		List<Integer> al1 = new ArrayList<Integer>();
		
		al1.add(1);
		al1.add(2);
		al1.add(3);
		
		
		List<Integer> al2= new ArrayList<Integer>();
		al2.add(4);
		al2.add(5);
		al2.add(6);
		
		
		
		System.out.println("Before adding ArrayList1:"+al1);
		 
		al1.addAll(al2);
		
		System.out.println("After adding ArrayList1:"+al1);
		
		//al1.removeAll(al2);
		
		
		//System.out.prsintln("After removeall"+al1);// o/p: 1 2 3
		
		/*al1.clear();
		
		System.out.println("After Clear"+al1); // o/p ; []
		*/
		
		//ArrayList all=new ArrayList<>();
		//al1.remove(3);
		al1.remove(al2);
		
		System.out.println("After remove"+al2);
		
		/*System.out.println("Before retaining al2 ArrayList1:"+al1);
		
		al1.retainAll(al2);
		
		System.out.println("After retaining al2 ArrayList1:"+al1);*/
		
		
		
		
		//System.out.println("ArrayList2:"+al2);
		
		
		
}

}
