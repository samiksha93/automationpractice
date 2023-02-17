package Array__;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set__ {

	public static void main(String[] args) {
		Set set1 = new HashSet(); 
		set1.add(null);
		set1.add(1);
		set1.add(2);
		set1.add('s');
		set1.add(1);
		set1.add("hii");
//		System.out.println(set1.hashNext());
		Iterator itr11= set1.iterator();
		System.out.println(set1);
		System.out.println(itr11.hasNext());
		System.out.println(itr11.next());
		System.out.println(itr11.next());
		System.out.println(set1.remove(1));
		System.out.println(set1);
		
//		set1.removeIf(str -> str.contains(2));
	}}

