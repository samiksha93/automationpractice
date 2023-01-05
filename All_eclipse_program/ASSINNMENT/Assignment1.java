package ASSINNMENT;

public class Assignment1 {

	public static void main(String[] args) {
		String first = "    java";
		String second=" is";
		String third =" oops language   ";
		String combine= first+" "+second+" "+third+".";
		System.out.println(first.concat(second).concat(third)); //use concate
		boolean result = first.equals(second); // compare two string
		System.out.println(result);
		System.out.println(combine.replace('a', 'e'));
		System.out.println(combine.concat(" Where oops is object oriented concept"));
		System.out.println(combine.indexOf('o'));
		System.out.println(combine.toUpperCase());
		System.out.println(combine.toLowerCase());
		System.err.println(combine.trim());//it remove white extra space 
		System.out.println(combine.intern());
		System.out.println("*************************************************************************");
		
		StringBuilder str = new StringBuilder();
		str.append(first);
		str.append(second);
		str.append(third);
		System.out.println("This is the stringbuilder string:"+str);
		System.out.println(str.reverse());
		System.out.println(str.length());
	}
	
}
