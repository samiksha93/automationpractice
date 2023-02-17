package Vector__;

import java.util.Vector;

public class Example_vector {

	public static void main(String[] args) {
		Vector<String> vec= new Vector<String>();
		vec.add("ram");
		vec.add("sita");
		vec.add("radha");
		vec.add("krishna");
		vec.addElement("shiv");
		vec.addElement("parvati");
		System.out.println("size of vector:"+vec.size());
		System.out.println("Element of vector collection:"+vec);
		for (String str : vec) {
			System.out.println(str);
		}
		Vector<Integer> vec1= new Vector <Integer>();
		System.out.println("size of vector1 is :   "+vec1.size());
		System.out.println("Element of vector1 collection:"+vec1);
		vec1.setSize(2);
		System.out.println("size of vector1 is :   "+vec1.size());
		System.out.println("Element of vector1 collection:"+vec1);
		vec1.add(123);
		vec1.add(456);
		vec1.add(890);
		System.out.println("Element of vector1 collection:"+vec1);
		System.out.println(vec1.capacity());
}}
