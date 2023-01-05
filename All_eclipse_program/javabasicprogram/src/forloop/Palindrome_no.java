package forloop;

public class Palindrome_no {

	public static void main(String[] args) {
		int num=457,reverse=0,number=num;
		for(;num!=0;num=num/10) {
			int remainder=num%10;
			reverse=reverse*10+remainder;	
			
			System.out.println(reverse);}
		
		if (reverse==number){
			System.out.println("number is palindrome number " );
			}
		else {
			System.out.println("number is not a palindrome number " );

		}
}
}
