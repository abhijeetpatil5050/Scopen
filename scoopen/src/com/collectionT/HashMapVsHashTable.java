package com.collectionT;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapVsHashTable {
	
	
	
public static void main(String[] args) {
	
	
	VotingPrabhagCentre vpc1 = new VotingPrabhagCentre(1, "laxmiNagar");
	VotingPrabhagCentre vpc2 = new VotingPrabhagCentre(2, "yaswantnagar");
	VotingPrabhagCentre vpc3 = new VotingPrabhagCentre(3, "malbangla");
	VotingPrabhagCentre vpc4 = new VotingPrabhagCentre(4, "wakharbag");
	VotingPrabhagCentre vpc5 = new VotingPrabhagCentre(5, "burud galli");
	VotingPrabhagCentre vpc6 = new VotingPrabhagCentre(6, "gaon bag");
	VotingPrabhagCentre vpc7 = new VotingPrabhagCentre(7, "malgalvar peth");
	VotingPrabhagCentre vpc8 = vpc7;
	
	
	ConcurrentHashMap<K, V>
	
	
	//HashMap<VotingPrabhagCentre, String> hmap = new HashMap<>();
	
	Hashtable<VotingPrabhagCentre, String> hmap = new Hashtable<>();
	
	hmap.put(null,"sososoosososso");
	//hmap.put(null,"sososoosoppppp");
	hmap.put(vpc1,"SakaharkarkhanaSide");
	hmap.put(vpc2,"KupwadSide");
	hmap.put(vpc3,"RtoSide");
	hmap.put(vpc4,"fishmarketSide");
	hmap.put(vpc5,"karnalroad");
	hmap.put(vpc6,"cityhighschoolSide");
	hmap.put(vpc7,"madhavnagarSide");
	System.out.println(hmap.put(vpc7,"nunnaside"));
	
	
	
	
	
	
	
	//hmap.put(null, null);//allowed single null key
	//hmap.put(vpc8, "sososoryr");//duplicate key not allowed

	System.out.println("\n\n"+hmap);
	
	
	
	
	
	
}

}


class VotingPrabhagCentre
{
	
	private int PrabhagId;
	private String PrabhagName;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + PrabhagId;
		result = prime * result + ((PrabhagName == null) ? 0 : PrabhagName.hashCode());
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
		VotingPrabhagCentre other = (VotingPrabhagCentre) obj;
		if (PrabhagId != other.PrabhagId)
			return false;
		if (PrabhagName == null) {
			if (other.PrabhagName != null)
				return false;
		} else if (!PrabhagName.equals(other.PrabhagName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "VotingPrabhagCentre [PrabhagId=" + PrabhagId + ", PrabhagName=" + PrabhagName + "]";
	}
	public VotingPrabhagCentre(int prabhagId, String prabhagName) {
		super();
		PrabhagId = prabhagId;
		PrabhagName = prabhagName;
	}
	public int getPrabhagId() {
		return PrabhagId;
	}
	public void setPrabhagId(int prabhagId) {
		PrabhagId = prabhagId;
	}
	public String getPrabhagName() {
		return PrabhagName;
	}
	public void setPrabhagName(String prabhagName) {
		PrabhagName = prabhagName;
	}
	public VotingPrabhagCentre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}




