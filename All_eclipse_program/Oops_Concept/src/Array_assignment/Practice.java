package Array_assignment;
import java.util.Arrays; 

public class Practice {
	
	public static void main(String[] args) {
		int[] my_array1 = {111,2,3,4,5,6,7,8,9,10};
		
		Arrays.sort(my_array1);
		
		for (int s1:my_array1) {
			System.out.println(s1);
		}
		System.out.println("*************************************");
		String[] my_array2 = {"kuldeep","juhi","anshu","aanand"};
		Arrays.sort(my_array2);
		 System.out.println("Sorted string array : "+Arrays.toString(my_array2));
		 
		 // print "-" using simple for loop
		 char dash='-';
		 
		 for (int i=0;i<=9;i++) {
			 for (int j=1;j<=8;j++) {
				 System.out.print(dash+" ");
			 }
			 System.out.println("  ");
			 }
		 
		// print "-" using simple Array
		 int[][] my_array3= new int[10][10];	
		 for(int i = 0; i < 10; i++)
		 {
		    for(int j = 0; j < 10; j++)
		    {
		       System.out.printf("%2d ", my_array3[i][j]);
		    }
		    System.out.println();
		 }
		 
		 
		 int[] my_array4= {2,3,4,1,5,6};
		 int[] my_array5=new int [5];
		 
		 
		
		 
		 
		 System.arraycopy( my_array4, 0, my_array5 , 1, 4);
		 System.out.println("Sorted string array : "+Arrays.toString(my_array5));
		 
		 
		 int item = 1011;
		 for (int k:my_array4) {
			 if (k == item) {
				  System.out.println("Good day.");
				} else {
				  System.out.println("Good evening.");
				}
			 
				 
			 }
					 
			 
		 }
			 
		 }
		

	


