package com.collectionT;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCheck1 {
	
	
	public static void main(String[] args) {
		
		
		GroupOfVillages gv1 = new GroupOfVillages(1, "Bisur");//true
		GroupOfVillages gv2 = new GroupOfVillages(1, "Karnal");//true
		GroupOfVillages gv3 = new GroupOfVillages(3, "Padmal");//true
		GroupOfVillages gv4 = new GroupOfVillages(4, "Budhgaon");//true
		GroupOfVillages gv5 = gv1;//false
		GroupOfVillages gv6 = new GroupOfVillages(4,"Budhgaon");//false
		GroupOfVillages gv7 = new GroupOfVillages(3,"padmal");//true
		
		
		
		Set<GroupOfVillages> set = new HashSet<>();
		set.add(gv1);
		set.add(gv2);
		set.add(gv3);
		set.add(gv4);
		set.add(gv5);
		set.add(gv6);
		set.add(gv7);
		
		System.out.println("Size of Set is:"+set.size());// 5 as number of trues are 5
		System.out.println("Content of Set are --->:"+set);//
		
		HashMap<GroupOfVillages, String> hmap = new HashMap<>();
		hmap.put(gv1,"Bisur Datta mandir");//null
		hmap.put(gv2,"Karnal dada mandir");//null
		hmap.put(gv3,"Padmal more mandir");//null
		hmap.put(gv4,"Budhgaon maruti mandir");//null
		hmap.put(gv5,"Bisurcha Pir");//Bisur Datta mandir
		hmap.put(gv6,"Budhgaon siddheshwar mandir");//Budhgaon maruti mandir
		hmap.put(gv7,"padmal kapya mandir");//null
		
		System.out.println("\nSize of Hashmap:"+hmap.size());//5
		
		
		/*GroupOfVillages gv1 = new GroupOfVillages(1, "Bisur");//true
		GroupOfVillages gv2 = new GroupOfVillages(1, "Karnal");//true
		GroupOfVillages gv3 = new GroupOfVillages(3, "Padmal");//true
		GroupOfVillages gv4 = new GroupOfVillages(4, "Budhgaon");//true
		GroupOfVillages gv5 = gv1;//false
		GroupOfVillages gv6 = new GroupOfVillages(4,"Budhgaon");//false
		GroupOfVillages gv7 = new GroupOfVillages(3,"padmal");//true
*/		
		// gv1|Bisur Datta mandir gv2|Karnal dada mandir gv3|Padmal more mandir gv4|Budhgaon maruti mandir gv7|padmal kapya mandir
		// gv1|Bisurcha Pir gv2|Karnal dada mandir gv3|Padmal more mandir gv4|Budhgaon siddheshwar mandir gv7|padmal kapya mandir	
		
		
		System.out.println("\nContent of HashMap:"+hmap);
	
		Set<Entry<GroupOfVillages, String>> setofentries=hmap.entrySet();
		Iterator<Entry<GroupOfVillages, String>> itrent=setofentries.iterator();
		while(itrent.hasNext())
		{
			Entry<GroupOfVillages,String> singleentry=itrent.next();
			System.out.println("Key is :"+singleentry.getKey()+"Value is:"+singleentry.getValue());
			
		}
		
		
		
		
		
		
		
	}
}

class GroupOfVillages{
	
	public GroupOfVillages() {
		super();
	}
	private int VillageId;
	private String VillageName;
	public int getVillageId() {
		return VillageId;
	}
	public void setVillageId(int villageId) {
		VillageId = villageId;
	}
	public String getVillageName() {
		return VillageName;
	}
	public void setVillageName(String villageName) {
		VillageName = villageName;
	}
	@Override
	public String toString() {
		return "GroupOfVillages [VillageId=" + VillageId + ", VillageName=" + VillageName + "]";
	}
	public GroupOfVillages(int villageId, String villageName) {
		super();
		VillageId = villageId;
		VillageName = villageName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + VillageId;
		result = prime * result + ((VillageName == null) ? 0 : VillageName.hashCode());
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
		GroupOfVillages other = (GroupOfVillages) obj;
		if (VillageId != other.VillageId)
			return false;
		if (VillageName == null) {
			if (other.VillageName != null)
				return false;
		} else if (!VillageName.equals(other.VillageName))
			return false;
		return true;
	}
			
	
	
}
