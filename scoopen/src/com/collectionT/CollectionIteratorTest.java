package com.collectionT;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionIteratorTest {
	
	
	public static void main(String[] args) {
		
		HashMap<EmpCD, String> mapOfEmps=getdummy(10);
		System.out.println(mapOfEmps);
		
		//get keys from values 
		
		String value = "Person21";
		EmpCD emp1=retriveKeyBasedOnValue(value,mapOfEmps);
		System.out.println(value +" value has a key -- " +emp1);
		
	}

	private static EmpCD retriveKeyBasedOnValue(String value, HashMap<EmpCD, String> mapOfEmps) {
		
		
		//HashMap<EmpCD, String> hmap = new HashMap<>();
		Set<Entry<EmpCD,String>> setOfEntries=mapOfEmps.entrySet();
		Iterator<Entry<EmpCD, String>> itr=setOfEntries.iterator();
		while(itr.hasNext())
		{
			Entry<EmpCD,String> singleentry=itr.next();
			if(singleentry.getValue().equals(value))
			{
				return singleentry.getKey();
			}
		}
		return null;
		
	}

	private static HashMap<EmpCD, String> getdummy(int noofpersons) {
		
		HashMap<EmpCD, String> hmap = new HashMap<>();
		for(int i=1;i<=noofpersons;i++)
		{
			System.out.println(hmap.put(new EmpCD(i,"Shravan"+i),"Person"+i));//10 times null at first time
			
		}
		
		System.out.println(hmap.get(new EmpCD(1, "Shravan1"))); // Person1
		
		hmap.put(new EmpCD(1,"Shravan1"),"Person21");
		System.out.println(hmap.get(new EmpCD(1, "Shravan1")));//Person21
		
		hmap.put(new EmpCD(2,"Shravan2"),"Person21");
		System.out.println(hmap.get(new EmpCD(2, "Shravan2")));//Person21
		
		return hmap;
	}

}
class EmpCD{
	private int empId;
	private String empName;
	@Override
	public String toString() {
		return "\n EmpCD [empId=" + empId + ", empName=" + empName + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public EmpCD(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public EmpCD() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
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
		EmpCD other = (EmpCD) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}	
}
