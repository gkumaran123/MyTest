package com.pack.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		ArrayList<Book> books = getBooks();
		System.out.println(books);
		books.stream().filter(book -> {
			return book.getAuthor().startsWith("A");
		}).filter(book -> {
			return book.getTitle().startsWith("M");
		}).forEach(System.out::println);
		System.out.println(Thread.activeCount());
	}

	 static ArrayList<Book> getBooks() {
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book("Mano", "Tamil"));
		books.add(new Book("Anbu", "English"));
		books.add(new Book("Anbu", "Maths"));
		//Java8 Lambda Sorting 
		books.sort((Book b1, Book b2)->b1.getAuthor().compareTo(b2.getAuthor()));
		
		//Annonymous inner class Sorting
		/*
		 * Collections.sort(books, new Comparator<Book>() {
		 * 
		 * @Override public int compare(Book o1, Book o2) { return
		 * o1.getAuthor().compareTo(o2.getAuthor()); }
		 * 
		 * });
		 */
		return books;
	}
}
//Normal Comparator Sorting 


  class bookComparator implements Comparator<Book>{
  
  @Override public int compare(Book o1, Book o2) { return
  o1.getAuthor().compareTo(o2.getAuthor()); }
 
  }
 
