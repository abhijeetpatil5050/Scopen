package com.collectionT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class UseCursorsTest {
	
	
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop(10,"Lenovo");//true
		Laptop l2 = new Laptop(131,"HP");//true
		Laptop l3 = new Laptop(13,"Dell");//true
		Laptop l4 = new Laptop(131,"Mac-Mini1");//false
		Laptop l5 = new Laptop(112,"Mac-Mini2");//true
		Laptop l6= l3;//false
		
		HashMap<Laptop, String> hmap = new HashMap<>();
		
		hmap.put(l1, "X1");//null
		hmap.put(l2, "X2");//null
		hmap.put(l3, "X3");//null
		hmap.put(l4, "X4");//X2
		hmap.put(l5, "X5");//null
		hmap.put(l6, "X6");//X3
		
		System.out.println("Content of Hashmap:"+hmap);
		// l1|X1  l2|X2 l3|X3 l5|X5  --->  l1|X1 l2|X4 l3|X6 l5|X5
		
		
		System.out.println("\n Printing Using hashmap war iterations with entryset\n");
		Set<Entry<Laptop, String>> setOfEntries = hmap.entrySet();
		Iterator<Entry<Laptop, String>> ite=setOfEntries.iterator();
		while(ite.hasNext())
		{
			
			Entry<Laptop,String> entry = ite.next();
			System.out.println("Key -- " +entry.getKey());
			System.out.println("Value -- " +entry.getValue());
			//System.out.println(ite.next());
			//System.out.println("Key:"+ite.next().getKey());
			//System.out.println("Value:"+ite.next().getValue());
		}
		System.out.println("\n Printing using keyset method on hashmap");
		Set<Laptop> setOfKeys = hmap.keySet();
		Iterator<Laptop> itr =setOfKeys.iterator();
		while(itr.hasNext())
		{
			
			Laptop singlekey =itr.next();
			String respectivevalue= hmap.get(singlekey);
			System.out.println("key is "+singlekey+"its respectivevalue is"+respectivevalue);
		}
		System.out.println("\n Printing using values method on  hashmap");
		Collection<String> setOfvalue = hmap.values();
		
		List<String> list = new ArrayList<String>(setOfvalue);
		Iterator<String> itr1=list.iterator();
		while(itr1.hasNext()){
			System.out.println("same output yayla pahije khalchya sarkha"+itr1.next()); 
		}
		
		
		System.out.println("check kara kay yeta te"+setOfvalue);
		
	
		
	}//main ends
}//class ends
class Laptop{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public Laptop(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
}