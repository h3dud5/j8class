package com.standardchartered.erp;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList<String> books = new ArrayList<>();
		
		books.add("Java SE >");
		books.add("Java TE");
		books.add("Java UE");
		books.add("Java ME");
		
		//Java 6
		Iterator<String> booksIterator = books.iterator();
		while (booksIterator.hasNext()) {
			String book = booksIterator.next();
			System.out.println(book);
		}
		
		//Java 8
		for (String book : books) {
			System.out.println(book);
		}
		
		// Traditional method
		for (int counter = 0; counter <  books.size(); counter++) {
			String book = books.get(counter);
			System.out.println(book);
		}
		
	}

}
