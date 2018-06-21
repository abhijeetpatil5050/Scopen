package com.collectionT;

import java.util.HashMap;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		
		
		Emp e1 = new Emp(1,"abhi");// values= Emp1    trueNL    trueOL       //ol==overload hashcode and equals method
																		     //nl==not overload hashcode and equals method
		Emp e2 = new Emp(1,"babi");// values= Emp2    trueNL    trueOL 
		Emp e3 = new Emp(1,"abhi");// values= Emp3    trueNL    falseOL
		Emp e4 = new Emp(2,"baasi");// values= Emp4   trueNL    trueOL
		Emp e5 = new Emp(2,"buddy");// values= Emp5   trueNL    trueOL
		Emp e6 = e5;			// values= Emp6s      falseNL   falseOL
		
		HashMap<Emp, String> mapofEmp = new HashMap<>();
			
	System.out.println(mapofEmp.put(e1, "Emp1"));//put method returns previous value only for first time which is null because of string type
	System.out.println(mapofEmp.put(e2, "Emp2"));//null
	System.out.println(mapofEmp.put(e3, "Emp3"));//Emp1
	System.out.println(mapofEmp.put(e4, "Emp4"));//null
	System.out.println(mapofEmp.put(e5, "Emp5"));//null
	System.out.println(mapofEmp.put(e6, "Emp6"));//Emp5
	
	System.out.println(mapofEmp.size());//5 when NL  //4 when OL
	
	//  not overload  ----  e1|Emp1  e2|Emp2 e3|Emp3  e4|Emp4 e5|Emp5 ---> e1|Emp3  e2|Emp2 e3|Emp1  e4|Emp5 e5|Emp6 
	
	//  overload -------    e1|Emp1  e2|Emp2  e4|Emp4 e5|Emp5  ----> e1|Emp3 e2|Emp2 e4|Emp4 e5|Emp6
		
	System.out.println(mapofEmp);

				
	}
	

}


class Emp
{
	
	int id;
	String name;
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
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}

