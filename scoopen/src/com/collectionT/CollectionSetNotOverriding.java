package com.collectionT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionSetNotOverriding {
	
	
	
	
	public static void main(String[] args) {
		
		HashSet<Integer> setOfInt = new HashSet<>();
			setOfInt.add(10);
			setOfInt.add(20);
			setOfInt.add(10);
			setOfInt.add(12);
			setOfInt.add(new Integer(10));
			setOfInt.add(new Integer(20));
		System.out.println(setOfInt.size());//3
		
		HashSet<String> setOfString = new HashSet<>();
			setOfString.add("A");
			setOfString.add("A");
			setOfString.add("A");
			setOfString.add("A");
			setOfString.add("A");
		System.out.println(setOfString.size());//1
		
		
		
		Book1 b1 = new Book1("Core Java ", 10);
		Book1 b2 = new Book1("Spring ", 10);
		Book1 b3 = new Book1("Hibernate ", 9);
		Book1 b4 = new Book1("Spring ", 10);
		Book1 b5=b1;
		
		HashSet<Book1> setOfBook = new HashSet<>();
		
		System.out.println(setOfBook.add(b1));//true
		System.out.println(setOfBook.add(b2));//true
		System.out.println(setOfBook.add(b3));//true
		System.out.println(setOfBook.add(b4));//true
		System.out.println(setOfBook.add(b5));//false
		
		System.out.println("Size of HashSet"+setOfBook.size());//4
		System.out.println("Contents of hashset"+setOfBook);//-->[Book1 [BookName=Core Java , BookId=10], Book1 [BookName=Spring , BookId=10], Book1 [BookName=Hibernate , BookId=9], Book1 [BookName=Spring , BookId=10]]
		
		
		/*
		 * 
		 * 
		 * 
		Book1 b1 = new Book1("Core Java ", 10);//true
		Book1 b2 = new Book1("Spring ", 10);//true
		Book1 b3 = new Book1("Hibernate ", 9);//true
		Book1 b4 = new Book1("Spring ", 10);//true
		Book1 b5=b1;						//false
		 * 
		 */
		
		HashMap<Book1,String> mapOfBooks = new HashMap<>();
		System.out.println(mapOfBooks.put(b1,"JavaDev1")); //null
		System.out.println(mapOfBooks.put(b2,"SpringFramework2"));//null
		System.out.println(mapOfBooks.put(b3,"ORMFramewordk3"));//null
		System.out.println(mapOfBooks.put(b4,"ORMFramewordk4"));//null
		System.out.println(mapOfBooks.put(b5,"ORMFramewordk5"));//JavaDev1
		
		//	b1|JavaDev1   b2|SpringFramework2   b3|ORMFramework3   b4|ORMFramework4  -->  b1|ORMFramewordk5   b2|ORMFramewordk4   b3|ORMFramework3   b4|SpringFramework2
		
		
		System.out.println("Size of HashMap"+mapOfBooks.size());//4 because it is based on hashmap keys and not values
		System.out.println("Contents of hashmap"+mapOfBooks);//-->[Book1 [BookName=Core Java , BookId=10]=JavaDev1(ORMFramewordk5), Book1 [BookName=Spring , BookId=10]=SpringFramework2(), Book1 [BookName=Hibernate , BookId=9]=ORMFramewordk3(ORMFramewordk3), Book1 [BookName=Spring , BookId=10]=ORMFramewordk4]
		
	
	
		printCollectionInfo(mapOfBooks);
	
	}
	
	
	
private static void printCollectionInfo(HashMap<Book1, String> mapOfBooks) {
		
		System.out.println("\n\n");
		
		System.out.println("#########Using KeySet##################");
		Set<Book1> setOfBooks =  mapOfBooks.keySet();
		Iterator<Book1> itrB = setOfBooks.iterator();
		while(itrB.hasNext()){
			Book1 key = itrB.next();
			System.out.println("Key --" +key +" :: " +"Value --" +mapOfBooks.get(key)) ;
		}
		
		
		System.out.println("#########Using Values##################");
		Collection<String> listOfValues =mapOfBooks.values();
		List<String> listOfVal = new ArrayList<String>(listOfValues);
		Iterator<String> itr = listOfVal.iterator();
		while(itr.hasNext()){
			String val= itr.next();
			//System.out.println("Key --" +key);
			System.out.println("Value --" +val);
		}
		
		
		System.out.println("#########Using EntrySet##################");
		Set<Entry<Book1,String>> setOfMapEntries = mapOfBooks.entrySet();
		Iterator<Entry<Book1,String>> entryItr = setOfMapEntries.iterator();
		while(entryItr.hasNext()){
			Entry<Book1,String> entry = entryItr.next();
			System.out.println("Key --"+entry.getKey() +" :: " +"Value -- "+entry.getValue());
			
			
		}
		
		
		
		
		
		
	}
	

}

class Book1

{
			
		String BookName;
		int BookId;
		
		
		
		
		@Override
		public String toString() {
			return "Book1 [BookName=" + BookName + ", BookId=" + BookId + "]";
		}
		public String getBookName() {
			return BookName;
		}
		public void setBookName(String bookName) {
			BookName = bookName;
		}
		public Book1(String bookName, int bookId) {
			super();
			BookName = bookName;
			BookId = bookId;
		}
		public int getBookId() {
			return BookId;
		}
		public void setBookId(int bookId) {
			BookId = bookId;
		}
		/*@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + BookId;
			result = prime * result + ((BookName == null) ? 0 : BookName.hashCode());
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
			Book1 other = (Book1) obj;
			if (BookId != other.BookId)
				return false;
			if (BookName == null) {
				if (other.BookName != null)
					return false;
			} else if (!BookName.equals(other.BookName))
				return false;
			return true;
		}*/
		
		
		
		
		
	


}





