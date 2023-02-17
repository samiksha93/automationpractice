package list_example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Book {
	int id;
	String name, author, publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}
public class Array_Example1 {

	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();//Generic
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(new Book(104, "Let us Code it", "xyz", "pqr", 5));
		System.out.println("List of Book class elements: "+list);
		System.out.println(list.get(0).name);
		//				   b1.name
		System.out.println(b1.name);
		// Traversing list
		for (Book b : list) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
		ArrayList ls = new ArrayList();

		
		ls.add((double)123);
		ls.add(1.2);
		ls.add(2.45657474);
		Collections.sort(ls);
		System.out.println(ls);
		
		
	}

	}


