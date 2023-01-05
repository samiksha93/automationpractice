package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class lambda_expressiom_iterator {

	public static void main(String[] args) {
		ArrayList ls2= new ArrayList();
		ls2.add("apple");
		ls2.add("graps");
		ls2.add("banana");//duplicate value add in arraylist
		ls2.add("graps");
		System.out.println(ls2);
		Collections.sort(ls2);
		System.out.println(ls2);
		
		System.out.println("**************forEach loop******************");
		ls2.forEach(a ->{
			System.out.println(a);
		});
		
		System.out.println("**************iterator******************");
		Iterator itr1=ls2.iterator();
		System.out.println(itr1.hasNext());
		System.out.println(itr1.next());
		System.out.println(itr1.hasNext());
		System.out.println(itr1.next());
		System.out.println(itr1.hasNext());
		System.out.println(itr1.next());
		System.out.println(itr1.hasNext());
		System.out.println(itr1.next());
		System.out.println(itr1.hasNext());
//		System.out.println(itr1.next()); //it give exception becoz no next element to avoid this we use hashNext() method in while loop before using next() method 
		System.out.println("**********************************************");
		while (itr1.hasNext()) {
			System.out.println(itr1.next());}
		System.out.println(itr1.hasNext());
		
		ArrayList<String> ls3=new ArrayList<String>(); //generic
		System.out.println("list is empty or not :"+ls3.isEmpty());
		ls3.add("ankita");
		ls3.add("anshu");
		ls3.add("aanand");
		ls3.add("kuldeep");
		ls2.addAll(ls3);
		ls3.addAll(ls2);
		System.out.println(ls2);
		System.out.println(ls3);
		
		
		System.out.println(ls2);
		ls2.remove(4);
		System.out.println(ls2);
		//		System.out.println(itr1.remove()));
//		ls3.removeIf(str --> str.contains("anshu")
//				System.out.println(ls3););
	}

}
