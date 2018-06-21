package com.collectionT;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;



class set1{
	
	set1()
	{
		
		Set<Integer> st1 = new HashSet<Integer>();
		st1.add(10);
		st1.add(20);
		st1.add(56);
		st1.add(35);
		st1.add(35);
		
		
		
		
		System.out.println(st1.size());
	
		
		
	}
	
}







public class LinkedListDemos {
		
public static void main(String[] args) {
	
	List <Integer> al = new LinkedList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	
	/*System.out.println("Using For Each");
	
	for (Integer i : al) {
		System.out.println(i);
	}*/ 
	
	/*Iterator itr = al.iterator();
	
	System.out.println("Using iterartor list print");		
	while (itr.hasNext())
			{
				System.out.println(itr.next());
			}*/
	
	  	new set1();
	
	
}

}
