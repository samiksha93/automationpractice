package String_class;

public class String_builder {

	public static void main(String[] args) {
		StringBuilder s2 =new StringBuilder("Hiii I m Samiksha");
		StringBuilder s3 =new StringBuilder("Hii I m Ashish");
		StringBuilder s4 =new StringBuilder("Hiii I m Samiksha");
		System.out.println(s4.equals(s3));//compare based on the address
		System.out.println(s2.equals(s4));// compare two object based on their address
		System.out.println(s2==s4);// compare object based on their value
		System.out.println((s2.toString()).equals(s4.toString()));//compare two object based on their value
		
		
		
		
	}

}
//We don't have any method in StringBuffer and StringBuilder to compare object values, so to overcome that
		//first convert StringBuffer/StringBuilder to String class using '' toString()''.
		// than use equals() of string class
		

