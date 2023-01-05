package String_class;

public class StringtoInteger {

	public static void main(String[] args) {
		String s1="rehli"+17287389;
		String s2="sagar";
		String s3 ="100";
				
//		int sum =s1+100; // compile time error becoz foe integer type we can not deal with stirng
				
	
		System.out.println(s1);
		System.out.println(s2);
		
		 /*
	 	if any string object has integer value and if we use this integer for another integer operation 
		than we convert it into integer form with the help of " Integer.parseInt(s2); " method .
		 **/
		int num = Integer.parseInt(s3);
		System.out.println(num);
		int sum = num+100;
		System.out.println(sum);
	}

}
