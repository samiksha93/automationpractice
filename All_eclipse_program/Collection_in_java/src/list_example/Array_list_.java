package list_example;

import java.util.ArrayList;

//method used :add(),size(),get(),set()

public class Array_list_ {

	public static void main(String[] args) {
		ArrayList ls1= new ArrayList();
		ls1.add("java"); //auto upcasting --> becoz parent class of string class  is object class 
		ls1.add(1234);  // autoboxing ---> change in Integer object-->autoupcasting 
		ls1.add(new Array_list_()); //autoupcasting --->becoz parent class of array_list class is object class
		System.out.println("array list is:"+ls1);
		
		ls1.add(1, "arraylist program");
		System.out.println("array list is:"+ls1);
		ls1.add(1, 1000000);
		System.out.println("array list is:"+ls1);
		
		System.out.println("array list is:"+ls1.size());
		
		ls1.add(null);  //we add null value in arraylist
		System.out.println("array list size after adding null:"+ls1.size());
		
		System.out.println("get element of arraylist based on index: "+ls1.get(1));
		
		System.out.println("******************using for loop*******************");
		
		for (int i=0;i<ls1.size();i++) {
			System.out.println(" Element of arraylist index  "+i+"  -->  "+ls1.get(i));
		}
		System.out.println("*************using for each loop*********************");
		for (Object l:ls1) {
			System.out.println(l);
		}
		
		ls1.set(1, "is");
		System.out.println("Arraylist :"+ls1);
	}

}
