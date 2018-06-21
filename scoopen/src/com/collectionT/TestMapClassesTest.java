package com.collectionT;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;

public class TestMapClassesTest {

	
	public static void main(String[] args) {
		
		Empo e1 = new Empo(14,"A1",40000);//4  "X7",16
		Empo e2 = new Empo(13,"A2",70000);//1  "X2",11
		Empo e3 = new Empo(11,"A3",60000);//2	 "X3",12
		Empo e4 = new Empo(12,"A4",50000);//3  "X6",13
		Empo e5 = new Empo(1,"A1",40000);
		Empo e6 = e5;
		
		
		
		
		
		Hashtable<Empo,String> hTable = new Hashtable<>();
		//HashMap<Empo,String> hTable = new HashMap<>();
		hTable.put(e1,"emp1");
		hTable.put(e2,"emp2");
		hTable.put(e3,"emp3");
		hTable.put(e4,"emp4");
		hTable.put(e5,"emp5");
		hTable.put(e6,"emp6");
		//hTable.put(e6,null);
		//hTable.put(null,"e7");
		
		
		//Collections.synchronizedMap(hTable);
		
		//sychronizedhashmap vs hashtable  vs concurrenthashmap
		//ESYNC   BDS   BDS
		//16  11  16
		//0.75
		//null 
			//-- k -- single --no --single
			//-- v -- allowed--no --allowed
		//duplicate
			//k -- no
			//v --allowed
		
		//synch -- table level lock / table level lock / segment/bucket level 
		//slow slow fast
		//itarator -- failfast failfast failsafe
		//enumaraion --na failsafe na
		//1.2 1.0 1.5
		//nl lg nl
		
///hashmap hashtable concurrenthashmap
//arraylist array copyonarraylist
//


		
	}

	
	
	
	
}
class Empo
{
	
		int Id;
		String Name;
		double Salary;
		@Override
		public String toString() {
			return "Empo [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Id;
			result = prime * result + ((Name == null) ? 0 : Name.hashCode());
			long temp;
			temp = Double.doubleToLongBits(Salary);
			result = prime * result + (int) (temp ^ (temp >>> 32));
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
			Empo other = (Empo) obj;
			if (Id != other.Id)
				return false;
			if (Name == null) {
				if (other.Name != null)
					return false;
			} else if (!Name.equals(other.Name))
				return false;
			if (Double.doubleToLongBits(Salary) != Double.doubleToLongBits(other.Salary))
				return false;
			return true;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public double getSalary() {
			return Salary;
		}
		public void setSalary(double salary) {
			Salary = salary;
		}
		public Empo() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Empo(int id, String name, double salary) {
			super();
			Id = id;
			Name = name;
			Salary = salary;
		}
		
		
		
		
}