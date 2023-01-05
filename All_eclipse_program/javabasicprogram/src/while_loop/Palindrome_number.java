package while_loop;

public class Palindrome_number {

	public static void main(String[] args) {
		int a=545 ,reverse=0,number=a;
		while (a!=0) {
			
			int remainder=a%10;
			reverse=reverse*10+remainder;
			a=a/10;
		
		}
			
		if (number==reverse){
			System.out.println("the number is a palindrom number");
		}else {
			System.out.println("the number is not a palindrom number");
			}
		
	}
}