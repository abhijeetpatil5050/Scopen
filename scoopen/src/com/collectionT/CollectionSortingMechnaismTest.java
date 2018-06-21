package com.collectionT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortingMechnaismTest {
	
	
	public static void main(String[] args) {
		
			List<Integer> list = new ArrayList<>();
			
			list.add(20);
			list.add(20);
			list.add(10);
			list.add(30);
			
			System.out.println("Before Sort:"+list);
			Collections.sort(list);
			System.out.println("After Sort:"+list);
			
			
			
			Car c1 = new Car(4, "swift", 800000);
			Car c2 = new Car(2, "Swift-Dzire", 900000);
			Car c3 = new Car(3, "I20", 850000);
			Car c4 = new Car(1, "1Polo", 950000);
			
			List<Car> clist = new ArrayList<>();
			
			clist.add(c1);
			clist.add(c2);
			clist.add(c3);
			clist.add(c4);
			
			System.out.println("\n Before Sorting:"+clist);
			
			/*Collections.sort(clist);//using comparable
			
			//System.out.println(" After Ascending Sorting id base Using Comparable :"+clist);
			//System.out.println(" After Decending Sorting id based Using Comparable :"+clist);
			
			//System.out.println(" After Ascending Sorting name based Using Comparable :"+clist);
			//System.out.println(" After Decending Sorting name based Using Comparable :"+clist);
			
			System.out.println(" After Ascending Sorting price based Using Comparable :"+clist);
			//System.out.println(" After Decending Sorting price based Using Comparable :"+clist);
*/	
			//Collections.sort(clist,new CarPrice());//using comparator
			//System.out.println(" After Ascending Sorting price based Using Comparator :"+clist);
			//System.out.println(" After Decending Sorting price based Using Comparator :"+clist);
			
			//Collections.sort(clist,new CarName());//using comparator
			//System.out.println(" After Ascending Sorting name based Using Comparator :"+clist);
			//System.out.println(" After Decending Sorting name based Using Comparator :"+clist);
			
			Collections.sort(clist,new CarId());//using comparator
			System.out.println(" After Ascending Sorting id based Using Comparator :"+clist);
			//System.out.println(" After Decending Sorting id based Using Comparator :"+clist);
			
	}
	
}

class CarPrice implements Comparator<Car>
{

	@Override
	public int compare(Car o1, Car o2) {
		
		//return (int) (o1.getCarPrice()-o2.getCarPrice());//price base ascending sorting with comparator
		return (int) (o2.getCarPrice()-o1.getCarPrice());//price base decending sorting with comparator
		
	}
}


class CarName implements Comparator<Car>
{

	@Override
	public int compare(Car o1, Car o2) {
		
		return o1.getCarName().compareTo(o2.getCarName());//name base ascending sorting with comparator
		//return o2.getCarName().compareTo(o1.getCarName());//name base decending sorting with comparator
	}
	

}


class CarId implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		
		return o1.getCarId()-o2.getCarId();//Ascending Sorting id base Using comparator 
		//return o2.getCarId()-o1.getCarId();//Decending Sorting id base Using comparator 
	}
	
	
}


class Car{ //implements Comparable<Car>{
	private int carId;
	private String carName;
	private long carPrice;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public long getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(long carPrice) {
		this.carPrice = carPrice;
	}
	public Car() {
		super();
	}
	public Car(int carId, String carName, long carPrice) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carPrice = carPrice;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", carPrice=" + carPrice + "]";
	}
	/*
	@Override
	public int compareTo(Car o) {
		//return this.getCarId()-o.getCarId();//id base ascending sorting with comparable
		//return o.getCarId()-this.getCarId();//id base descending sorting with comparable
		
		//return this.getCarName().compareTo(o.getCarName());//name base ascending sorting with comparable
		//return o.getCarName().compareTo(this.getCarName());//name base decending sorting with comparable
		
		return (int) (this.getCarPrice()-o.getCarPrice());//price base ascending sorting with comparable
		//return (int) (o.getCarPrice()-this.getCarPrice());//price base decending sorting with comparable
		
		
	}*/
	
	
	
}

