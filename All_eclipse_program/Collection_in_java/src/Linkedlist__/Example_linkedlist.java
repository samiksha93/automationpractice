package Linkedlist__;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example_linkedlist {

	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("a");
		ls.add("b");
		ls.add("c");
		ls.addFirst("x");
		ls.addLast("z");
		System.out.println(ls);
		Iterator<String> itr = ls.iterator();
		
		System.out.println("hasnext()method:"+itr.hasNext());
		System.out.println("next method:"+itr.next());
		
		ListIterator<String> itr1 = ls.listIterator();
		System.out.println(ls);
		System.out.println("hasnext()method:"+itr1.hasNext());
		System.out.println("next method:"+itr1.next());
		System.out.println("next method:"+itr1.next());
		System.out.println("hasprevoius()method:"+itr1.hasPrevious());
		System.out.println(itr1.previous());
		
		while(itr1.hasPrevious()) {
		System.out.println("hasprevoius()method:"+itr1.hasPrevious());
		System.out.println(itr1.previous());}
		
	}

}
