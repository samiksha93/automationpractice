package day40Collection;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
				//or
		List ls1=new ArrayList();
		ls1.add("Java");//Auto up casting, String class object will be converted into Object class object
		ls1.add(new Example1());//Auto up casting
		ls1.add(25);//Auto boxing operation ---> Integer class object ---->Auto up casting ----> Object	class object
		System.out.println("List members: "+ls1);
		
		ls1.add(1, "Pune");
		System.out.println("updated List members: "+ls1);
		System.out.println("1st Index Element is: "+ls1.get(1));
		System.out.println("List element count: "+ls1.size());
		for(int i=0;i<ls1.size();i++) {
			System.out.println("Element at index "+i+" :"+ls1.get(i));
		}
		System.out.println("*************Using for each*****************");
		for(Object obj:ls1) {
			System.out.println(obj);
		}
	}
}
