package Array_assignment;
import java.util.Arrays;
public class Copy_array {

	public static void main(String[] args) {
		int[] a = {23,44,55,5,6,3};
		
		Arrays.sort(a);
		int len=a.length;
		System.out.println("length of array a is :"+len);
		for (int i=0;i<len;i++) {
			System.out.println(a[i]);
		}
		System.out.println("**********************");
		
		for (int sort_value:a) {
			System.out.println(sort_value);
			}
		System.out.println("**********************");
		int sum =0;
		int average;
		for (int b:a) {
			sum=b+sum;
			}
		System.out.println(sum);
		System.out.println("**********************");
		int l =a.length;
		average =sum/l;
		System.out.println(average);
		
		int[] b = {23,44,1,2,3};
		
		}

}
