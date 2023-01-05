package String_class;

public class String_buffer {

	public static void main(String[] args) {
		/*
		 * in string buffer we create object with only  'new' keyword
		 * and perform many operation on it 
		 * append,insert,replace,delete,reverse,capacity
		 */
		StringBuffer s1= new StringBuffer("WELCOME   TO PUNE  ");
		System.out.println(s1.capacity());
		
		s1.append("Hello  ");
		
		System.out.println(s1);
//		s1.reverse();
//		System.out.println(s1);
		s1.insert(9, "Guys");
		System.out.println(s1);
		s1.replace(1, 3, "hii");
		System.out.println(s1);
		s1.delete(1, 4);
		System.out.println(s1);
		s1.insert(1, "el");
		System.out.println(s1);

	}

}
