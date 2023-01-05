package String_class;

public class Example1 {

	public static void main(String[] args) {
		String s1="mumbai";
		String s2 ="Bangalore";
		String s3 ="mumbai";
//		String s4 =new String("banglore");
//		System.out.println("banglore first charecter  is :    "+s4.charAt(0));
//		System.out.println("banglore first charecter  is :    "+s4.charAt(1));
//		System.out.println("banglore first charecter  is :    "+s4.charAt(2));
//		System.out.println("banglore first charecter  is :    "+s4.charAt(3));
//		System.out.println("banglore first charecter  is :    "+s4.charAt(4));
//		System.out.println("banglore first charecter  is :    "+s4.charAt(5));
//		System.out.println("banglore first charecter  is :    "+s4.charAt(6));
//		System.out.println("banglore first charecter  is :    "+s4.charAt(7));
//		
		//or print every characteer by using for loop 
		
		for (int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));	}
		
		System.out.println("************************************");
		
		
		String temp1="";
		for (int k=s1.length()-1;k>=0;k--) {
			temp1=temp1+s1.charAt(k);
			}
		System.out.println(temp1);
		
		
		System.out.println("************************************");	
		
		
		String temp2="";
		for (int x=s2.length()-1;x>=0;x--) {
			temp2=temp2+s2.charAt(x);
		}
		System.out.println(temp2);
		
		
		System.out.println("************************************");
		
		
		String s5 =new String ("pune");
		String temp3="";
		for (int j=s5.length()-1;j>=0;j--) {
			temp3=temp3+s5.charAt(j);
		}
		System.out.println(temp3);
		

		System.out.println("************************************");
		
		
		System.out.println("Compare s1 and s2 object based on address: "+(s1==s2));
		System.out.println("Compare s2 and s3 object based on address: "+(s3==s2));
		System.out.println("Compare s1 and s3 object based on address: "+(s1==s3));
		System.out.println("Compare s1 and s2 object based on value: "+s1.equals(s2));
		System.out.println("Compare s2 and s3 object based on value: "+s3.equals(s2));
		System.out.println("Compare s1 and s3 object based on address: "+(s1.equals(s3)));
		

	}

}
