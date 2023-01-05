package String_class;

public class Substring {
	
//	static String subset_of_string(String str) {
//		return 
//	}

	public static void main(String[] args) {
		String name=new String ("		Welcome to pune khardi for luxury flats		");
		String age="";
		System.out.println(name.length());// find length of string

		System.out.println(name.substring(3,7));// string divide in subset
		System.out.println(name.indexOf('e')); // it shows starting index of that  character
		System.out.println(name.lastIndexOf('e'));// it shows last index of that charcter
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
		System.out.println(name.trim().length());
		System.out.println(name.isEmpty()); // false  // it check string is empty or not 
		System.out.println(age.isEmpty()); //true
		String replace_1= name.replace("to", "from"); // it replace character or string 
		System.out.println(replace_1);

		// Checking equality of Strings
        String s6="Selenium";
        String s7="selenium";
        String s8="Selenium";
        System.out.println("Checking Equality of s6 & s7: " + s6.equals(s7));//
        System.out.println("Checking Equality of s6 & s8: " + s6.equals(s8));//
        System.out.println("Checking Equality of s6 & s7 with Ignore case: " + s6.equalsIgnoreCase(s7));//
        
        // split method 
        String[] straray= name.split("",6);
        for (String s: straray) {
        	System.out.println(s);
        }
        
       
        		

	}

}
