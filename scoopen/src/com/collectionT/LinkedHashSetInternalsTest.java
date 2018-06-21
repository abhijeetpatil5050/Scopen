package com.collectionT;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetInternalsTest {

	
	public static void main(String[] args) {
		
		Emps e1 = new Emps(1,"Abhijeet");//1
		Emps e2 = new Emps(2,"Indrajeet");//2
		Emps e3 = new Emps(3,"Ranjeet");//3
		Emps e4 = new Emps(2,"Indrajeet");
		Emps e5 = new Emps(1,"Anika");
		Emps e6 = new Emps(6,"Niramala");//4
		Emps e7 = e1;		
		
		LinkedHashSet<Emps> lhs = new LinkedHashSet<>();
		lhs.add(e1);
		lhs.add(e2);
		lhs.add(e3);
		lhs.add(e4);
		lhs.add(e5);
		lhs.add(e6);
		lhs.add(e7);
		
		lhs.remove(e2);
		
		
		
		System.out.println("Size of LinkedHashSet:"+lhs.size());
		
	
		
		
		
		for (Emps emps : lhs) {
		
			
			System.out.println("\nContents of LinkedHashMap:"+emps);
			
			
			
			}
		
		System.out.println("\nContent of LinkedHashSet:"+lhs);
		
		
		
		
		
		
		
		
	}
	
	
}

class Emps
{
		private int id;
		private String name;
		@Override
		public String toString() {
			return "Emps [id=" + id + ", name=" + name + "]";
		}
		
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
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
			Emps other = (Emps) obj;
			if (id != other.id)
				return false;
			return true;
		}



		//@Override
		/*public int hashCode() {
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
			Emps other = (Emps) obj;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}*/
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
		public Emps(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public Emps() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
		
		

}
