package com.collectionT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionSet {
	
	static Book b4;
	
	
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
		
		
		
		Book b1 = new Book("Core Java ", 10);
		Book b2 = new Book("Spring ", 10);
		Book b3 = new Book("Hibernate ", 9);
		Book b4 = new Book("Spring ", 10);
		Book b5=b1;
		
		HashSet<Book> setOfBook = new HashSet<>();
		
		System.out.println(setOfBook.add(b1));//true
		System.out.println(setOfBook.add(b2));//true
		System.out.println(setOfBook.add(b3));//true
		System.out.println(setOfBook.add(b4));//false	as hashset didnt allow to add repeated thing also we added equals and hashset methods override
		System.out.println(setOfBook.add(b5));//false  since b1 is pointed to same reference
		
		System.out.println("Size of HashSet"+setOfBook.size());//3
		System.out.println("Contents of hashset"+setOfBook);
		
		
		
		/*
		 * 
		 * 
		 * 
		Book b1 = new Book("Core Java ", 10);//true
		Book b2 = new Book("Spring ", 10);//true
		Book b3 = new Book("Hibernate ", 9);//true
		Book b4 = new Book("Spring ", 10);//false
		Book b5=b1;						//false
		 * 
		 */
		
		
		HashMap<Book,String> mapOfBooks = new HashMap<>();
		System.out.println(mapOfBooks.put(b1,"JavaDev1")); //null    as string is return type and put method always returns previous value associated to key
		System.out.println(mapOfBooks.put(b2,"SpringFramework2"));//null
		System.out.println(mapOfBooks.put(b3,"ORMFramewordk3"));//null
		System.out.println(mapOfBooks.put(b4,"ORMFramewordk4"));//SpringFramework2
		System.out.println(mapOfBooks.put(b5,"ORMFramewordk5"));//JavaDev1
		
//	content of hashmap when both methods overrided	b1|JavaDev1   b2|SpringFramework2   b3|ORMFramework3  ---> 	b1|ORMFramewordk5   b2|ORMFramewordk4   b3|ORMFramework3  
		
		
		System.out.println("Size of HashMap"+mapOfBooks.size());//3 because it is based on hashmap keys and not value
		System.out.println("Contents of hashmap"+mapOfBooks);//?      // contents of map always gives latest values ie vice-versa of put method
		
	
	
		printCollectionInfo(mapOfBooks);
	
	}
	
	
	
private static void printCollectionInfo(HashMap<Book, String> mapOfBooks) {
		
		System.out.println("\n\n");
		
		System.out.println("#########Using KeySet##################");
		Set<Book> setOfBooks =  mapOfBooks.keySet();
		Iterator<Book> itrB = setOfBooks.iterator();
		while(itrB.hasNext()){
			Book key = itrB.next();
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
		Set<Entry<Book,String>> setOfMapEntries = mapOfBooks.entrySet();
		Iterator<Entry<Book,String>> entryItr = setOfMapEntries.iterator();
		while(entryItr.hasNext()){
			Entry<Book,String> entry = entryItr.next();
			System.out.println("Key --"+entry.getKey() +" :: " +"Value -- "+entry.getValue());
			
			
		}
		
		
		
		
		
		
	}
	

}




class Book
{
			
		String BookName;
		int BookId;
		
		
		
		
		@Override
		public String toString() {
			return "Book [BookName=" + BookName + ", BookId=" + BookId + "]";
		}
		public String getBookName() {
			return BookName;
		}
		public void setBookName(String bookName) {
			BookName = bookName;
		}
		public Book(String bookName, int bookId) {
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
		@Override
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
			Book other = (Book) obj;
			if (BookId != other.BookId)
				return false;
			if (BookName == null) {
				if (other.BookName != null)
					return false;
			} else if (!BookName.equals(other.BookName))
				return false;
			return true;
		}
		
		
		
		
		
	


}




