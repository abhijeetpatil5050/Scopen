package com.collectionT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestUserObjectSortingTest {
	
	
	public static void main(String[] args) {
		
	
		/*sortingUsingComparable();
		sortingUsingComparator();
		sortingUsingAnnounymousImplementation();
		sortingUsingAnnounyButGivenInsideDomainClass();*/
		
		
		sortUsingAnnomomous();
		
		sortUsingComparator();
		
		sortUsingComparable();
		
		
		
		
	}

	

	private static void sortUsingAnnomomous() {
		
		List<ZillaParishad1> setofzillas=commonData1();
		
		Comparator<ZillaParishad1> camtoref = new Comparator<ZillaParishad1>() {
			
			@Override
			public int compare(ZillaParishad1 o1, ZillaParishad1 o2) {
				
				return o1.getZillaparishadId()-o2.getZillaparishadId();
			}
		};
		
		
		System.out.println("Before sorted with annonomous id base"+setofzillas);
		Collections.sort(setofzillas, camtoref);
		System.out.println("After sorted with annonomous id base"+setofzillas);
		
		Comparator<ZillaParishad1> camtoref1 = new Comparator<ZillaParishad1>() {
			
			@Override
			public int compare(ZillaParishad1 o1, ZillaParishad1 o2) {
				int temp=o1.getZillaparishadId()-o2.getZillaparishadId();
				if (temp==0)
				{
					temp=o1.getZillaparishadName().compareTo(o2.getZillaparishadName());
				}
				return temp;
			}
		};
		
		System.out.println("\nBefore sorted with annonomous idandname base"+setofzillas);
		Collections.sort(setofzillas, camtoref1);
		System.out.println("After sorted with annonomous idandname base"+setofzillas);
		
		
	}



	private static void sortUsingComparator() {
		
		List<ZillaParishad1> setofzillas=commonData1();
		
		System.out.println("\nBefore Sorting with Comparator on zps id:"+setofzillas);
		
		Collections.sort(setofzillas, new SortWithZillaparishadIdComparator());
		
		System.out.println("After Sorting with Comparator on zps id:"+setofzillas);
		
	}
	
	



private static void sortUsingComparable() {
		
		
	List<ZillaParishad> setofzillas=commonData();
		
		System.out.println("Before Sorting with Comparable on zps id:"+setofzillas);
		
		Collections.sort(setofzillas);
		
		System.out.println("After Sorting with Comaparable on zps id:"+setofzillas);
		
		
	}

private static List<ZillaParishad> commonData() {
	ZillaParishad z1 = new ZillaParishad(2,"Sangli");
	ZillaParishad z2 = new ZillaParishad(1,"Satara");
	ZillaParishad z3 = new ZillaParishad(3,"Kolhapur");
	ZillaParishad z4 = new ZillaParishad(4,"Latur");
	ZillaParishad z5 = new ZillaParishad(5,"Nagpur");
	ZillaParishad z6 = new ZillaParishad(6,"Jalgaon");
	
	//Set<ZillaParishad> setofzillas = new HashSet<>();
	
	List<ZillaParishad> setofzillas = new ArrayList<>();
	
	setofzillas.add(z1);
	setofzillas.add(z2);
	setofzillas.add(z3);
	setofzillas.add(z4);
	setofzillas.add(z5);
	setofzillas.add(z6);
	return setofzillas;
		
	}
private static List<ZillaParishad1> commonData1() {
	ZillaParishad1 z1 = new ZillaParishad1(2,"Sangli","Vishrambag");
	ZillaParishad1 z2 = new ZillaParishad1(1,"Satara","Wade Phata");
	ZillaParishad1 z3 = new ZillaParishad1(3,"Kolhapur","Rajarampuri");
	ZillaParishad1 z4 = new ZillaParishad1(4,"Latur","Ausa Road");
	ZillaParishad1 z5 = new ZillaParishad1(5,"Nagpur","Buttibori");
	ZillaParishad1 z6 = new ZillaParishad1(3,"Jalgaon","Near ST Stand");
	
	//Set<ZillaParishad> setofzillas = new HashSet<>();
	
	List<ZillaParishad1> setofzillas = new ArrayList<>();
	
	setofzillas.add(z1);
	setofzillas.add(z2);
	setofzillas.add(z3);
	setofzillas.add(z4);
	setofzillas.add(z5);
	setofzillas.add(z6);
	return setofzillas;
		
	}


	
	
}

class SortWithZillaparishadIdComparator implements Comparator<ZillaParishad1>
{

	@Override
	public int compare(ZillaParishad1 o1, ZillaParishad1 o2) {

		
		return o1.getZillaparishadId()-o2.getZillaparishadId();
	
	}
	
}


class ZillaParishad implements Comparable<ZillaParishad>
{
	private int zillaparishadId;
	private String zillaparishadName;
	public int getZillaparishadId() {
		return zillaparishadId;
	}
	public void setZillaparishadId(int zillaparishadId) {
		this.zillaparishadId = zillaparishadId;
	}
	public String getZillaparishadName() {
		return zillaparishadName;
	}
	public void setZillaparishadName(String zillaparishadName) {
		this.zillaparishadName = zillaparishadName;
	}
	@Override
	public String toString() {
		return "ZillaParishad [zillaparishadId=" + zillaparishadId + ", zillaparishadName=" + zillaparishadName + "]";
	}
	public ZillaParishad(int zillaparishadId, String zillaparishadName) {
		super();
		this.zillaparishadId = zillaparishadId;
		this.zillaparishadName = zillaparishadName;
	}
	public ZillaParishad() {
		super();
	}
	@Override
	public int compareTo(ZillaParishad o) {
		
		return this.getZillaparishadId()-o.getZillaparishadId();
	}
	
	
}




class ZillaParishad1{
	private int zillaparishadId;
	private String zillaparishadName;
	private String zillaAddress;
	
	public String getZillaAddress() {
		return zillaAddress;
	}
	public ZillaParishad1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setZillaAddress(String zillaAddress) {
		this.zillaAddress = zillaAddress;
	}
	public int getZillaparishadId() {
		return zillaparishadId;
	}
	public void setZillaparishadId(int zillaparishadId) {
		this.zillaparishadId = zillaparishadId;
	}
	public String getZillaparishadName() {
		return zillaparishadName;
	}
	public void setZillaparishadName(String zillaparishadName) {
		this.zillaparishadName = zillaparishadName;
	}
	@Override
	public String toString() {
		return "ZillaParishad1 [zillaparishadId=" + zillaparishadId + ", zillaparishadName=" + zillaparishadName
				+ ", zillaAddress=" + zillaAddress + "]";
	}
	public ZillaParishad1(int zillaparishadId, String zillaparishadName, String zillaAddress) {
		super();
		this.zillaparishadId = zillaparishadId;
		this.zillaparishadName = zillaparishadName;
		this.zillaAddress = zillaAddress;
	}
	
	
	
	
}






